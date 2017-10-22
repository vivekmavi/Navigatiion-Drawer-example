package com.example.hi.navigationhigh;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.String;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    TextView tv1;
    Button button1;
    String data1,data2;
   public static SharedPreferences sharedPreferences;
    //static so that it contains same reference for each java file or class that uses it.
    //that is which ever class which is going to fetch data from this sharedpreference.
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 =(Button) findViewById(R.id.login);
        ed1 =(EditText)  findViewById(R.id.username);
        ed2 =(EditText)  findViewById(R.id.password);
        tv1 =(TextView)  findViewById(R.id.show);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                sharedPreferences = getSharedPreferences("preference",MODE_PRIVATE);
                editor = sharedPreferences.edit();
                editor.putString("username",ed1.getText().toString());
                editor.putString("pssword",ed2.getText().toString());
                editor.apply();
                String user = sharedPreferences.getString("username","");
                String pass = sharedPreferences.getString("pssword","");
                Log.e("username",user);

                Intent intent = new Intent(MainActivity.this,secondactivity.class);
                startActivity(intent);
            }
        } );
    }
}
