package com.example.randomnumbergenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

    Random random= new Random();
    public int x= random.nextInt(10);
//    int x=5;
    public void btnGenerateCheck (View view ){

        //created a random number

        EditText number = findViewById(R.id.enterGuess);

        TextView result = findViewById(R.id.result);

        String n="";
        int no=0;


        int t=1;
        while(t <6) {

            //chances to give in a particular session
            t++;

            //number input from user
            n= number.getText().toString();
            no = Integer.parseInt(n);




            //check the input number with the random number generated
            if(no==x) {

                result.setText("Congratulation");

            }
           if(no >x ){
               result.setText("choose a lower number");
//               Toast.makeText(MainActivity.this , "lower", Toast.LENGTH_SHORT).show();



               n= number.getText().toString();
                no = Integer.parseInt(n);

           }
           if(no <x )
           {
               result.setText("choose a higher number");

//               Toast.makeText(MainActivity.this , "higher", Toast.LENGTH_SHORT).show();


               n= number.getText().toString();
                no = Integer.parseInt(n);



            }


        }
//        result.setText("game over");



    }



}