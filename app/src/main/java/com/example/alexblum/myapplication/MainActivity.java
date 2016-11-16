package com.example.alexblum.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{

    //declare all widgets
    private Button button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Link Widget to UI
        button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        //This will happen when the button gets clicked
        //if (v == findViewById(R.id.button1)) {
            Intent intent = new Intent(this, Main2Activity.class);
            startActivity(intent);
        //} else {
        //    Toast.makeText(this, "Please click the Button", Toast.LENGTH_SHORT);
        //}
    }
}
