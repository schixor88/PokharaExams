package com.example.kushagra.pokharaexams;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.kushagra.pokharaexams.Management.BBA;
import com.example.kushagra.pokharaexams.Management.BBA_BI;
import com.example.kushagra.pokharaexams.Management.BBA_IT;
import com.example.kushagra.pokharaexams.Management.BCA;
import com.example.kushagra.pokharaexams.Management.BCIS;
import com.example.kushagra.pokharaexams.Management.BHCM;
import com.example.kushagra.pokharaexams.Management.BHM;

public class ManagementActivity extends AppCompatActivity {

    CardView bba,bba_bi,bba_it,bca,bcis,bhcm,bhm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_management);


        bba = (CardView)findViewById(R.id.cv_bba);
        bba_bi = (CardView)findViewById(R.id.cv_bba_bi);
        bba_it = (CardView)findViewById(R.id.cv_bba_it);
        bcis = (CardView)findViewById(R.id.cv_bcis);
        bca = (CardView)findViewById(R.id.cv_bca);
        bhm = (CardView)findViewById(R.id.cv_bhm);
        bhcm = (CardView)findViewById(R.id.cv_bhcm);



        bba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ManagementActivity.this, BBA.class);
                startActivity(i);

            }
        });

        bba_it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ManagementActivity.this, BBA_IT.class);
                startActivity(i);

            }
        });

        bba_bi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ManagementActivity.this, BBA_BI.class);
                startActivity(i);

            }
        });

        bcis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ManagementActivity.this, BCIS.class);
                startActivity(i);

            }
        });

        bca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ManagementActivity.this, BCA.class);
                startActivity(i);

            }
        });

        bhm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ManagementActivity.this, BHM.class);
                startActivity(i);

            }
        });

        bhcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ManagementActivity.this, BHCM.class);
                startActivity(i);

            }
        });


    }
}
