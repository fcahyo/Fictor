package com.example.asus.fictor;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by ASUS on 19/12/2017.
 */

public class SplashActivity extends AppCompatActivity {

    private static int SPLASH_TIMEOUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent introIntent = new Intent(SplashActivity.this, IntroActivity.class);
                startActivity(introIntent);
                finish();
            }
        }, SPLASH_TIMEOUT);
    }
}
