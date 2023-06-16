package com.example.tourism;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class gangotri_first extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gangotri_first);
    }
   public void opActivity1(View v )
    {
        Toast.makeText(this, "Opening Description ", Toast.LENGTH_SHORT).show();
        Intent intent =new Intent(this,gang_des.class);
        startActivity(intent);
    }
    public void opActivity2(View v ) {
        Toast.makeText(this, "Opening Attractions ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, gang_att.class);
        startActivity(intent);
    }
    public void opActivity3(View v ) {
        Toast.makeText(this, "Gangotri  ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, how_to_reach_gngt.class);
        startActivity(intent);
    }
    public void opActivity4(View v ) {
        Toast.makeText(this, "Accomodation   ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, gang_accomodation.class);
        startActivity(intent);
    }

}