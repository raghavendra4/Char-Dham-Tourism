package com.example.tourism;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ked_maps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ked_maps);
    }

    public void openActi(View v)
    {
        Intent intent = new Intent();
        intent.setClass(getApplicationContext(),MapsActivity_ked.class);
        startActivity(intent);
    }
}