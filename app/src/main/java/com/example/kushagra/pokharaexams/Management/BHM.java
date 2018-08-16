package com.example.kushagra.pokharaexams.Management;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kushagra.pokharaexams.R;
import com.github.chrisbanes.photoview.PhotoView;

public class BHM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhm);

        PhotoView photoView = (PhotoView) findViewById(R.id.photo_bhm);
        photoView.setImageResource(R.drawable.bhm);
    }
}
