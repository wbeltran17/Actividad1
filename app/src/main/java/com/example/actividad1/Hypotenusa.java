package com.example.actividad1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Hypotenusa extends AppCompatActivity {

    private TextView nameLbl, resultLbl;
    private EditText oppositeSideTxt,  adjacentSideTxt;
    private Button calculateBtn, returnBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hypotenusa);

        String name = getIntent().getStringExtra("welcome");
        nameLbl = findViewById(R.id.greetingHypLbl);
        nameLbl.setText(name);

        resultLbl = findViewById(R.id.resultLbl);

        oppositeSideTxt = findViewById(R.id.oppositeSideTxt);
        adjacentSideTxt = findViewById(R.id.adjacentSideTxt);

        calculateBtn = findViewById(R.id.calcHypoBtn);
        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               try {
                   int oppositeSide = Integer.parseInt(oppositeSideTxt.getText().toString());
                   int adjacentSide = Integer.parseInt(adjacentSideTxt.getText().toString());
                   double result =  Math.hypot(oppositeSide, adjacentSide);

                   resultLbl.setText(getString(R.string.resultTxt).concat(String.valueOf(result)));

               }catch (Exception e){
                   System.out.println(e.getCause());
               }
            }
        });

        returnBtn = findViewById(R.id.returnHypoBtn);
        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}