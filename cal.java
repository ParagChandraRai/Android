package com.example.cal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText mEdit1;
    EditText mEdit2;
    int txtView1;
    int txtView2 ;
    TextView Result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add(View view)
    {
        mEdit1 = (EditText) findViewById(R.id.f1);
        mEdit2 = (EditText) findViewById(R.id.f2);
        txtView1 = Integer.parseInt(mEdit1.getText().toString());
        txtView2 = Integer.parseInt(mEdit2.getText().toString());
        Result = (TextView) findViewById(R.id.textView2);

        String sum=(txtView1+txtView2)+"";
        Result.setText(sum);
    }
    public void sub(View view)
    {
        mEdit1 = (EditText) findViewById(R.id.f1);
        mEdit2 = (EditText) findViewById(R.id.f2);
        txtView1 = Integer.parseInt(mEdit1.getText().toString());
        txtView2 = Integer.parseInt(mEdit2.getText().toString());

        String sub=(txtView1-txtView2)+"";
        Result.setText(sub);
    }
    public void mul(View view)
    {
        mEdit1 = (EditText) findViewById(R.id.f1);
        mEdit2 = (EditText) findViewById(R.id.f2);
        txtView1 = Integer.parseInt(mEdit1.getText().toString());
        txtView2 = Integer.parseInt(mEdit2.getText().toString());

        String mul=(txtView1*txtView2)+"";
        Result.setText(mul);
    }
    public void div(View view)
    {
        mEdit1 = (EditText) findViewById(R.id.f1);
        mEdit2 = (EditText) findViewById(R.id.f2);
        txtView1 = Integer.parseInt(mEdit1.getText().toString());
        txtView2 = Integer.parseInt(mEdit2.getText().toString());

        String div=(txtView1/txtView2)+"";
        Result.setText(div);
    }
}