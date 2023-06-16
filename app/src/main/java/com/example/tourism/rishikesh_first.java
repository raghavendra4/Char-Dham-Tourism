package com.example.tourism;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class rishikesh_first extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rishikesh_first);
    }
    public void oppenAct1(View v)
    {
        Toast.makeText(this, "Description", Toast.LENGTH_SHORT).show();
        Intent intent =new Intent(this,rishikesh_des.class);
        startActivity(intent);
    }
    public void oppenAct2(View v)
    {
        Toast.makeText(this, "Opening Description ", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,rishikesh_att.class);
        startActivity(intent);
    }
    public void oppenAct3(View v)
    {
        Toast.makeText(this, "Rishikesh ", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,how_to_reach_rishi.class);
        startActivity(intent);
    }
    public void oppenAct4(View v)
    {
        Toast.makeText(this, "Rishikesh ", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,rishikesh_accomodation.class);
        startActivity(intent);
    }
}