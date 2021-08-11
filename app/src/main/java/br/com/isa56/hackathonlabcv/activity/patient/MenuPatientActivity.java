package br.com.isa56.hackathonlabcv.activity.patient;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

import br.com.isa56.hackathonlabcv.R;
import br.com.isa56.hackathonlabcv.activity.CreateAccountActivity;
import br.com.isa56.hackathonlabcv.activity.MainActivity;

public class MenuPatientActivity extends AppCompatActivity {

    protected Button examResults, scheduleHome, scheduleClinic, followHomeExam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_menu);


        examResults = findViewById(R.id.examResultButton);
        scheduleHome = findViewById(R.id.examHomeScheduleButton);
        scheduleClinic = findViewById(R.id.examPlaceScheduleButton);
        followHomeExam = findViewById(R.id.homeExamGPSButton);

        examResults.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuPatientActivity.this, ExamResultsActivity.class);
                startActivity(intent);
            }
        });

        scheduleHome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuPatientActivity.this, ScheduleHomeExam.class);
                startActivity(intent);
            }
        });


        scheduleClinic.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuPatientActivity.this, ScheduleClinicExam.class);
                startActivity(intent);
            }
        });

        followHomeExam.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuPatientActivity.this, FollowHomeExamPatient.class);
                startActivity(intent);
            }
        });


    }




}
