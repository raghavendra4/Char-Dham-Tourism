package com.example.tourism;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class badrinath_first extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.badrinath_first);
    }
    public void opActivi1(View v)
    {
        Toast.makeText(this, "Opening Description ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,badrinath_des.class);
        startActivity(intent);
    }
    public void opActivi2(View v)
    {
        Toast.makeText(this, "Opening Description ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,badri_att.class);
        startActivity(intent);
    }
    public void opActivi3(View v)
    {
        Toast.makeText(this, " Badrinath  ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,how_to_reach_badri.class);
        startActivity(intent);
    }
    public void opActivi4(View v)
    {
        Toast.makeText(this, " Badrinath  ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,badri_accomodation.class);
        startActivity(intent);
    }

}