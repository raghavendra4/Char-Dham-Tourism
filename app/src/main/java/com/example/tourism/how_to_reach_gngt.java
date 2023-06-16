package com.example.tourism;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class how_to_reach_gngt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.how_to_reach_gngt);
    }
    public void ope1(View v)
    {
        Toast.makeText(this, "How To Reach By Flight  ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,gang_htr_flight.class);
        startActivity(intent);
    }

    public void ope2(View v)
    {
        Toast.makeText(this, "How To Reach By Train   ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,gang_htr_train.class);
        startActivity(intent);
    }

    public void ope3(View v)
    {
        Toast.makeText(this, "How To Reach By Bus   ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,gang_htr_bus.class);
        startActivity(intent);
    }


}