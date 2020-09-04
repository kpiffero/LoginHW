package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button login;

    EditText user;
    EditText pass_word;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button) findViewById(R.id.login_button);
        user = (EditText) findViewById(R.id.username);
        pass_word = (EditText) findViewById(R.id.password);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (user.getText().toString().equals("din_djarin") &&
                        pass_word.getText().toString().equals("baby_yoda_ftw")) {

                    Intent intent = new Intent(MainActivity.this, Landing.class);
                    startActivity(intent);

                } else if (!user.getText().toString().equals("din_djarin") &&
                        !pass_word.getText().toString().equals("baby_yoda_ftw")) {
                    Toast.makeText(getApplicationContext(),
                            "Incorrect Username and Password", Toast.LENGTH_SHORT).show();

                    user.setBackgroundColor(Color.RED);
                    pass_word.setBackgroundColor(Color.RED);
                } else if (!user.getText().toString().equals("din_djarin")) {
                    Toast.makeText(getApplicationContext(),
                            "Incorrect Username", Toast.LENGTH_SHORT).show();

                    user.setVisibility(View.VISIBLE);
                    pass_word.setBackgroundColor(Color.WHITE);
                    user.setBackgroundColor(Color.RED);

                } else if (!pass_word.getText().toString().equals("baby_yoda_ftw")) {
                    Toast.makeText(getApplicationContext(),
                            "Incorrect Password", Toast.LENGTH_SHORT).show();

                    pass_word.setVisibility(View.VISIBLE);
                    user.setBackgroundColor(Color.WHITE);
                    pass_word.setBackgroundColor(Color.RED);
                }
            }
        });
    }
}
