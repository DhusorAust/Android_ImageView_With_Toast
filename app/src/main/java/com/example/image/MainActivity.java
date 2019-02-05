  package com.example.image;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

  public class MainActivity extends AppCompatActivity {

      ImageView pic1,pic2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pic1=(ImageView) findViewById(R.id.image1);
        pic2=(ImageView) findViewById(R.id.image2);


    }

      public void imageview1(View view) {

        if(view.getId()==R.id.image1){
            Toast.makeText(MainActivity.this, "Head Teacher Open the tournament", Toast.LENGTH_SHORT).show();
        }
        else{

            Toast.makeText(MainActivity.this, "Paris Sir is talking With Players", Toast.LENGTH_SHORT).show();
        }


      }


  }
