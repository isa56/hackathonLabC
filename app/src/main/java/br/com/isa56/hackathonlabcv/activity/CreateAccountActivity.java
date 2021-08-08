package br.com.isa56.hackathonlabcv.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import br.com.isa56.hackathonlabcv.R;
import br.com.isa56.hackathonlabcv.config.FirebaseConfig;
import br.com.isa56.hackathonlabcv.model.User;

public class CreateAccountActivity extends AppCompatActivity  {

    private TextInputEditText nameText, emailText, passwordText;
    private Switch choice;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        nameText = findViewById(R.id.inputName);
        emailText = findViewById(R.id.EmailInput);
        passwordText = findViewById(R.id.PasswordInput);
        choice = findViewById(R.id.choice);

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
                    String idUser = task.getResult().getUser().getUid();
                    user.setId(idUser);
                    user.save();

                    if(verifyUserType() == "P"){    // Paciente
                        startActivity(new Intent(CreateAccountActivity.this, MenuPacientActivity.class));
                        finish();
                        Toast.makeText(CreateAccountActivity.this, "Sucesso ao cadastrar paciente!", Toast.LENGTH_SHORT).show();
                    }
                    else{   // Equipe
                        startActivity(new Intent(CreateAccountActivity.this, MenuTeamActivity.class));
                        finish();
                        Toast.makeText(CreateAccountActivity.this, "Sucesso ao cadastrar membro da equipe!", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
    }

    public String verifyUserType(){
        return choice.isChecked() ? "T": "P";   // P = Paciente, T = Equipe
    }

}

