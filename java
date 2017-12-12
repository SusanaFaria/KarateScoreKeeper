package com.example.android.karatescorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreKarateKid1 = 0 ;
    int scoreKarateKid2 = 0 ;
    int fouls1 = 0 ;
    int fouls2 = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForKarateKid1(0);
        displayFoulForKarateKid1 (0) ;
        displayForKarateKid2 (0);
        displayFoulForKarateKid2 (0)
;    }

    /**
     * Displays the given score for KarateKid#1.
     */
    public void displayForKarateKid1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.karateKid1Score);
        scoreView.setText(String.valueOf(score));
    }

    /**
         * This method increments the score by 1, 2 or 3 points for karate kid#1
         */
    public void add1for1 (View View) {
        scoreKarateKid1 = scoreKarateKid1 +1;
        displayForKarateKid1(scoreKarateKid1);
    }

    public  void  add2for1 (View View){
        scoreKarateKid1 = scoreKarateKid1 +2;
        displayForKarateKid1(scoreKarateKid1);
    }

    public void add3for1 (View View) {
        scoreKarateKid1 = scoreKarateKid1 + 3;
        displayForKarateKid1(scoreKarateKid1);
    }

    /**
     * Displays the fouls for KarateKid1
     */
    public void  displayFoulForKarateKid1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foul1);
        scoreView.setText(String.valueOf(score));
    }

    public void foulFor1 (View V) {
        fouls1 = fouls1 + 1 ;
        displayFoulForKarateKid1(fouls1);
    }

    /**
     * Displays the given score for KarateKid#2.
     */
    public void displayForKarateKid2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.karateKid2Score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method increments the score by 1, 2 or 3 points for karate kid#2
     */
    public void add1for2(View View) {
        scoreKarateKid2 = scoreKarateKid2 +1;
        displayForKarateKid2(scoreKarateKid2);
    }

    public  void  add2for2 (View View){
        scoreKarateKid2 = scoreKarateKid2 +2;
        displayForKarateKid2(scoreKarateKid2);
    }

    public void add3for2 (View View) {
        scoreKarateKid2 = scoreKarateKid2 + 3;
        displayForKarateKid2(scoreKarateKid2);
    }

    /**
     * Displays the fouls for KarateKid2
     */
    public void  displayFoulForKarateKid2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foul2);
        scoreView.setText(String.valueOf(score));
    }
    public void foulFor2 (View V) {
        fouls2 = fouls2 + 1;
        displayFoulForKarateKid2(fouls2);
    }

    /**
     * This sets the scores back to 0
     */
    public void resetIt (View v) {
        scoreKarateKid1 = 0;
        scoreKarateKid2 = 0;
        fouls1 = 0 ;
        fouls2 = 0 ;
        displayForKarateKid1(scoreKarateKid1);
        displayForKarateKid2(scoreKarateKid2);
        displayFoulForKarateKid1(fouls1);
        displayFoulForKarateKid2(fouls2);
    }

    }
