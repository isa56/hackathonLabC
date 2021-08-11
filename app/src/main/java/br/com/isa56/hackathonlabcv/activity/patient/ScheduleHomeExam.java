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
import br.com.isa56.hackathonlabcv.model.HomeExam;

public class ScheduleHomeExam extends AppCompatActivity {

    private TextInputEditText name, date, timeBegin, timeEnd, cep,  insuranceCode, guideCode;
    private Switch insuranceSw, guideSw;
    private Spinner exam, insuranceChoice;
    private Button confirmExam;

    public String examName, insuranceName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_schedule_home_exam);

//        insuranceChoice = findViewById(R.id.homeInsuranceSpinner);
//        insuranceCode = findViewById(R.id.homeInsuranceIdInput);
//        guideCode = findViewById(R.id.homeInsuranceGuideInput);

        name = findViewById(R.id.homeInputName);

        date = findViewById(R.id.homeDateInput);
        timeBegin = findViewById(R.id.homeInputTimeBegin);
        timeEnd = findViewById(R.id.homeInputTimeEnd);

        cep = findViewById(R.id.homeInputCEP);

        // Spinners:
        exam = findViewById(R.id.homeExamSpinner);
        insuranceChoice = findViewById(R.id.homeInsuranceSpinner);

        insuranceSw = findViewById(R.id.homePlanOrInsuranceSwitch);
        guideSw = findViewById(R.id.homeGuiderSwitch);

        confirmExam = findViewById(R.id.homeConfirmHomeScheduleButton);


        Toast.makeText(ScheduleHomeExam.this, "Tela em desenvolvimento...", Toast.LENGTH_LONG).show();

        // Spinner de exames:
        ArrayAdapter<CharSequence> examAdapter = ArrayAdapter.createFromResource(
                ScheduleHomeExam.this,
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

        // Spinner de convênios:
        ArrayAdapter<CharSequence> insuranceAdapter = ArrayAdapter.createFromResource(
                ScheduleHomeExam.this,
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
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });

    }

    public void validateHomeExam(View view){
        String textName = name.getText().toString();
        String textDate = date.getText().toString();
        String textTimeBegin = timeBegin.getText().toString();
        String textTimeEnd = timeEnd.getText().toString();
        String textCep = cep.getText().toString();
        String textExam = exam.getSelectedItem().toString();

        if(!textName.isEmpty()){
            if(!textDate.isEmpty()){
                if(!textTimeBegin.isEmpty() || !textTimeEnd.isEmpty()){
                    if(!textCep.isEmpty()){
                        if(!examName.isEmpty()) {

                            HomeExam homeExam = new HomeExam();

                            homeExam.setName(textName);
                            homeExam.setDate(textDate);
                            homeExam.setTimeBegin(textTimeBegin);
                            homeExam.setTimeEnd(textTimeEnd);
                            homeExam.setCep(textCep);
                            homeExam.setExamName(examName);


                            saveExamHome(homeExam);
                        }
                        else{
                            Toast.makeText(ScheduleHomeExam.this, "Por favor, selecione o exame.", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else{
                        Toast.makeText(ScheduleHomeExam.this, "Por favor, preencha o endereço.", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(ScheduleHomeExam.this, "Por favor, preencha o período.", Toast.LENGTH_SHORT).show();
                }
            }
            else{
                Toast.makeText(ScheduleHomeExam.this, "Por favor, preencha a data.", Toast.LENGTH_SHORT).show();
            }
        }
        else{
            Toast.makeText(ScheduleHomeExam.this, "Por favor, preencha seu nome.", Toast.LENGTH_SHORT).show();
        }
    }


    public void saveExamHome(HomeExam homeExam){

        homeExam.saveHomeExam();

        Toast.makeText(ScheduleHomeExam.this, "Exame agendado!", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(ScheduleHomeExam.this, MenuPatientActivity.class));
        finish();
    }



/*
  public boolean verifyIfHasInsurance(){
        if(insuranceSw.isChecked()){
            insuranceChoice.setVisibility(View.VISIBLE);
            insuranceCode.setVisibility(View.VISIBLE);
            return true;}
        else{
            insuranceChoice.setVisibility(View.GONE);
            insuranceCode.setVisibility(View.GONE);
            return false;}}
    public String verifyIfHasGuide(){
      if(guideSw.isChecked()){
            guideCode.setVisibility(View.VISIBLE);
            return "V";}
        else{
            guideCode.setVisibility(View.GONE);
            return "F";}}
*/

}
