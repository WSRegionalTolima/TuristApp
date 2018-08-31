package com.regionaltolima.worldskills.turistapp.Activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.regionaltolima.worldskills.turistapp.R;

public class SplashActivity extends AppCompatActivity {

    private final int TIEMPO_SPLASH = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        iniciarSplash();
    }

    private void iniciarSplash(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                finish();
            }
        },TIEMPO_SPLASH);
    }
}
