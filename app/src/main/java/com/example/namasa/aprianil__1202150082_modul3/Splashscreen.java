package com.example.namasa.aprianil__1202150082_modul3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;

public class Splashscreen extends AppCompatActivity {
    private int SplashInterval = 3000; //waktu pindah
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Splashscreen.this, LoginActivity.class));
                //display toast
                Toast.makeText(Splashscreen.this, "WELCOME", Toast.LENGTH_SHORT).show();
                finish();
            }
        },SplashInterval);
    }
}
