package com.example.tourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  //  private Button button ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openActivity2(View v){
        Toast.makeText(this, "Opening Yamunotri ", Toast.LENGTH_SHORT).show();
        Intent intent =new Intent(this,yamnotri_first.class);
        startActivity(intent);
    }
    public void openActivity1(View v)
    {
        Toast.makeText(this, "Opening Kedarnath", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,kedarnath_first.class);
        startActivity(intent);
    }
    public void openActivity3(View v)
    {
        Toast.makeText(this, "Opening Badrinath", Toast.LENGTH_SHORT).show();
        Intent intent =new Intent(this,badrinath_first.class);
        startActivity(intent);
    }
    public void openActivity4(View v)
    {
        Toast.makeText(this, "Opening Gangotri", Toast.LENGTH_SHORT).show();
        Intent intent =new Intent(this,gangotri_first.class);
        startActivity(intent);
    }
    public void openActivity5(View v)
    {
        Toast.makeText(this, "Opening Nainital ", Toast.LENGTH_SHORT).show();
        Intent intent =new Intent(this,nainital_first.class);
        startActivity(intent);
    }
    public void openActivity6(View v)
    {
        Toast.makeText(this, "Opening Rishikesh ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,rishikesh_first.class);
        startActivity(intent);
    }

}