package com.example.kushagra.pokharaexams.Engineering;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kushagra.pokharaexams.R;
import com.github.chrisbanes.photoview.PhotoView;

public class SoftwareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_software);

        PhotoView photoView = (PhotoView) findViewById(R.id.photo_software);
        photoView.setImageResource(R.drawable.be_software);
    }
}
