package com.example.licznikpk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addNumbers(View view){
        EditText editext = (EditText) findViewById(R.id.edit_message);
        int _counter = Integer.parseInt(editext.getText().toString());
        _counter++;
        editext.setText(String.valueOf(_counter));
    }

    public void subNumbers(View view){
        EditText editext = (EditText) findViewById(R.id.edit_message);
        int _counter = Integer.parseInt(editext.getText().toString());
        _counter--;
        editext.setText(String.valueOf(_counter));
    }

    public void toZero(View view){
        EditText editext = (EditText) findViewById(R.id.edit_message);
        int _counter = Integer.parseInt(editext.getText().toString());
        _counter = 0;
        editext.setText(String.valueOf(_counter));
    }





}
