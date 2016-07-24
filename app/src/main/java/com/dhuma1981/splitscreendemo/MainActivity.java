package com.dhuma1981.splitscreendemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean isInMultiWindowMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        isInMultiWindowMode=isInMultiWindowMode();

        if(isInMultiWindowMode){
            Toast.makeText(MainActivity.this, "You are in multi window mode", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(MainActivity.this, "You are in full screen mode", Toast.LENGTH_SHORT).show();
        }

    }
}
