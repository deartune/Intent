package com.jmk.edu.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonRed=(Button)findViewById(R.id.buttonRed);
        buttonRed.setOnClickListener(this);
        Button buttonGreen=(Button)findViewById(R.id.buttonGreen);
        buttonGreen.setOnClickListener(this);
        Button buttonBlue=(Button)findViewById(R.id.buttonBlue);
        buttonBlue.setOnClickListener(this);

    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonRed:
            Intent intent = null;
            intent = new Intent(this, SubActivity.class);
            startActivity(intent);
            break;

            case R.id.buttonGreen:

                intent = new Intent(this, SubActivity2.class);
                startActivity(intent);
                break;

            case R.id.buttonBlue:

                intent = new Intent(this, SubActivity1.class);
                startActivity(intent);
                break;
        }
    }
}

