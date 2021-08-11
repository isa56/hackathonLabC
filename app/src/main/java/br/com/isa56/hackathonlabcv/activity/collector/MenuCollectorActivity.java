package br.com.isa56.hackathonlabcv.activity.collector;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import br.com.isa56.hackathonlabcv.R;
import br.com.isa56.hackathonlabcv.activity.CreateAccountActivity;
import br.com.isa56.hackathonlabcv.activity.MainActivity;
import br.com.isa56.hackathonlabcv.activity.patient.FollowHomeExamPatient;

public class MenuCollectorActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collector_menu);
        Toast.makeText(MenuCollectorActivity.this, "Tela em desenvolvimento...", Toast.LENGTH_LONG).show();

    }

    public void openCollectorDataActivity(View view){
        Intent intent = new Intent(MenuCollectorActivity.this, CollectorDataActivity.class);
        startActivity(intent);
    }

}
