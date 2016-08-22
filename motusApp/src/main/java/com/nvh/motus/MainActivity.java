package com.nvh.motus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.example.nicolas.myapplication.R;


public class MainActivity extends AppCompatActivity {

    ImageView img0 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img0 = (ImageView) findViewById(R.id.imageView);
    }
}
