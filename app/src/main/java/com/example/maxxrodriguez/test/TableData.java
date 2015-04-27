package com.example.maxxrodriguez.test;

import android.database.sqlite.SQLiteOpenHelper;

public class TableData extends SQLiteOpenHelper {
    // Logcat tag
    private static final String LOG = "TableData";

    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "Symplus";

    // Table Names
    private static final String TABLE_DOCTORS = "doctors";
    private static final String TABLE_PATIENTS = "patients";
    private static final String TABLE_PATIENT_DOCTOR = "patient_doctor";


    // Common column names
    private static final String KEY_ID = "id";


    // DOCTOR Table - column nmaes
    private static final String KEY_DOCTOR_NAME = "DoctorName";
    private static final String KEY_DOCTOR_DOB = "DoctorDOB";
    private static final String KEY_DOCTOR_EMAIL = "DoctorEmail";
    private static final String KEY_DOCTOR_PASSWORD = "DoctorPassword";
    private static final String KEY_DOCTOR_HOSPITALNAME = "DoctorHospital";
    private static final String KEY_DOCTOR_PATIENTS = "DoctorsPatients";

    // TAGS Table - column namesprivate String name, dob, emailAddress, docID, password = ""; //basic info for a patient, results has not been implemented yet
   // private ArrayList<Report> PATIENT_REPORTS;
    private static final String KEY_PATIENT_NAME = "PatientName";
    private static final String KEY_PATIENT_DOB = "PatientDOB";
    private static final String KEY_PATIENT_EMAIL = "PatientEmail";
    private static final String KEY_PATIENT_DOCID = "PatientdocID";
    private static final String KEY_PATIENT_PASSWORD = "PatientPassword";
    private static final String KEY_PATIENT_REPORTS = "PatientReports";

    // NOTE_TAGS Table - column names
    private static final String KEY_DOCTOR_ID = "Doctor_Id";
    private static final String KEY_PATIENT_ID = "Patient_Id";

    // Table Create Statements
    // Todo table create statement
    private static final String CREATE_TABLE_DOCTOR = "CREATE TABLE "
            + TABLE_DOCTORS + "(" + KEY_ID + " INTEGER PRIMARY KEY," + KEY_DOCTOR_DOB
            + " TEXT," + KEY_DOCTOR_EMAIL + " TEXT," + KEY_DOCTOR_PASSWORD
            + " TEXT," + KEY_DOCTOR_HOSPITALNAME +" TEXT," + KEY_DOCTOR_PATIENTS
            + " TEXT" + ")";

    // Tag table create statement
    private static final String CREATE_TABLE_PATIENT = "CREATE TABLE "
            + TABLE_PATIENTS + "(" + KEY_ID + " INTEGER PRIMARY KEY," + KEY_PATIENT_NAME
            + " TEXT," + KEY_PATIENT_DOB + " TEXT," + KEY_PATIENT_EMAIL
            + " TEXT," + KEY_PATIENT_DOCID +" INTEGER," + KEY_DOCTOR_PASSWORD
            + " TEXT," + KEY_PATIENT_REPORTS + "TEXT" +")";

    // todo_tag table create statement
    private static final String CREATE_TABLE_TODO_TAG = "CREATE TABLE "
            + TABLE_PATIENT_DOCTOR + "(" + KEY_ID + " INTEGER PRIMARY KEY,"
            + KEY_DOCTOR_ID + " INTEGER," + KEY_PATIENT_ID + " INTEGER"
            +  ")";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        // creating required tables
        db.execSQL(CREATE_TABLE_TODO);
        db.execSQL(CREATE_TABLE_TAG);
        db.execSQL(CREATE_TABLE_TODO_TAG);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // on upgrade drop older tables
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_TODO);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_TAG);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_TODO_TAG);

        // create new tables
        onCreate(db);
    }






}