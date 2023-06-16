package com.example.tourism;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class how_to_reach_ked extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.how_to_reach_ked);
    }
    public void oPe1(View v)
    {
        Toast.makeText(this, " How To reach by flight ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,ked_htr_flight.class);
        startActivity(intent);
    }
    public void oPe2(View v)
    {
        Toast.makeText(this, " How To reach by train  ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,ked_htr_train.class);
        startActivity(intent);
    }
    public void oPe3(View v)
    {
        Toast.makeText(this, " How To reach by Bus ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,ked_htr_bus.class);
        startActivity(intent);
    }
}