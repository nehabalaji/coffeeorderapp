package com.example.coffeeordering;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText ed1, ed2;
    private TextView tv1, tv2, tv3, tv4;
    private int a=0, b=0, c=0, d=0;
    private String name;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.name_et);
        ed2 = findViewById(R.id.number_et);
        tv1 = findViewById(R.id.count1);
        tv2 = findViewById(R.id.count2);
        tv3 = findViewById(R.id.count3);
        tv4 = findViewById(R.id.summary);


    }
    public void inc1(View view){
        a++;
        tv1.setText(""+a);

    }
    public void dec1(View view){
        if(a>0){
        a--;}
        tv1.setText(""+a);
    }

    public void inc2(View view){
        b++;
        tv2.setText(""+b);

    }
    public void dec2(View view){
        if(b>0){
        b--;}
        tv2.setText(""+b);
    }
    public void inc3(View view){
        c++;
        tv3.setText(""+c);

    }
    public void dec3(View view){
        if(c>0){
        c--;}
        tv3.setText(""+c);
    }

    public void submit(View view){
        d=a*20+b*20+c*20;
        name=ed1.getText().toString();
        name=name+" your bill amount is "+d+" rupees";
        tv4.setText(""+name);

    }


}
