package br.com.isa56.hackathonlabcv.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthInvalidUserException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseAuthWeakPasswordException;

import br.com.isa56.hackathonlabcv.R;
import br.com.isa56.hackathonlabcv.config.FirebaseConfig;
import br.com.isa56.hackathonlabcv.helper.FirebaseUserHelper;
import br.com.isa56.hackathonlabcv.model.User;

public class MainActivity extends AppCompatActivity {

    protected Button loginButton;
    protected Button createAccountButton;
    protected String usernameText;
    private TextInputEditText emailText, passwordText;

    public FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.loginButton);
        createAccountButton = findViewById(R.id.GoToCreateAccount);

        emailText = findViewById(R.id.inputEmailText);
        passwordText = findViewById(R.id.inputPasswordText);

        auth = FirebaseConfig.getFirebaseAuth();

        createAccountButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CreateAccountActivity.class);
                startActivity(intent);
            }
        });

    }
/*    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUserHelper.RedirectLoggedUser(MainActivity.this);
    }*/

    public void userLogin(View view){
            String textEmail = emailText.getText().toString();
            String textPassword = passwordText.getText().toString();
            // OK

            if(!textEmail.isEmpty()){
                if(!textPassword.isEmpty()){
                    User user = new User();
                    user.setEmail(textEmail);
                    user.setPassword(textPassword);
                    logUser(user);
                }
                else{
                    Toast.makeText(MainActivity.this, "Preencha a senha!", Toast.LENGTH_SHORT).show();
                }

            }
            else{
                Toast.makeText(MainActivity.this, "Preencha o e-mail!", Toast.LENGTH_SHORT).show();
            }

        }

        public void logUser(User user) {

            auth = FirebaseConfig.getFirebaseAuth();

            // user chega aqui com e-mail e senha

            auth.signInWithEmailAndPassword(
                    user.getEmail(), user.getPassword()
            ).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        FirebaseUserHelper.RedirectLoggedUser(MainActivity.this);
                    }
                    else {
                        String ex = "";
                        try {
                            throw task.getException();
                        }
                        catch (FirebaseAuthInvalidUserException e) {
                            ex = "Usuário não está cadastrado.";
                        }
                        catch (FirebaseAuthInvalidCredentialsException e) {
                            ex = "E-mail e senha não correspondem a um usuário cadastrado.";
                        }
                        catch (Exception e) {
                            ex = "Erro ao logar usuário: " + e.getMessage();
                            Log.d("DESESPERO DO LOGIN", "onComplete: " + e);
                            e.printStackTrace();
                        }
                        Toast.makeText(MainActivity.this,
                                ex,
                                Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
        



}