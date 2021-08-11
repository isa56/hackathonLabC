package br.com.isa56.hackathonlabcv.model;

import com.google.firebase.database.DatabaseReference;

import br.com.isa56.hackathonlabcv.config.FirebaseConfig;

public class ClinicExam {

    private String id, name, date, time, cep, houseNumber, examName;

    public ClinicExam() {    }

    public void saveClinicExam(){
        DatabaseReference firebaseRef = FirebaseConfig.getFirebaseDatabase();
        DatabaseReference clinicexams = firebaseRef.child( "clinicexams" ).child( getId() );
        clinicexams.setValue(this);

    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
