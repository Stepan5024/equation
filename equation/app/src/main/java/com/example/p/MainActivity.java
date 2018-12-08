package com.example.p;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.valueOf;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText tx = (EditText) findViewById(R.id.editText2);
        final EditText tx2 = (EditText) findViewById(R.id.editText3);
        final EditText tx3 = (EditText) findViewById(R.id.editText5);
        final TextView text = (TextView) findViewById(R.id.textView4);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tx.getText().toString().equals("") || tx2.getText().toString().equals("") || tx3.getText().toString().equals("")) {
                    text.setText("Введите коэффиценты!");
                } else {

                    int b = valueOf(String.valueOf(tx2.getText()));
                    int a = valueOf(String.valueOf(tx.getText()));
                    int c = valueOf(String.valueOf(tx3.getText()));
                    if(a == 0){
                        int x1 = c / b;
                        text.setText(x1);
                    }
                    else if(b == 0) {
                        double x1 = Math.sqrt(c);
                        double x2 = -x1;
                        String res = x1 + " and " + x2;
                        text.setText(res);
                    }
                    else {
                        double d = (b * b) - (4 * a * c);
                        double x1 = (-b + Math.sqrt(d)) / 2 * a;
                        double x2 = (-b - Math.sqrt(d)) / 2 * a;
                        String res = x1 + " and " + x2;
                        text.setText(res);
                    }
                }
            }
        });
    }
}
