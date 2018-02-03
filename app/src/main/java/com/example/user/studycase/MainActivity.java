package com.example.user.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import static android.util.Log.*;

public class MainActivity extends AppCompatActivity {

    public MainActivity() {
        intent = new Intent(this, Main2Activity.class);
        startActivity(intent);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }
    private static final String Log_TAG =
            MainActivity.class.getSimpleName();
    
            Intent intent;

    }

    public void launchSecondActivity(View view) {
        Log.d(Log_TAG, "Jangan disini makan malamnya, uang kamu tidak cukup");

    }
}
