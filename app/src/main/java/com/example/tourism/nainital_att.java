package com.example.tourism;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class nainital_att extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nainital_att);
    }
    public void oppnActivit1(View v)
    {
        Toast.makeText(this, "opening lake ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,nainital_att_lake_des.class);
        startActivity(intent);
    }
    public void oppnActivit2(View v)
    {
        Toast.makeText(this, "opening zoo ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,nainzoo.class);
        startActivity(intent);
    }
    public void oppnActivit3(View v) {
        Toast.makeText(this, "opening lake ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, nainital_att_nainitemple.class);
        startActivity(intent);
    }
    public void oppnActivit4(View v) {
        Toast.makeText(this, "opening lake ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, nainital_att_kainchidham_des.class);
        startActivity(intent);
    }
}