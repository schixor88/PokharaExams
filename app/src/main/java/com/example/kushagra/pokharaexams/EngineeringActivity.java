package com.example.kushagra.pokharaexams;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;

import com.example.kushagra.pokharaexams.Engineering.CivilActivity;
import com.example.kushagra.pokharaexams.Engineering.ComputerActivity;
import com.example.kushagra.pokharaexams.Engineering.ElectricalElxActivity;
import com.example.kushagra.pokharaexams.Engineering.ElxCommActivity;
import com.example.kushagra.pokharaexams.Engineering.ItActivity;
import com.example.kushagra.pokharaexams.Engineering.SoftwareActivity;

public class EngineeringActivity extends AppCompatActivity {

    CardView cmp,elx_com,it,sw,elc_elx,civil;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engineering);


        cmp=findViewById(R.id.cv_cmp_eng);
        elx_com=findViewById(R.id.cv_elx_cmm_eng);
        it=findViewById(R.id.cv_it_eng);
        sw=findViewById(R.id.cv_soft_eng);
        elc_elx=findViewById(R.id.cv_elt_elx_eng);
        civil=findViewById(R.id.cv_civil);




        cmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(EngineeringActivity.this, ComputerActivity.class);
                startActivity(i);

            }
        });

        elx_com.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(EngineeringActivity.this, ElxCommActivity.class);
                startActivity(i);

            }
        });

        it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(EngineeringActivity.this, ItActivity.class);
                startActivity(i);

            }
        });

        sw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(EngineeringActivity.this, SoftwareActivity.class);
                startActivity(i);

            }
        });

        elc_elx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(EngineeringActivity.this, ElectricalElxActivity.class);
                startActivity(i);

            }
        });

        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(EngineeringActivity.this, CivilActivity.class);
                startActivity(i);

            }
        });
    }
}
