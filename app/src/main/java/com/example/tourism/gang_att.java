package com.example.tourism;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class gang_att extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gang_att);
    }

   public void  opnnnAct1(View v)
   {
       Intent intent =new Intent(this,gang_att_kedartal.class);
       startActivity(intent);
   }
    public void  opnnnAct2(View v)
    {
        Intent intent =new Intent(this,gang_att_tapovan.class);
        startActivity(intent);
    }
    public void  opnnnAct3(View v)
    {
        Intent intent =new Intent(this,gang_att_bhaironghati.class);
        startActivity(intent);
    }

    public void  opnnnAct4(View v)
    {
        Intent intent =new Intent(this,gang_att_pandavagufa.class);
        startActivity(intent);
    }

}