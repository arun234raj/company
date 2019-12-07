package com.example.company;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5,e6,e7;
    Button b1,b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        e1=(EditText)findViewById(R.id.name);
        e2=(EditText)findViewById(R.id.des);
        e3=(EditText)findViewById(R.id.salary);
        e4=(EditText)findViewById(R.id.cname);
        e5=(EditText)findViewById(R.id.phno);
        e6=(EditText)findViewById(R.id.pass);
        e7=(EditText)findViewById(R.id.repass);

        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = e1.getText().toString().trim();
                String s2 = e2.getText().toString().trim();
                String s3 = e3.getText().toString().trim();
                String s4 = e4.getText().toString().trim();
                String s5 = e5.getText().toString().trim();
                String s6 = e6.getText().toString().trim();
                String s7 = e7.getText().toString().trim();

                if(s1.equals("") && s2.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"filed empty !",Toast.LENGTH_SHORT).show();
                }
                else  if(s3.equals("") && s4.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"filed empty !",Toast.LENGTH_SHORT).show();
                }
                else if(s5.equals("") && s6.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"filed empty !",Toast.LENGTH_SHORT).show();
                }
                else if(s7.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"filed empty !",Toast.LENGTH_SHORT).show();
                }
                else if(s6.equals(s7))
                {
                    Toast.makeText(getApplicationContext(),"registered successful",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),logged.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(getApplicationContext(),"password and re-password should be same",Toast.LENGTH_LONG).show();
                }

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
