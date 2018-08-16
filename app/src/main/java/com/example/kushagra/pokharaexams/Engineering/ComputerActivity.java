package com.example.kushagra.pokharaexams.Engineering;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.kushagra.pokharaexams.R;
import com.github.chrisbanes.photoview.PhotoView;

public class ComputerActivity extends AppCompatActivity {

    ImageView imgCmp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);

        PhotoView photoView = (PhotoView) findViewById(R.id.photo_cmp);
        photoView.setImageResource(R.drawable.be_cmp);
    }
}
