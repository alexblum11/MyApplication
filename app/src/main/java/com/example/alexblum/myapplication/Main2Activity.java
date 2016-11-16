package com.example.alexblum.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends Activity implements View.OnClickListener{

    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        //This will happen when the button gets clicked
        if (v == findViewById(R.id.button2)) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Please click the Button", Toast.LENGTH_SHORT);
        }
    }
}
