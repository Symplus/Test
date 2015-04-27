package com.example.maxxrodriguez.test;

import java.util.ArrayList;

/**
 * Created by Corey on 3/29/2015.
 */
public class Doctor {
    private int id;
    private String name, dob, emailAddress, password, hospitalName = ""; //basic info for a doctor, results has not been implemented yet
    private ArrayList<Patient> PATIENTS;

    public Doctor(String n, String birth, String email, String pass, String hospital) //Create doctor
    {
        name = n;
        dob = birth;
        emailAddress = email;
        password = pass;
        hospitalName = hospital;

    }

    //setter
    public void addPatient(Patient pnt){
        PATIENTS.add(pnt);
    }

    public ArrayList<Patient> getPatients(){
        return PATIENTS;
    }
}
