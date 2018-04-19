package com.example.phamg.quanly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Passcode extends AppCompatActivity {

    EditText edn1, edn2, edn3, edn4;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnExit, btnDel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passcode);

        controls();

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input("0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input("1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input("2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input("3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input("4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input("5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input("6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input("7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input("8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input("9");
            }
        });

        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                del();
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void controls(){
        edn1 = (EditText) findViewById(R.id.ed_n1);
        edn2 = (EditText) findViewById(R.id.ed_n2);
        edn3 = (EditText) findViewById(R.id.ed_n3);
        edn4 = (EditText) findViewById(R.id.ed_n4);
        btn0 = (Button) findViewById(R.id.btn_n0);
        btn1 = (Button) findViewById(R.id.btn_n1);
        btn2 = (Button) findViewById(R.id.btn_n2);
        btn3 = (Button) findViewById(R.id.btn_n3);
        btn4 = (Button) findViewById(R.id.btn_n4);
        btn5 = (Button) findViewById(R.id.btn_n5);
        btn6 = (Button) findViewById(R.id.btn_n6);
        btn7 = (Button) findViewById(R.id.btn_n7);
        btn8 = (Button) findViewById(R.id.btn_n8);
        btn9 = (Button) findViewById(R.id.btn_n9);
        btnExit = (Button) findViewById(R.id.btn_exit_pc);
        btnDel = (Button) findViewById(R.id.btn_del_pc);
    }

    public void input(String n){
        boolean test = false;
        if(test == false && edn1.getText().toString().equalsIgnoreCase("")){
            edn1.setText(n);
            test = true;
        }
        if(test == false && edn2.getText().toString().equalsIgnoreCase("")){
            edn2.setText(n);
            test = true;
        }
        if(test == false && edn3.getText().toString().equalsIgnoreCase("")){
            edn3.setText(n);
            test = true;
        }
        if(test == false && edn4.getText().toString().equalsIgnoreCase("")){
            edn4.setText(n);
            test = true;
        }
        if(!edn4.getText().toString().equalsIgnoreCase("")){
            if(edn1.getText().toString().concat(edn2.getText().toString().concat(edn3.getText().toString().concat(edn4.getText().toString()))).equalsIgnoreCase("0000")){
                Toast.makeText(getApplicationContext(),"Đăng nhập thành công!", Toast.LENGTH_SHORT).show();
                Intent myIntent = new Intent(Passcode.this, MainActivity.class);
                startActivity(myIntent);
            }else{
                edn1.setText("");
                edn2.setText("");
                edn3.setText("");
                edn4.setText("");
                Toast.makeText(getApplicationContext(),"Sai mật khẩu!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void del(){
        boolean test = false;
        if(test == false && !edn4.getText().toString().equalsIgnoreCase("")){
            edn4.setText("");
            test = true;
        }
        if(test == false && !edn3.getText().toString().equalsIgnoreCase("")){
            edn3.setText("");
            test = true;
        }
        if(test == false && !edn2.getText().toString().equalsIgnoreCase("")){
            edn2.setText("");
            test = true;
        }
        if(test == false && !edn1.getText().toString().equalsIgnoreCase("")){
            edn1.setText("");
            test = true;
        }
    }
}
