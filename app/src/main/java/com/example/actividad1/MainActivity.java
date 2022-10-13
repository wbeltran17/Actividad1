package com.example.actividad1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nameTxt;
    private Button hypoBtn, decimalBtn, binaryBtn, exitBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameTxt = findViewById(R.id.nameTxt);

        hypoBtn = findViewById(R.id.hypoBtn);
        hypoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent hypoIntent =new Intent(MainActivity.this, Hypotenusa.class);
                hypoIntent.setAction(Intent.ACTION_SEND);
                hypoIntent.putExtra("welcome", getWelcome() );
                startActivity(hypoIntent);
            }
        });
        decimalBtn = findViewById(R.id.decimalBtn);
        decimalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent decimalIntent =new Intent(MainActivity.this, BinaryToDecimal.class);
                decimalIntent.setAction(Intent.ACTION_SEND);
                decimalIntent.putExtra("welcome", getWelcome() );
                startActivity(decimalIntent);
            }
        });
        binaryBtn = findViewById(R.id.binaryBtn);
        binaryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent binaryIntent =new Intent(MainActivity.this, DecimalToBinary.class);
                binaryIntent.setAction(Intent.ACTION_SEND);
                binaryIntent.putExtra("welcome", getWelcome() );
                startActivity(binaryIntent);
            }
        });
        exitBtn = findViewById(R.id.exitBtn);
        exitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private String getName(){
        return  nameTxt.getText().toString();
    }

    private String getWelcome(){
        return getString(R.string.welcomeTxt).concat(" ").concat(getName());
    }
}