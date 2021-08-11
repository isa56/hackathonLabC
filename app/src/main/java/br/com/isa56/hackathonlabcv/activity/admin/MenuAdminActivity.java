package br.com.isa56.hackathonlabcv.activity.admin;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import br.com.isa56.hackathonlabcv.R;
import br.com.isa56.hackathonlabcv.activity.patient.FollowHomeExamPatient;

public class MenuAdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_menu);
        Toast.makeText(MenuAdminActivity.this, "Tela em desenvolvimento...", Toast.LENGTH_LONG).show();

    }

}
