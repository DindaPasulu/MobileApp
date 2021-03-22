package com.example.uts_33615_el;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button profilBtn, loginBtn1, loginBtn2;
    private EditText Username, Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        profilBtn = findViewById(R.id.btnProfil);
        loginBtn1 = findViewById(R.id.btnLogin);

        profilBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProfilActivity.class);
                startActivity(intent);
            }
        });
        loginBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
    public void IntProfil(View view)
    {
        Intent intProf = new Intent(MainActivity.this, ProfilActivity.class);
        startActivity(intProf);
    }
    public void IntLogin(View view)
    {
        Intent intLogin = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intLogin);
    }

}