package com.example.kushagra.pokharaexams.Engineering;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kushagra.pokharaexams.R;
import com.github.chrisbanes.photoview.PhotoView;

public class ElxCommActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elx_comm);

        PhotoView photoView = (PhotoView) findViewById(R.id.photo_elx_comm);
        photoView.setImageResource(R.drawable.be_elx_com);
    }
}
