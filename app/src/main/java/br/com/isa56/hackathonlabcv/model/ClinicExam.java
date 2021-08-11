package br.com.isa56.hackathonlabcv.model;

import com.google.firebase.database.DatabaseReference;

import br.com.isa56.hackathonlabcv.config.FirebaseConfig;

public class ClinicExam {

    private String number, name, date, time, cep, houseNumber;

    public ClinicExam() {    }

    public void saveClinicExam(){
        DatabaseReference dbRef = FirebaseConfig.getFirebaseDatabase();
        DatabaseReference clinicExams = dbRef.child("clinicExams").child(getNumber());
        clinicExams.setValue(this);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String timeBegin) {
        this.time = time;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }
}
