package br.com.isa56.hackathonlabcv.activity.admin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import br.com.isa56.hackathonlabcv.R;
import br.com.isa56.hackathonlabcv.activity.collector.CollectorDataActivity;
import br.com.isa56.hackathonlabcv.activity.collector.MenuCollectorActivity;
import br.com.isa56.hackathonlabcv.activity.patient.FollowHomeExamPatient;

public class MenuAdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_menu);
        Toast.makeText(MenuAdminActivity.this, "Tela em desenvolvimento...", Toast.LENGTH_LONG).show();

    }

    public void openAdminCollectorDataActivity(View view){
        Intent intent = new Intent(MenuAdminActivity.this, AdminDataActivity.class);
        startActivity(intent);
    }

}
