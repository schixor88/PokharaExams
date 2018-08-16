package com.example.kushagra.pokharaexams;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class StartActivity extends AppCompatActivity {

    ProgressBar progressBar;
    private int progressStatus = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);


        progressBar = (ProgressBar)findViewById(R.id.progress_start);


        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {

                startActivity(new Intent(StartActivity.this,MainActivity.class));
                finish();
            }
        },2000);
    }
}
