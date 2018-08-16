package com.example.kushagra.pokharaexams.Management;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kushagra.pokharaexams.R;
import com.github.chrisbanes.photoview.PhotoView;

public class BCIS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bcis);

        PhotoView photoView = (PhotoView) findViewById(R.id.photo_bcis);
        photoView.setImageResource(R.drawable.bcis);
    }
}
