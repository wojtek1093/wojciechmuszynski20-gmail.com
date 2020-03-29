package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button Addition,Subtraction,Multiplication,Division;
    private EditText et1, et2, et3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Addition=(Button) findViewById(R.id.btnAdd);
        Subtraction=(Button) findViewById(R.id.btnSub);
        Multiplication=(Button) findViewById(R.id.btnMul);
        Division=(Button) findViewById(R.id.btnDiv);
        et1=(EditText) findViewById(R.id.et1);
        et2=(EditText) findViewById(R.id.et2);
        et3=(EditText) findViewById(R.id.et3);
        Addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1.getText().toString().equals("") || et2.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"Wpisz obie liczby", Toast.LENGTH_SHORT).show();
                }
                else{
                    et1.getText().toString();
                    et2.getText().toString();
                    double a1=Double.valueOf(et1.getText().toString());
                    double a2=Double.valueOf(et2.getText().toString());
                    double a3;
                    a3=a2+a1;
                    et3.setText(String.valueOf(a3));

                }


            }
        });
        Subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1.getText().toString().equals("") || et2.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"Wpisz obie liczby", Toast.LENGTH_SHORT).show();
                }
                else{
                    et1.getText().toString();
                    et2.getText().toString();
                    double a1=Double.valueOf(et1.getText().toString());
                    double a2=Double.valueOf(et2.getText().toString());
                    double a3;
                    a3=a1 - a2;
                    et3.setText(String.valueOf(a3));

                }


            }
        });
        Multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1.getText().toString().equals("") || et2.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"Wpisz obie liczby", Toast.LENGTH_SHORT).show();
                }
                else{
                    et1.getText().toString();
                    et2.getText().toString();
                    double a1=Double.valueOf(et1.getText().toString());
                    double a2=Double.valueOf(et2.getText().toString());
                    double a3;
                    a3=a2 * a1;
                    et3.setText(String.valueOf(a3));

                }


            }
        });
        Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1.getText().toString().equals("") || et2.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"Wpisz obie liczby", Toast.LENGTH_SHORT).show();
                }
                else if(et2.getText().toString().equals("0")){
                    Toast.makeText(MainActivity.this,"Nie dzielimy przez 0", Toast.LENGTH_SHORT).show();


                }else{
                    et1.getText().toString();
                    et2.getText().toString();
                    double a1=Double.valueOf(et1.getText().toString());
                    double a2=Double.valueOf(et2.getText().toString());
                    double a3;
                    a3=a1 / a2;
                    et3.setText(String.valueOf(a3));

                }


            }
        });






    }
}
