package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String currentDis = ""; // to keep track of the values been clicked on
    double globalValue;
    String storeAddvalue = "";
    String storeSubvalue="";
    String storeMulvalue="";
    String storeDivalue="";
    double numSquareRoot;

    String storeExpvalue = "";
    Boolean clickedAdd = false;
    Boolean clickedSub = false;
    Boolean clickedMul = false;
    Boolean clickedDiv = false;
    Boolean clickedCarret = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtDisplay = findViewById(R.id.display);
        txtDisplay.setTextSize(20);

        Button btnClear = findViewById(R.id.button18);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentDis = "";
                txtDisplay.setText("0");
            }
        });

        Button btnClearOnce = findViewById(R.id.button20);
        btnClearOnce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!currentDis.equals("")){
                    currentDis = currentDis.substring(0, currentDis.length()-1);
                    txtDisplay.setText(currentDis);
                }else{
                    txtDisplay.setText("0");
                }
            }
        });

        Button btn1 = findViewById(R.id.button12);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentDis += "1";
                txtDisplay.setText(currentDis);
            }
        });

        Button btn2 = findViewById(R.id.button11);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentDis += "2";
                txtDisplay.setText(currentDis);
            }
        });

        Button btn3 = findViewById(R.id.button10);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentDis += "3";
                txtDisplay.setText(currentDis);
            }
        });

        Button btn4 = findViewById(R.id.button9);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentDis += "4";
                txtDisplay.setText(currentDis);
            }
        });

        Button btn5 = findViewById(R.id.button8);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentDis += "5";
                txtDisplay.setText(currentDis);
            }
        });

        Button btn6 = findViewById(R.id.button7);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentDis += "6";
                txtDisplay.setText(currentDis);
            }
        });

        Button btn7 = findViewById(R.id.button6);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentDis += "7";
                txtDisplay.setText(currentDis);
            }
        });

        Button btn8 = findViewById(R.id.button5);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentDis += "8";
                txtDisplay.setText(currentDis);
            }
        });

        Button btn9 = findViewById(R.id.button4);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentDis += "9";
                txtDisplay.setText(currentDis);
            }
        });

        Button btn0 = findViewById(R.id.button14);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentDis += "0";
                txtDisplay.setText(currentDis);
            }
        });

        Button btnDot = findViewById(R.id.button21);
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentDis += ".";
                txtDisplay.setText(currentDis);
            }
        });

        Button btnAdd = findViewById(R.id.button13);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!currentDis.equals("")){
                    storeAddvalue = currentDis;
                    currentDis = "";
                    clickedAdd = true;
                }
            }
        });

        Button btnSub = findViewById(R.id.button17);
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!currentDis.equals("")){
                    storeSubvalue = currentDis;
                    currentDis = currentDis + "-";
                    txtDisplay.setText(currentDis);
                    currentDis = "";
                    clickedSub = true;
                }
            }
        });

        Button btnMul = findViewById(R.id.button15);
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!currentDis.equals("")){
                    storeMulvalue = currentDis;
                    currentDis = "";
                    clickedMul = true;
                }
            }
        });


        Button btnDiv = findViewById(R.id.button16);
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!currentDis.equals("")){
                    storeDivalue = currentDis;
                    currentDis = "";
                    clickedDiv = true;
                }
            }
        });

//        Button rootBtn = findViewById(R.id.button);
//        rootBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                numSquareRoot = Double.parseDouble(currentDis);
//                if(numSquareRoot >= 0){
//                    numSquareRoot = Math.sqrt(numSquareRoot);
//                    currentDis = String.valueOf(numSquareRoot);
//                    txtDisplay.setText(currentDis);
//                }else{
//                    txtDisplay.setText("Cannot find the square root of negative values");
//                }
//            }
//        });
        Button btnExp = findViewById(R.id.button2);
        btnExp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!currentDis.equals("")){
                    storeExpvalue = currentDis;
                    currentDis = "";
                    clickedCarret = true;
                }
            }
        });
        Button btnEquals = findViewById(R.id.button19);
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickedAdd){
                    if(!storeAddvalue.equals("") && !currentDis.equals("")){
                        globalValue = Double.parseDouble(storeAddvalue) + Double.parseDouble(currentDis);
                        currentDis = String.valueOf(globalValue);

                        txtDisplay.setText(currentDis);
                    }else{
                        txtDisplay.setText("Type the next number to add");
                    }
                    clickedAdd = false;
                }
                if(clickedSub){
                    if(!storeSubvalue.equals("") && !currentDis.equals("")){
                        globalValue = Double.parseDouble(storeSubvalue) - Double.parseDouble(currentDis);
                        currentDis = String.valueOf(globalValue);

                        txtDisplay.setText(currentDis);
                    }else{
                        txtDisplay.setText("Type the next number to sub");
                    }
                    clickedSub = false;
                }
                if(clickedMul){
                    if(!storeMulvalue.equals("") && !currentDis.equals("")){
                        globalValue = Double.parseDouble(storeMulvalue) * Double.parseDouble(currentDis);
                        currentDis = String.valueOf(globalValue);

                        txtDisplay.setText(currentDis);
                    }else{
                        txtDisplay.setText("Type the next number to multiply");
                    }
                    clickedMul = false;
                }
                if(clickedDiv){
                    if(!storeDivalue.equals("") && !currentDis.equals("")){
                        if(currentDis.equals("0")){
                            txtDisplay.setText("Cannot divide by zero be serious");
                        }else{
                            globalValue = Double.parseDouble(storeDivalue) / Double.parseDouble(currentDis);
                            currentDis = String.valueOf(globalValue);

                            txtDisplay.setText(currentDis);
                        }
                    }else{
                        txtDisplay.setText("Type the next number to divide");
                    }
                    clickedDiv = false;
                }
                if(clickedCarret){
                    if(!storeExpvalue.equals("") && !currentDis.equals("")){
                        globalValue = Math.pow(Double.parseDouble(storeExpvalue), Double.parseDouble(currentDis));
                        currentDis = String.valueOf(globalValue);

                        txtDisplay.setText(currentDis);
                    }else{
                        txtDisplay.setText("Type your power");
                    }
                    clickedCarret = false;
                }
            }
        });
    }
}