package com.example.maxxrodriguez.test;

import java.util.ArrayList;

/**
 * Created by maxxrodriguez on 3/24/15.
 */
public class Patient {
    private int id;
    private String name, dob, emailAddress, docID, password = ""; //basic info for a patient, results has not been implemented yet
    private ArrayList<Report> PATIENT_REPORTS;

    public Patient(int id, String n, String birth, String email, String pass) //DocId not provided
    {
        this.id = id;
        name = n;
        dob = birth;
        emailAddress = email;
        password = pass;

    }

    public Patient(int id, String n, String birth, String doc, String email, String pass) //All info is present
    {
        this.id = id;
        name = n;
        dob = birth;
        docID = doc;
        emailAddress = email;
        password = pass;

    }

    //setter
    public void addReport(Report rpt){
        PATIENT_REPORTS.add(rpt);
    }
    //getter
    public ArrayList<Report> getReports(){
        return PATIENT_REPORTS;
    }
}
