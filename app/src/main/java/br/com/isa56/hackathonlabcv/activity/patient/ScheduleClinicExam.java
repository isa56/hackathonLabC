package br.com.isa56.hackathonlabcv.activity.patient;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

import br.com.isa56.hackathonlabcv.R;
import br.com.isa56.hackathonlabcv.model.ClinicExam;
import br.com.isa56.hackathonlabcv.model.HomeExam;

public class ScheduleClinicExam extends AppCompatActivity {

    private TextInputEditText name, date, time, cep, houseNumber;
    private Switch insuranceSw, guideSw;
    private Spinner exam;
    private Button confirmExam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_schedule_exam);

        name = findViewById(R.id.exInputName);

        date = findViewById(R.id.exInputDate);
        time = findViewById(R.id.exInputTime);

        cep = findViewById(R.id.exInputCEP);
        houseNumber = findViewById(R.id.exInputHouseNum);

        exam = findViewById(R.id.exExamSpinner);

        insuranceSw = findViewById(R.id.exPlanOrInsuranceSwitch);
        guideSw = findViewById(R.id.exGuiderSwitch);

        confirmExam = findViewById(R.id.exConfirmScheduleButton);

    }

    public void validateExam(View view){
        String textName = name.getText().toString();

        String textDate = date.getText().toString();
        String textTime = time.getText().toString();

        String textCep = cep.getText().toString();
        String textHouseNumber = houseNumber.getText().toString();
        String textExam = exam.getSelectedItem().toString();

        if(!textName.isEmpty()){
            if(!textDate.isEmpty()){
                if(!textTime.isEmpty()){
                    if(!textCep.isEmpty() || !textHouseNumber.isEmpty()){

                        ClinicExam clinicExam = new ClinicExam();

                        clinicExam.setName(textName);
                        clinicExam.setDate(textDate);
                        clinicExam.setTime(textTime);
                        clinicExam.setCep(textCep);
                        clinicExam.setHouseNumber(textHouseNumber);

                        saveClinicExam(clinicExam);

                    }
                    else{
                        Toast.makeText(ScheduleClinicExam.this, "Por favor, preencha o endereço", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(ScheduleClinicExam.this, "Por favor, preencha o período", Toast.LENGTH_SHORT).show();
                }
            }
            else{
                Toast.makeText(ScheduleClinicExam.this, "Por favor, preencha a data", Toast.LENGTH_SHORT).show();
            }
        }
        else{
            Toast.makeText(ScheduleClinicExam.this, "Por favor, preencha seu nome", Toast.LENGTH_SHORT).show();
        }
    }



    public void saveClinicExam(ClinicExam clinicExam){
        clinicExam.saveClinicExam();
    }



    public boolean verifyIfHasInsurance(){
        if(insuranceSw.isChecked()){
            return true;
        }
        return false;
    }



    public boolean verifyIfHasGuide(){
        if(guideSw.isChecked()){
            return true;
        }
        return false;
    }



}
