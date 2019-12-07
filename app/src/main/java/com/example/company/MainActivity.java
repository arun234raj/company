package com.example.company;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText)findViewById(R.id.usname);
        e2=(EditText)findViewById(R.id.pass);

        b1=(Button)findViewById(R.id.btn1);
        b2=(Button)findViewById(R.id.bt2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();

                if(s1.equals("Admin") && s2.equals("1234"))
                {
                    Toast.makeText(getApplicationContext(),"Login successful",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),logged.class);
                    startActivity(intent);
                }
                else {

                    Toast.makeText(getApplicationContext(),"Username or password error",Toast.LENGTH_SHORT).show();
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),Register.class);
                startActivity(intent);


            }
        });
    }
}
