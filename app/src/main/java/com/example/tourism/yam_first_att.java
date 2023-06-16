package com.example.tourism;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class yam_first_att extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yam_first_att);
    }
    public void  opAct1(View v)
    {
        Toast.makeText(this, "Opening Kharsali", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,yam_att_kha.class);
        startActivity(intent);
    }
    public void opAct3(View v)
    {
        Toast.makeText(this, "Opening Hanuman Chatti", Toast.LENGTH_SHORT).show();
        Intent intent =new Intent(this,yam_att_han.class);
        startActivity(intent);
    }
    public void opAct2(View v)
    {
        Toast.makeText(this, " Opening saptrishi kund", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,yam_att_sptknd.class);
        startActivity(intent);
    }
    public void opAct4(View v)
    {
        Toast.makeText(this, " Opening Janki Chatti ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,yam_att_jnkchti.class);
        startActivity(intent);
    }
}