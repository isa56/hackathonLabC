package br.com.isa56.hackathonlabcv.activity.patient;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

import br.com.isa56.hackathonlabcv.R;
import br.com.isa56.hackathonlabcv.activity.CreateAccountActivity;
import br.com.isa56.hackathonlabcv.activity.MainActivity;
import br.com.isa56.hackathonlabcv.model.ClinicExam;
import br.com.isa56.hackathonlabcv.model.HomeExam;

public class ScheduleClinicExam extends AppCompatActivity {

    private TextInputEditText name, date, time, cep, guideCode, insuranceCode;
    private Switch insuranceSw, guideSw;
    private Spinner exam, insuranceChoice;
    private Button confirmExam;
    public String insuranceName, examName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_schedule_exam);

        name = findViewById(R.id.exInputName);
        date = findViewById(R.id.exDateInput);
        time = findViewById(R.id.exInputTime);
        cep = findViewById(R.id.exInputCEP);

        // Spinners:
        exam = findViewById(R.id.exExamSpinner);
        insuranceChoice = findViewById(R.id.exInsuranceSpinner);

        insuranceSw = findViewById(R.id.exPlanOrInsuranceSwitch);
        guideSw = findViewById(R.id.exGuiderSwitch);

        confirmExam = findViewById(R.id.exConfirmScheduleButton);


        Toast.makeText(ScheduleClinicExam.this, "Tela em desenvolvimento...", Toast.LENGTH_LONG).show();


        // Spinner de Exames:
        ArrayAdapter<CharSequence> examAdapter = ArrayAdapter.createFromResource(
            ScheduleClinicExam.this,
            R.array.exams_data,
            R.layout.simple_spinner_item
        );

        exam.setAdapter(examAdapter);

        exam.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                examName = (String) adapterView.getItemAtPosition(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });


        // Spinner de Convênios:
        ArrayAdapter<CharSequence> insuranceAdapter = ArrayAdapter.createFromResource(
                ScheduleClinicExam.this,
                R.array.insurance_data,
                R.layout.simple_spinner_item
        );

        insuranceChoice.setAdapter(insuranceAdapter);

        insuranceChoice.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                insuranceName = (String) adapterView.getItemAtPosition(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {            }
        });





    }

    public void validateClinicExam(View view) {
        String textName = name.getText().toString();

        String textDate = date.getText().toString();
        String textTime = time.getText().toString();

        String textCep = cep.getText().toString();
        String textExam = exam.getSelectedItem().toString();

        if (!textName.isEmpty()) {
            if (!textDate.isEmpty()) {
                if (!textTime.isEmpty()) {
                    if (!textCep.isEmpty()) {
                        if(!examName.isEmpty()) {

                            ClinicExam clinicExam = new ClinicExam();

                            clinicExam.setName(textName);
                            clinicExam.setDate(textDate);
                            clinicExam.setTime(textTime);
                            clinicExam.setCep(textCep);
                            clinicExam.setExamName(examName);

                            saveClinicExam(clinicExam);
                        } else{
                            Toast.makeText(ScheduleClinicExam.this, "Por favor, selecione o exame.", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(ScheduleClinicExam.this, "Por favor, preencha o endereço.", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(ScheduleClinicExam.this, "Por favor, preencha o período.", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(ScheduleClinicExam.this, "Por favor, preencha a data.", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(ScheduleClinicExam.this, "Por favor, preencha seu nome.", Toast.LENGTH_SHORT).show();
        }
    }


    public void saveClinicExam(ClinicExam clinicExam) {
        clinicExam.saveClinicExam();

        Toast.makeText(ScheduleClinicExam.this, "Exame agendado!", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(ScheduleClinicExam.this, MenuPatientActivity.class));
        finish();

    }



//  public boolean verifyIfHasInsurance(){  if(insuranceSw.isChecked()){    insuranceChoice.setVisibility(View.VISIBLE);    insuranceCode.setVisibility(View.VISIBLE);  return true;}   return false;}

//  public boolean verifyIfHasGuide(){  if(guideSw.isChecked()){    guideCode.setVisibility(View.VISIBLE);  return true;}   return false;}


}

