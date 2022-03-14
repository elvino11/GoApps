package com.example.goapps.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.example.goapps.R;

public class LoginActivity extends AppCompatActivity {

    ImageButton login;
    EditText etUsername, etPassword;

    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);

        setContentView(R.layout.login_relative);

        login = (ImageButton) findViewById(R.id.btnLogin);
        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (etPassword.getText().toString().toUpperCase().equals("TEST1")){
                    loginSuskes();
                } else {
                    Toast.makeText(getApplicationContext(), "Salah Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void loginSuskes(){
        String username = etUsername.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        //kirimkan username ke tampilan utama
        intent.putExtra("USERNAME", username);
        startActivity(intent);
    }
}
