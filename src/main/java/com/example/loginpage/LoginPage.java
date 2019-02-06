package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    Button loginBtn;
    EditText passwordText,emailText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        loginBtn = findViewById(R.id.loginBtn_id);
        passwordText = findViewById(R.id.passwordText_id);
        emailText = findViewById(R.id.emailText_id);

    }

    public void LoginListener(){

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!TextUtils.isEmpty(emailText.toString()) && !TextUtils.isEmpty(passwordText.toString())){

                    //login process

                }else {

                    Toast.makeText(LoginPage.this, "Please fill all the fields!", Toast.LENGTH_SHORT).show();

                }

            }
        });

    }
}
