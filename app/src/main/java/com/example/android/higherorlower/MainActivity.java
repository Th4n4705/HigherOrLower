package com.example.android.higherorlower;

import android.provider.Telephony;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    public  int  randomNumber;

    public Random random=new Random();

    public void Guessing(View view)
    {
        EditText editText=(EditText) findViewById(R.id.edit_text);
        if(!editText.getText().toString().equals(""))
        {
            int guessedNumber = Integer.parseInt(editText.getText().toString());
            if(randomNumber==guessedNumber)
            {
                Toast.makeText(MainActivity.this,"That's right! Try again!",Toast.LENGTH_SHORT).show();
                randomNumber=random.nextInt(20)+0;
            }
            else if(randomNumber>guessedNumber)
            {
                Toast.makeText(MainActivity.this,"Higher!",Toast.LENGTH_SHORT).show();
            }
            else if(randomNumber<guessedNumber)
            {
                Toast.makeText(MainActivity.this,"Lower!",Toast.LENGTH_SHORT).show();
            }
            editText.setText("");
        }
        else
        {
            Toast.makeText(MainActivity.this,"Insert a number!",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        randomNumber=random.nextInt(20)+0;
    }
}
