package com.example.tourism;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class how_to_reach_ym extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.how_to_reach_ym);
    }
    public void opp1(View v)
    {
        Intent intent = new Intent(this,yam_htr_flight.class);
        startActivity(intent);
    }
    public void opp2(View v)
    {
        Intent intent = new Intent(this,yam_htrtrain.class);
        startActivity(intent);
    }
    public void opp3(View v)
    {
        Intent intent = new Intent(this,yam_htrbus.class);
        startActivity(intent);
    }

}