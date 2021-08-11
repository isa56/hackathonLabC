package br.com.isa56.hackathonlabcv.model;

import com.google.firebase.database.DatabaseReference;

import br.com.isa56.hackathonlabcv.config.FirebaseConfig;

public class HomeExam {

    private String number, name, date, timeBegin, timeEnd, cep, houseNumber;

    public HomeExam() {    }

    public void saveHomeExam(){
        DatabaseReference dbRef = FirebaseConfig.getFirebaseDatabase();
        DatabaseReference homeExams = dbRef.child("homeExams").child(getNumber());
        homeExams.setValue(this);
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

    public String getTimeBegin() {
        return timeBegin;
    }

    public void setTimeBegin(String timeBegin) {
        this.timeBegin = timeBegin;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
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
