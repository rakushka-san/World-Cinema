package com.rakushkins.worldcinema;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignInScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_screen);

        Button signin_btn = (Button) findViewById(R.id.signin_signin_btn);
        signin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText form_email = (EditText) findViewById(R.id.signin_form_email);
                EditText form_password = (EditText) findViewById(R.id.signin_form_password);

                if(form_email.getText().toString().trim().equals(""))
                {
                    Toast.makeText(getApplicationContext(), R.string.no_email, Toast.LENGTH_LONG).show();
                } else if (!form_email.getText().toString().contains("@")) {
                    Toast.makeText(getApplicationContext(), R.string.email_requirements, Toast.LENGTH_LONG).show();
                } else if (form_password.getText().toString().trim().equals("")) {
                    Toast.makeText(getApplicationContext(), R.string.no_password, Toast.LENGTH_LONG).show();
                } else {
                    //request
                }
            }
        });

        Button register_btn = (Button) findViewById(R.id.signin_register_btn);
        register_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toSignUpScreen = new Intent(SignInScreen.this, SignUpScreen.class);
                startActivity(toSignUpScreen);
            }
        });

    }
}