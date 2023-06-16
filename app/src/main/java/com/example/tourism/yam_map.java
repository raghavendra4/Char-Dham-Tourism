package com.example.tourism;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class yam_map extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yam_map);
    }

    public void oPp(View view)
    {
        Intent intent = new Intent();
        intent.setClass(getApplicationContext(),MapsActivity_yam.class);
        startActivity(intent);
    }
}