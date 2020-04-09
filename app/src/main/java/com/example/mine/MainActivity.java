package com.example.mine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText mEdit;
    TextView mText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void button(View view)
    {
        Intent i=new Intent(this,activity2.class);
     startActivity(i);
        mEdit = (EditText) findViewById(R.id.EditText);
        mText = (TextView) findViewById(R.id.TextView);
        mText.setText("Welcome "+mEdit.getText().toString()+"!");
    }
}
