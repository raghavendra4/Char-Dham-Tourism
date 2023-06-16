package com.example.tourism;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class badri_att extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.badri_att);
    }
    public void opeenAct1(View v)
    {
        Toast.makeText(this, "Opening Vasundhara falls ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,badri_att_vasfall_des.class);
        startActivity(intent);
    }
    public void opeenAct3(View v)
    {
        Toast.makeText(this, "Opening PanchDhara and Panchshila  ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,badri_att_pndshila.class);
        startActivity(intent);
    }
    public void opeenAct4(View v)
    {
        Toast.makeText(this, "Opening Hemkund ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,bdr_att_hemkundsahib.class);
        startActivity(intent);
    }
    public void opeenAct2(View v)
    {
        Toast.makeText(this, "Opening Satopanth Tal  ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,bdr_att_satopanthtal.class);
        startActivity(intent);
    }


}