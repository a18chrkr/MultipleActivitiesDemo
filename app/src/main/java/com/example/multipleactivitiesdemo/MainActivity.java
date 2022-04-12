package com.example.multipleactivitiesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button sign_in;
    private EditText username;

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("==>", "MainActivity Resumed! 🎈");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("==>", "MainActivity Started! ✨");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("==>", "MainActivity Stopped! 🥏");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("==>", "MainActivity Destroyed! 🧨");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("==>", "MainActivity Created! 🔨");

        username = findViewById(R.id.signin_name);
        username.getText();
        sign_in = findViewById(R.id.signin_buttom);
        sign_in.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
            Log.d("==>", "Du har klickat på knappen!");
            Log.d("===>", "Username: " + username.getText().toString());
            Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
            startActivity(intent);
            }
        });
    }
}