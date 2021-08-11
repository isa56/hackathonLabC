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
import br.com.isa56.hackathonlabcv.model.HomeExam;

public class ScheduleHomeExam extends AppCompatActivity {

    private TextInputEditText name, date, timeBegin, timeEnd, cep, houseNumber;
    private Switch insuranceSw, guideSw;
    private Spinner exam;
    private Button confirmExam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_schedule_home_exam);

        name = findViewById(R.id.homeInputName);

        date = findViewById(R.id.homeInputDate);
        timeBegin = findViewById(R.id.homeInputTimeBegin);
        timeEnd = findViewById(R.id.homeInputTimeEnd);

        cep = findViewById(R.id.homeInputCEP);
        houseNumber = findViewById(R.id.homeInputHouseNum);

        exam = findViewById(R.id.homeExamSpinner);

        insuranceSw = findViewById(R.id.homePlanOrInsuranceSwitch);
        guideSw = findViewById(R.id.homeGuiderSwitch);

        confirmExam = findViewById(R.id.homeConfirmHomeScheduleButton);
    }

    public void validateExam(View view){
        String textName = name.getText().toString();
        String textDate = date.getText().toString();
        String textTimeBegin = timeBegin.getText().toString();
        String textTimeEnd = timeEnd.getText().toString();
        String textCep = cep.getText().toString();
        String textHouseNumber = houseNumber.getText().toString();
        String textExam = exam.getSelectedItem().toString();

        if(!textName.isEmpty()){
            if(!textDate.isEmpty()){
                if(!textTimeBegin.isEmpty() || !textTimeEnd.isEmpty()){
                    if(!textCep.isEmpty() || !textHouseNumber.isEmpty()){

                        HomeExam homeExam = new HomeExam();

                        homeExam.setName(textName);
                        homeExam.setDate(textDate);
                        homeExam.setTimeBegin(textTimeBegin);
                        homeExam.setTimeEnd(textTimeEnd);
                        homeExam.setCep(textCep);
                        homeExam.setHouseNumber(textHouseNumber);

                        saveExamHome(homeExam);

                    }
                    else{
                        Toast.makeText(ScheduleHomeExam.this, "Por favor, preencha o endereço", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(ScheduleHomeExam.this, "Por favor, preencha o período", Toast.LENGTH_SHORT).show();
                }
            }
            else{
                Toast.makeText(ScheduleHomeExam.this, "Por favor, preencha a data", Toast.LENGTH_SHORT).show();
            }
        }
        else{
            Toast.makeText(ScheduleHomeExam.this, "Por favor, preencha seu nome", Toast.LENGTH_SHORT).show();
        }
    }


    public void saveExamHome(HomeExam homeExam){
        homeExam.saveHomeExam();
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
