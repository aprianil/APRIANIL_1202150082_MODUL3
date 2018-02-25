package com.example.namasa.aprianil__1202150082_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText Username, Pass;
    private Button Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);


        Username = (EditText)findViewById(R.id.userForm);
        Pass = (EditText)findViewById(R.id.passForm);
        Login = (Button) findViewById(R.id.btnLogin);


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = Username.getText().toString().trim();
                String pass = Pass.getText().toString().trim();

                if(user.equals("EAD") && pass.equals("MOBILE")){
                    Intent intent = new Intent(LoginActivity.this, MenuActivity.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(LoginActivity.this, "Username and Password are incorect. Try Again", Toast.LENGTH_SHORT).show();
                }
                if(user.isEmpty()){
                    Toast.makeText(LoginActivity.this, "Please Input Username", Toast.LENGTH_SHORT).show();
                }if(pass.isEmpty()){
                    Toast.makeText(LoginActivity.this, "Please Input Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
