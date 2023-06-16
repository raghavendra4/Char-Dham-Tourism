package com.example.tourism;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class rishikesh_att extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rishikesh_att);
    }
    public void openAAct1(View v)
    {
        Toast.makeText(this, "Opening Lakshman Jhula ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,rishi_att_lakshmanjhula_des.class);
        startActivity(intent);
    }
    public void openAAct2(View v)
    {
        Toast.makeText(this, "Opening GITA Bhavan  ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,rishi_att_geetabhavan.class);
        startActivity(intent);
    }
    public void openAAct3(View v)
    {
        Toast.makeText(this, "Opening  Byasi  ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,rishi_att_byasi.class);
        startActivity(intent);
    }
    public void openAAct4(View v)
    {
        Toast.makeText(this, "Opening  Parmarth Niketan   ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,rishi_att_parmarthniketan.class);
        startActivity(intent);
    }

}