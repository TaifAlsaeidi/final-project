package com.example.myproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Bundle D = getIntent().getExtras();
        Namecolleges m = (Namecolleges) D.getSerializable("name");

        TextView name = findViewById(R.id.detailsName);
        TextView phone = findViewById(R.id.detailsPhone);

        TextView ttt = findViewById(R.id.detailsS);
        ttt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(details.this,lastPage.class);
                startActivity(i);
            }
        });






        name.setText(m.getName());

        phone.setText("Phone");
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:"+24816465));
                startActivity(callIntent);
            }
        });

        TextView eemail = findViewById(R.id.detailsEmail);

        eemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL,"WWW.eng.kuniv.edu");
                email.putExtra(Intent.EXTRA_SUBJECT,"");
                email.putExtra(Intent.EXTRA_TEXT,"");
                email.setType("taxt|plain");
                startActivity(Intent.createChooser(email,"Send email:"));
            }
        });
    
    }
}