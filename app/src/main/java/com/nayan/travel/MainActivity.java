package com.nayan.travel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH = 1000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
                                      @Override
                                      public void run() {
                                          Intent homeintent = new Intent(MainActivity.this, select.class);
                                          startActivity(homeintent);
                                          finish();
                                      }
                                  }, SPLASH
        );
    }
}
