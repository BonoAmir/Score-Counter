 package com.example.android.scorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {

    int scoreA=0;
    int scoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void displayA(int number)
    {
        TextView scrA=(TextView)findViewById(R.id.scrA);
        scrA.setText(""+number);
    }



    private void displayB(int number)
    {
        TextView scrB=(TextView)findViewById(R.id.scrB);
        scrB.setText(""+number);
    }

    public void add3A (View view)
    {
        scoreA=scoreA+3;
        displayA(scoreA);
    }

     public void add2A (View view)
     {
         scoreA=scoreA+2;
         displayA(scoreA);
     }

     public void add1A (View view)
     {
         scoreA=scoreA+1;
         displayA(scoreA);
     }


     public void add3B (View view)
     {
         scoreB=scoreB+3;
         displayB(scoreB);
     }

     public void add2B (View view)
     {
         scoreB=scoreB+2;
         displayB(scoreB);
     }

     public void add1B (View view)
     {
         scoreB=scoreB+1;
         displayB(scoreB);
     }


     public void reset (View view)
     {


             scoreB =0;
             displayB(scoreB);
             scoreA = 0;
             displayA(scoreA);

     }

 }
