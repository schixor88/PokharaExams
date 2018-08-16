package com.example.kushagra.pokharaexams.Engineering;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kushagra.pokharaexams.R;
import com.github.chrisbanes.photoview.PhotoView;

public class CivilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil);

        PhotoView photoView = (PhotoView)findViewById(R.id.photo_civil);
        photoView.setImageResource(R.drawable.be_civil);
    }
}
