package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnClare,btnSwitch,btnDivide,
            btnMultiplication,btnSub,btnAdd,btnEqualTo,btnBack,btnDot;
    EditText editText;
    float r1,r2;
    boolean add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0=(Button) findViewById((R.id.btn0));
        btn1=(Button) findViewById((R.id.btn1));
        btn2=(Button) findViewById((R.id.btn2));
        btn3=(Button) findViewById((R.id.btn3));
        btn4=(Button) findViewById((R.id.btn4));
        btn5=(Button) findViewById((R.id.btn5));
        btn6=(Button) findViewById((R.id.btn6));
        btn7=(Button) findViewById((R.id.btn7));
        btn8=(Button) findViewById((R.id.btn8));
        btn9=(Button) findViewById((R.id.btn9));
        btnClare=(Button) findViewById((R.id.btnClare));
        btnDivide=(Button) findViewById((R.id.btnDivide));
        btnMultiplication=(Button) findViewById((R.id.btnMultiplication));
        btnSub=(Button) findViewById((R.id.btnSub));
        btnAdd=(Button) findViewById((R.id.btnAdd));
        btnEqualTo=(Button) findViewById((R.id.btnEqualTo));
        btnBack=(Button) findViewById((R.id.btnBack));
        btnDot=(Button) findViewById((R.id.btnDivide));
        editText=(EditText) findViewById(R.id.editText);

//        On click listener start here...

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"9");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+".");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText==null){
                    editText.setText("");
                }
                else {
                    r1 =Float.parseFloat(editText.getText()+"");
                    add=true;
                    editText.setText("");
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText==null){
                    editText.setText("");
                }
                else {
                    r1 =Float.parseFloat(editText.getText()+"");
                    sub=true;
                    editText.setText("");
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText==null){
                    editText.setText("");
                }
                else {
                    r1 =Float.parseFloat(editText.getText()+"");
                    div=true;
                    editText.setText("");
                }
            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText==null){
                    editText.setText("");
                }
                else {
                    r1 =Float.parseFloat(editText.getText()+"");
                    mul=true;
                    editText.setText("");
                }
            }
        });

        btnClare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String num = editText.getText().toString();
                int input = num.length();
                if (input > 0) {
                    editText.setText(num.substring(0, input - 1));
                }    }
        });

        btnEqualTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r2 =Float.parseFloat(editText.getText()+"");
                if(add==true){
                    editText.setText(r1+r2 +"");
                    add=false;
                }

                if(sub==true){
                    editText.setText(r1-r2 +"");
                    sub=false;
                }

                if(mul==true){
                    editText.setText(r1*r2 +"");

                    mul=false;
                }

                if(div==true){
                    editText.setText(r1/r2 +"");
                    div=false;
                }
            }
        });
//        On click listener End here...





    }
}