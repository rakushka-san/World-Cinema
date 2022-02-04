package com.rakushkins.worldcinema;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_screen);

        Button signup_btn = (Button) findViewById(R.id.signup_signup_btn);
        signup_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText form_name = (EditText) findViewById(R.id.signup_form_name);
                EditText form_surname = (EditText) findViewById(R.id.signup_form_surname);
                EditText form_email = (EditText) findViewById(R.id.signup_form_email);
                EditText form_password = (EditText) findViewById(R.id.signup_form_password);
                EditText form_repeat_password = (EditText) findViewById(R.id.signup_form_repeat_password);

                if(form_name.getText().toString().trim().equals("") || form_surname.getText().toString().trim().equals("")
                || form_email.getText().toString().trim().equals("") || form_password.getText().toString().trim().equals("") ||
                        form_repeat_password.getText().toString().trim().equals("")) {
                    Toast.makeText(getApplicationContext(), R.string.not_filled, Toast.LENGTH_LONG).show();
                } else if (!form_email.getText().toString().contains("@")) {
                    Toast.makeText(getApplicationContext(), R.string.email_requirements, Toast.LENGTH_LONG).show();
                } else if (!form_password.getText().toString().equals(form_repeat_password.getText().toString())) {
                    Toast.makeText(getApplicationContext(), R.string.passwords_not_equal, Toast.LENGTH_LONG).show();
                } else {
                    //request
                    Intent toSignInScreen = new Intent(SignUpScreen.this, SignInScreen.class);
                    startActivity(toSignInScreen);
                }
            }
        });

        Button has_account_btn = (Button) findViewById(R.id.signup_has_account_btn);
        has_account_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toSignInScreen = new Intent(SignUpScreen.this, SignInScreen.class);
                startActivity(toSignInScreen);
            }
        });
    }
}