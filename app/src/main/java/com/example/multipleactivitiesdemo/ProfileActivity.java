package com.example.multipleactivitiesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("==>", "ProfileActivity Started! ✨");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("==>", "ProfileActivity Stopped! 🥏");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("==>", "ProfileActivity Destroyed! 🧨");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
}