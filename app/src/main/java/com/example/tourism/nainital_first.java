package com.example.tourism;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class nainital_first extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nainital_first);
    }
    public void opnnAct1(View v)
    {
        Toast.makeText(this, "Opening Description ", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,nainital_des.class);
        startActivity(intent);
    }
    public void opnnAct2(View v)
    {
        Toast.makeText(this, "Opening Attractions", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,nainital_att.class);
        startActivity(intent);
    }
    public void opnnAct3(View v)
    {
        Toast.makeText(this, "Nainital", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,how_to_reach_naini.class);
        startActivity(intent);
    }
    public void opnnAct4(View v)
    {
        Toast.makeText(this, "Nainital", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,naini_accomodation.class);
        startActivity(intent);
    }

}