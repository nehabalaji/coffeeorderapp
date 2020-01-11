package com.example.coffeeordering;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText ed1, ed2, ed3;
    private TextView tv1, tv2, tv3, tv4;
    private int a=0, b=0, c=0, d=0, price, q=0, r=0, p=0;
    private String name, email;
    private CheckBox c1, c2, c3;
    boolean e, f, g;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.name_et);
        ed2 = findViewById(R.id.number_et);
        ed3 = findViewById(R.id.email_et);
        tv1 = findViewById(R.id.count1);
        tv2 = findViewById(R.id.count2);
        tv3 = findViewById(R.id.count3);
        tv4 = findViewById(R.id.summary);
        c1 =  findViewById(R.id.whipped1);
        c2 = findViewById(R.id.whipped2);
        c3 = findViewById(R.id.whipped3);


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

        e = c1.isChecked();
        f= c2.isChecked();
        g= c3.isChecked();

        if(e==true){
            p=10;
        }
        if(f==true){
            q=10;
        }
        if(g==true){
            r=10;
        }

        price=d+p+q+r;

        name=ed1.getText().toString();

       tv4.setText(name+" your total amount is "+ price);
       email=ed3.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("*/*");
        intent.putExtra(Intent.EXTRA_EMAIL, email);
        intent.putExtra(Intent.EXTRA_SUBJECT, "Bill Summary");
        intent.putExtra(Intent.EXTRA_TEXT, name+" your total amount is "+price);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }



}
