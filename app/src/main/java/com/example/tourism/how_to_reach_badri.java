package com.example.tourism;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class how_to_reach_badri extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.how_to_reach_badri);
    }
    public void Ope1(View v)
    {
        Intent intent=new Intent(this,badri_htr_flight.class);
        startActivity(intent);

    }
    public void Ope2(View v)
    {
        Intent intent=new Intent(this,badri_htr_train.class);
        startActivity(intent);

    }
    public void Ope3(View v)
    {
        Intent intent=new Intent(this,badri_htr_bus.class);
        startActivity(intent);

    }


}