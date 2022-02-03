package com.rakushkins.worldcinema;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class LaunchScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launchscreen);

        Intent toSignInScreen = new Intent(LaunchScreen.this, SignInScreen.class);
        startActivity(toSignInScreen);
        finish();
    }
}