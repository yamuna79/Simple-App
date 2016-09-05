package com.example.yamuna.yamunaclasstest;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Table extends AppCompatActivity {
    EditText num1;
    EditText num2;
    TextView textView;
    View layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        num1 = (EditText) findViewById(R.id.editText);
        num2 = (EditText) findViewById(R.id.editText2);
        textView = (TextView) findViewById(R.id.textView3);
        layout = findViewById(R.id.layout);
    }

    public void add(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Add or Subtract");
        builder.setMessage("Are you sure you want to ADD?");
        builder.setCancelable(false);

        String s1 = num1.getText().toString();
        String s2 = num2.getText().toString();

        final int i1 = Integer.parseInt(s1);
        final int i2 = Integer.parseInt(s2);
        builder.setNegativeButton("No, Subtract", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                int ans = i2-i1;
                String s = String.valueOf(ans);
                textView.setText("Answer : " +s);
            }
        });
        builder.setPositiveButton("Yes, Add", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                int ans = i1+i2;
                String s = String.valueOf(ans);
                textView.setText("Answer : " +s);
            }
        });

        AlertDialog alert = builder.create();
        alert.show();
    }

    public void redColor(View view) {
        int color = Color.rgb(255,0,0);
        layout.setBackgroundColor(color);
    }

    public void blueColor(View view) {
        int color = Color.rgb(0,0,255);
        layout.setBackgroundColor(color);
    }

    public void greenColor(View view) {
        int color = Color.rgb(0,255,0);
        layout.setBackgroundColor(color);
    }
}
