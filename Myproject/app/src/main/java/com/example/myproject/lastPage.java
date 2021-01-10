package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class lastPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_page);

        Bundle b = getIntent().getExtras();
        ArrayList<Namecolleges> lastp = new ArrayList<>();
        Namecolleges KU1 = new Namecolleges("هندسه مدنيه");
        Namecolleges KU2 = new Namecolleges("هندسه كمبيوتر ");
        Namecolleges KU3 = new Namecolleges("هندسه ميكانيكية ");
        Namecolleges KU4 = new Namecolleges("هندسه كهربائيه");
        Namecolleges KU5 = new Namecolleges("هندسه صناعية ");
        Namecolleges KU6 = new Namecolleges("هندسه بترول");
        Namecolleges KU7 = new Namecolleges("هندسه كيميائيه");

        lastp.add(KU1);
        lastp.add(KU2);
        lastp.add(KU3);
        lastp.add(KU4);
        lastp.add(KU5);
        lastp.add(KU6);
        lastp.add(KU7);


        RecyclerView lastpage  =findViewById(R.id.last);
        lastpage.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(lastPage.this);
        lastpage.setLayoutManager(lm);

        CollegeAdapter ca  =new CollegeAdapter(lastp,lastPage.this);
        lastpage.setAdapter(ca);
    }
}