package com.example.p;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tv = (TextView) findViewById(R.id.text);
        final EditText tx = (EditText) findViewById(R.id.editText);
        final EditText tx2 = (EditText) findViewById(R.id.editText2);
        Button btnsum = (Button) findViewById(R.id.btnpl);
        Button btnmin = (Button) findViewById(R.id.btnmin);
        Button btnmult = (Button) findViewById(R.id.btnmult);
        Button btndiv = (Button) findViewById(R.id.btndiv);

        btnsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (tx.getText().toString().equals("") || tx2.getText().toString().equals("")) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Надо ввести числа!", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    int a = Integer.valueOf(String.valueOf(tx.getText()));
                    int b = Integer.valueOf(String.valueOf(tx2.getText()));
                    int res = a + b;
                    tv.setText("" + res);
                }


            }
        });
        btnmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tx.getText().toString().equals("") || tx2.getText().toString().equals("")) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Надо ввести числа!", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    int a = Integer.valueOf(String.valueOf(tx.getText()));
                    int b = Integer.valueOf(String.valueOf(tx2.getText()));
                    int res = a - b;
                    tv.setText(res+ "");
                }

            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tx.getText().toString().equals("") || tx2.getText().toString().equals("")) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Надо ввести числа!", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    int a = Integer.valueOf(String.valueOf(tx.getText()));
                    int b = Integer.valueOf(String.valueOf(tx2.getText()));
                    int res = a / b;
                    tv.setText(res+"");
                }

            }
        });
        btnmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tx.getText().toString().equals("") || tx2.getText().toString().equals("")) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Надо ввести числа!", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    int a = Integer.valueOf(String.valueOf(tx.getText()));
                    int b = Integer.valueOf(String.valueOf(tx2.getText()));
                    int res = a * b;
                    tv.setText(res+"");
                }

            }
        });
    }

    }


