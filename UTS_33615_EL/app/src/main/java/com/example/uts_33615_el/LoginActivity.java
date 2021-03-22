package com.example.uts_33615_el;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText Username, Password;
    private Button loginBtn2;
    boolean isValid = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Username = (EditText)findViewById(R.id.etUName);
        Password = (EditText)findViewById(R.id.etPassword);
        loginBtn2 = (Button)findViewById(R.id.btLogin);

        loginBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inpUName = Username.getText().toString();
                String inpPass = Password.getText().toString();

                if(inpUName.isEmpty() || inpPass.isEmpty())
                {
                    Toast.makeText(LoginActivity.this, "Invalid username/password.",
                            Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(LoginActivity.this, "Successfully login!",
                            Toast.LENGTH_SHORT).show();
                    Intent intMusic = new Intent(LoginActivity.this, MusicActivity.class);
                    startActivity(intMusic);
                    }
                }
            });
    }
    private boolean validate(String userName, String userPass) {
        if ((userName.equals("uasmobile")) && (userPass.equals("uasmobilegenap"))) {
            return true;
            }
            return false;
            }
    }