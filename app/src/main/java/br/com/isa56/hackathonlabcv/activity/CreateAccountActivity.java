package br.com.isa56.hackathonlabcv.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseAuthWeakPasswordException;


import br.com.isa56.hackathonlabcv.R;
import br.com.isa56.hackathonlabcv.activity.admin.MenuAdminActivity;
import br.com.isa56.hackathonlabcv.activity.collector.MenuCollectorActivity;
import br.com.isa56.hackathonlabcv.activity.patient.MenuPatientActivity;
import br.com.isa56.hackathonlabcv.config.FirebaseConfig;
import br.com.isa56.hackathonlabcv.helper.FirebaseUserHelper;
import br.com.isa56.hackathonlabcv.model.User;



public class CreateAccountActivity extends AppCompatActivity  {

    private TextInputEditText nameText, emailText, passwordText;
    private FirebaseAuth auth;
    private CheckBox pacientCheck, collectorCheck, adminCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        nameText = findViewById(R.id.inputName);
        emailText = findViewById(R.id.EmailInput);
        passwordText = findViewById(R.id.PasswordInput);
        pacientCheck = findViewById(R.id.pacientCheckBox);
        collectorCheck = findViewById(R.id.collectorCheckbox);
        adminCheck = findViewById(R.id.adminCheckbox);

    }

    public void validateCreateAccount(View view){

        String textName = nameText.getText().toString();
        String textEmail = emailText.getText().toString();
        String textPassword = passwordText.getText().toString();

        if(!textName.isEmpty()){
            if(!textEmail.isEmpty()){
                if(!textPassword.isEmpty()){
                    User user = new User();

                    user.setName(textName);
                    user.setEmail(textEmail);
                    user.setPassword(textPassword);
                    user.setType(verifyUserType());
                    saveUser(user);
                }
                else{
                    Toast.makeText(CreateAccountActivity.this, "Preencha todos os dados!", Toast.LENGTH_SHORT).show();
                }
            }
            else{
                Toast.makeText(CreateAccountActivity.this, "Preencha todos os dados!", Toast.LENGTH_SHORT).show();
            }
        }
        else{
            Toast.makeText(CreateAccountActivity.this, "Preencha todos os dados!", Toast.LENGTH_SHORT).show();
        }
    }

    public void saveUser(User user){
        auth = FirebaseConfig.getFirebaseAuth();
        auth.createUserWithEmailAndPassword(
                user.getEmail(),
                user.getPassword()
        ).addOnCompleteListener(CreateAccountActivity.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if(task.isSuccessful()){

                    try {
                        String idUser = task.getResult().getUser().getUid();
                        user.setId(idUser);
                        user.save();

                        FirebaseUserHelper.updateUserName(user.getName());

                        if (verifyUserType() == "P") {    // Paciente
                            startActivity(new Intent(CreateAccountActivity.this, MenuPatientActivity.class));
                            finish();
                            Toast.makeText(CreateAccountActivity.this, "Sucesso ao cadastrar paciente!", Toast.LENGTH_SHORT).show();
                        } else if (verifyUserType() == "C") {   // Coletor
                            startActivity(new Intent(CreateAccountActivity.this, MenuCollectorActivity.class));
                            finish();
                            Toast.makeText(CreateAccountActivity.this, "Sucesso ao cadastrar coletor!", Toast.LENGTH_SHORT).show();
                        } else if (verifyUserType() == "A"){
                            startActivity(new Intent(CreateAccountActivity.this, MenuAdminActivity.class));
                            finish();
                            Toast.makeText(CreateAccountActivity.this, "Sucesso ao cadastrar gestor!", Toast.LENGTH_SHORT).show();
                        }
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }

                }
                else{
                    String excep = "";
                    try {
                        throw task.getException();
                    }catch ( FirebaseAuthWeakPasswordException e){
                        excep = "Digite uma senha mais forte!";
                    }catch ( FirebaseAuthInvalidCredentialsException e){
                        excep= "Por favor, digite um e-mail válido";
                    }catch ( FirebaseAuthUserCollisionException e){
                        excep = "Este conta já foi cadastrada";
                    }catch (Exception e){
                        excep = "Erro ao cadastrar usuário: "  + e.getMessage();
                        e.printStackTrace();
                    }

                    Toast.makeText(CreateAccountActivity.this,
                            excep,
                            Toast.LENGTH_SHORT).show();

                }
            }
        });
    }

    public String verifyUserType(){
        if(pacientCheck.isChecked()){
            return "P";
        }
        else if(collectorCheck.isChecked()){
            return "C";
        }
        else
            return "A";
    }

}

