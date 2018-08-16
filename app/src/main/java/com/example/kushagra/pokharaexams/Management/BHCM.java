package com.example.kushagra.pokharaexams.Management;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kushagra.pokharaexams.R;
import com.github.chrisbanes.photoview.PhotoView;

public class BHCM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhcm);

        PhotoView photoView = (PhotoView) findViewById(R.id.photo_bhcm);
        photoView.setImageResource(R.drawable.bhcm);
    }
}
