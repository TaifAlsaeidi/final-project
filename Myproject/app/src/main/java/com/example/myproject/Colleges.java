package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class Colleges extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colleges);


        Bundle b = getIntent().getExtras();
        ArrayList<Namecolleges> KUCollege = new ArrayList<>();
        Namecolleges KU1 = new Namecolleges("كلية الطب");
        Namecolleges KU2 = new Namecolleges("كلية الهندسة والبترول");
        Namecolleges KU3 = new Namecolleges("كلية الحقوق");
        Namecolleges KU4 = new Namecolleges("كلية العلوم");
        Namecolleges KU5 = new Namecolleges("كلية الصيدلة ");
        Namecolleges KU6 = new Namecolleges("كلية العمارة");
        Namecolleges KU7 = new Namecolleges("كلية الاداب");

        KUCollege.add(KU1);
        KUCollege.add(KU2);
        KUCollege.add(KU3);
        KUCollege.add(KU4);
        KUCollege.add(KU5);
        KUCollege.add(KU6);
        KUCollege.add(KU7);


        RecyclerView collegelist  =findViewById(R.id.rv);
        collegelist.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(Colleges.this);
        collegelist.setLayoutManager(lm);

        CollegeAdapter ca  =new CollegeAdapter(KUCollege,Colleges.this);
        collegelist.setAdapter(ca);





    }
}