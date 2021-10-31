package com.example.randomnumbergenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//    public static void onBtnClick(android.view.View){
//
//

    public void btnClick(View view ){

        EditText editText = findViewById(R.id.editTextName);

        TextView textview1 =findViewById(R.id.textView1);
        TextView textview2 =findViewById(R.id.textView2);

        textview1.setText("Hello " + editText.getText().toString() );
        textview2.setText("WELCOME To The GAME");


    }

    public void btnGenerateCheck (View view ){

        //created a random number
        Random random= new Random();
        int x= random.nextInt(10);

        int t=1;
        while(t <6) {

            //chances to give in a particular session
            t++;

            //number input from user
            EditText number = findViewById(R.id.enterGuess);
            String n= number.getText().toString();
            int no = Integer.parseInt(n);


            TextView result = findViewById(R.id.result);


            //check the input number with the random number generated
            if(no==x) {

                result.setText("Congratulation");
            }
            else if(no >x ){

                n= number.getText().toString();
                no = Integer.parseInt(n);

                result.setText("choose a lower number");

            }
            else{

                n= number.getText().toString();
                no = Integer.parseInt(n);

                result.setText("choose a lower number");

            }

        }


    }



}