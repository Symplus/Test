package com.example.maxxrodriguez.test;

/**
 * Created by maxxrodriguez on 4/25/15.
 */
public class Report {
    private int id;
    private int nausea, headache, chestpain, achiness;

    public Report(int id, int n, int h, int cp, int a)
    {
        this.id = id;
        nausea = n;
        headache = h;
        chestpain = cp;
        achiness = a;
    }

    // getters
    public int getNausea(){
        return nausea;
    }

    public int getChestPain(){
        return chestpain;
    }
    public int getAchiness(){
        return achiness;
    }
}
