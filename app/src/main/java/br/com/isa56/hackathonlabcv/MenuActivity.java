package br.com.isa56.hackathonlabcv;

import android.content.Intent;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    Intent i = getIntent();
    String username = i.getStringExtra("username");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }



}
