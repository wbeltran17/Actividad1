package com.example.actividad1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BinaryToDecimal extends AppCompatActivity {

    private TextView nameLbl, resultLbl;
    private Button calculateBtn, returnBtn;
    private EditText binaryNumberTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary_to_decimal);



        String name = getIntent().getStringExtra("welcome");
        nameLbl = findViewById(R.id.greetingDecimalLbl);
        nameLbl.setText(name);

        resultLbl = findViewById(R.id.resultDecimalLbl);

        binaryNumberTxt = findViewById(R.id.binaryNumberTxt);

        calculateBtn = findViewById(R.id.calcDecimalBtn);
        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    int binaryNumber = Integer.parseInt(binaryNumberTxt.getText().toString());
                    String result =  Integer.toBinaryString(binaryNumber);

                    resultLbl.setText(getString(R.string.resultTxt).concat(result));

                }catch (Exception e){
                    System.out.println(e.getCause());
                }
            }
        });

        returnBtn = findViewById(R.id.returnDecimalBtn);
        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}