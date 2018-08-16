package com.example.kushagra.pokharaexams;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_program;
    CardView cv_eng, cv_mgmt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv_program = findViewById(R.id.tv_program);

        cv_eng=findViewById(R.id.card_eng);
        cv_mgmt = findViewById(R.id.card_mgmt);


        cv_eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent(MainActivity.this,EngineeringActivity.class);
                startActivity(i);
            }
        });


        cv_mgmt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent(MainActivity.this,ManagementActivity.class);
                startActivity(i);
            }
        });



    }
}
