package com.example.labone;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;

public class SimpleActivity extends AppCompatActivity {

    private final String C_TAG = "ON_CREATE";
    private final String S_TAG = "ON_START";
    private final String R_TAG = "ON_RESUMED";
    private final String P_TAG = "ON_PAUSED";
    private final String ST_TAG = "ON_STOP";
    private final String D_TAG = "ON_DESTROY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Log.i(C_TAG,"Just invoked onCreate: non-existent to stopped");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(S_TAG, "Stopped to paused");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(R_TAG, "paused to resumed");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.i(P_TAG, "resumed to paused");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(ST_TAG, "paused to stop");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.i(D_TAG, "stop to destroyed");
    }


}