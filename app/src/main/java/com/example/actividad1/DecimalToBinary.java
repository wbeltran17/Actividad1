package com.example.actividad1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DecimalToBinary extends AppCompatActivity {

    private TextView nameLbl, resultLbl;
    private Button calculateBtn, returnBtn;
    private EditText decimalNumberTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decimal_to_binary);



        String name = getIntent().getStringExtra("welcome");
        nameLbl = findViewById(R.id.greetingBinarylLbl);
        nameLbl.setText(name);

        resultLbl = findViewById(R.id.resultBinarylLbl);


        decimalNumberTxt = findViewById(R.id.decimalNumberTxt);

        calculateBtn = findViewById(R.id.calcBinaryBtn);
        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    int result =Integer.parseInt(decimalNumberTxt.getText().toString(),2);

                    resultLbl.setText(getString(R.string.resultTxt).concat(String.valueOf(result)));

                }catch (Exception e){
                    System.out.println(e.getCause());
                }
            }
        });

        returnBtn = findViewById(R.id.returnBinaryBtn);
        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}