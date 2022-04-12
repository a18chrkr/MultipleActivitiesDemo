package com.example.multipleactivitiesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

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

    }
}