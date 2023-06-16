package com.example.tourism;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class kedarnath_att extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kedarnath_att);
    }
    public void opnActi1(View v)
    {
        Toast.makeText(this, "Gauri Khund", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,ked_att_gaurikund.class);
        startActivity(intent);
    }
    public void opnActi2(View v)
    {
        Toast.makeText(this, "Opening Bhairav Nath Temple ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,ked_att_bhairav.class);
        startActivity(intent);
    }
    public void opnActi3(View v)
    {
        Toast.makeText(this, "Opening Vasuki Tal  ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,ked_att_vasukital.class);
        startActivity(intent);
    }
    public void opnActi4(View v)
    {
        Toast.makeText(this, "Opening Wildlife Sanctuary ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,ked_att_wldlyfsanc.class);
        startActivity(intent);
    }

}