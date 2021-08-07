package br.com.isa56.hackathonlabcv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    public Button loginButton;
    public Button createAccountButton;
    public TextInputEditText user;
    public TextInputEditText password;

    public String userAdmin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.loginButton);
        createAccountButton = findViewById(R.id.GoToCreateAccount);
        user = findViewById(R.id.inputPhoneText);
        password = findViewById(R.id.inputPasswordField);
        userAdmin = user.getText().toString();

        loginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);

                intent.putExtra("username", userAdmin);

                startActivity(intent);
            }});

        createAccountButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CreateAccountActivity.class);
                startActivity(intent);
            }
        });
    }

}