package com.example.experiment1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed1,ed2;
    AppCompatButton b1;

    String getName,getPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1=(EditText) findViewById(R.id.user);
        ed2=(EditText) findViewById(R.id.pass);
        b1=(AppCompatButton) findViewById(R.id.log);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 getName=ed1.getText().toString();
                 getPass=ed2.getText().toString();
                Toast.makeText(getApplicationContext(),getName,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getPass,Toast.LENGTH_SHORT).show();
            }
        });
    }
}