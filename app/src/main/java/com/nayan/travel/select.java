package com.nayan.travel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class select extends AppCompatActivity {
    Button sbtn1;
    Button sbtn2;
    Button sbtn3;
    Button sbtn4;
    Button sbtn5;
    Button sbtn6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        sbtn1=(Button) findViewById(R.id.sbtn1);
        sbtn2=(Button) findViewById(R.id.sbtn2);
        sbtn3=(Button) findViewById(R.id.sbtn3);
        sbtn4=(Button) findViewById(R.id.sbtn4);
        sbtn5=(Button) findViewById(R.id.sbtn5);
        sbtn6=(Button) findViewById(R.id.sbtn6);


        sbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentemp1();
            }
        });

        sbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentemp2();
            }
        });


        sbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentemp3();
            }
        });


        sbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentemp4();
            }
        });


        sbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentemp5();
            }
        });



        sbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentemp6();
            }
        });
    }





    public void opentemp1(){
        Intent intent = new Intent(this,saj.class);
        startActivity(intent);
    }

    public void opentemp2(){
        Intent intent = new Intent(this,sain.class);
        startActivity(intent);
    }

    public void opentemp3(){
        Intent intent = new Intent(this,debota.class);
        startActivity(intent);
    }

    public void opentemp4(){
        Intent intent = new Intent(this,tangu.class);
        startActivity(intent);
    }

    public void opentemp5(){
        Intent intent = new Intent(this,moinot.class);
        startActivity(intent);
    }

    public void opentemp6(){
        Intent intent = new Intent(this,shun.class);
        startActivity(intent);
    }
}
