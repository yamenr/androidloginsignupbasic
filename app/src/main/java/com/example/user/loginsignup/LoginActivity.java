package com.example.user.loginsignup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText etUsername;
    private EditText etPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initialize();
    }

    private void initialize() {
        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);
    }

    public void gotoHome(View view) {
        User user = new User("Admin Admin", "admin", "admin");
        String username = etUsername.getText().toString();
        String password = etPassword.getText().toString();

        if (user.getUsername().equals(username) && user.getPassword().equals(password))
        {
            Toast.makeText(this, "You've logged in successfully!", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, "Incorrect Username or Password!!", Toast.LENGTH_LONG).show();
        }
    }

}
