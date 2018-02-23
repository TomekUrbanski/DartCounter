package com.example.android.dartcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    int scoreA = 300;
    int scoreB = 300;
    int numberOfDarts = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void a_score(View view) {
        ImageView leftFrame = findViewById(R.id.playerAframe);
        ImageView rightFrame = findViewById(R.id.playerBframe);

        if (numberOfDarts ==3) {
            Toast.makeText(getBaseContext(), "It's not your turn", Toast.LENGTH_SHORT).show();
        }else if(numberOfDarts == 2 || numberOfDarts == 1) {
            if (leftFrame.isShown()) {
                Toast.makeText(getBaseContext(), "Use all darts", Toast.LENGTH_SHORT).show();
            } else if (rightFrame.isShown()) {
                Toast.makeText(getBaseContext(), "PlayerA did`t use all the darts", Toast.LENGTH_SHORT).show();
            }
        }else if(numberOfDarts == 0) {
            if (leftFrame.isShown()){
                Toast.makeText(getBaseContext(), "It's not your turn", Toast.LENGTH_SHORT).show();
            }else {
                leftFrame.setVisibility(View.VISIBLE);
                rightFrame.setVisibility(View.INVISIBLE);
                numberOfDarts = 3;
                score = scoreA;
                display(score);
            }
        }

    }

    public void b_score(View view) {
        ImageView leftFrame = findViewById(R.id.playerAframe);
        ImageView rightFrame = findViewById(R.id.playerBframe);

        if (numberOfDarts ==3) {
            Toast.makeText(getBaseContext(), "It's not your turn", Toast.LENGTH_SHORT).show();
        }else if(numberOfDarts == 2 || numberOfDarts == 1) {
            if (rightFrame.isShown()) {
                Toast.makeText(getBaseContext(), "Use all darts", Toast.LENGTH_SHORT).show();
            } else if (leftFrame.isShown()) {
                Toast.makeText(getBaseContext(), "PlayerA did`t use all the darts", Toast.LENGTH_SHORT).show();
            }
        }else if(numberOfDarts == 0) {
            if(rightFrame.isShown()){
                Toast.makeText(getBaseContext(), "It's not your turn", Toast.LENGTH_SHORT).show();
            }else {
                leftFrame.setVisibility(View.INVISIBLE);
                rightFrame.setVisibility(View.VISIBLE);
                numberOfDarts = 3;
                score = scoreB;
                display(score);
            }
        }

    }

    public void throw25(View view) {
        ImageView leftFrame = findViewById(R.id.playerAframe);
        ImageView rightFrame = findViewById(R.id.playerBframe);
        if(score == 0){
            Toast.makeText(getBaseContext(), "Choose a player", Toast.LENGTH_SHORT).show();
        }else {
            if (numberOfDarts == 0) {
                Toast.makeText(getBaseContext(), "Time for another player", Toast.LENGTH_SHORT).show();
            } else {
                if (leftFrame.isShown()) {
                    scoreA = scoreA - 25;
                    score = scoreA;
                } else if (rightFrame.isShown()) {
                    scoreB = scoreB - 25;
                    score = scoreB;
                }
                numberOfDarts = numberOfDarts - 1;
                display(score);
            }

        }
    }

    public void throw20(View view) {
        ImageView leftFrame = findViewById(R.id.playerAframe);
        ImageView rightFrame = findViewById(R.id.playerBframe);
        if(score == 0){
            Toast.makeText(getBaseContext(), "Choose a player", Toast.LENGTH_SHORT).show();
        }else {
            if (numberOfDarts == 0) {
                Toast.makeText(getBaseContext(), "Time for another player", Toast.LENGTH_SHORT).show();
            } else {
                if (leftFrame.isShown()) {
                    scoreA = scoreA - 20;
                    score = scoreA;
                } else if (rightFrame.isShown()) {
                    scoreB = scoreB - 20;
                    score = scoreB;
                }
                numberOfDarts = numberOfDarts - 1;
                display(score);
            }
        }
    }

    public void throw10(View view) {
        ImageView leftFrame = findViewById(R.id.playerAframe);
        ImageView rightFrame = findViewById(R.id.playerBframe);
        if(score == 0){
            Toast.makeText(getBaseContext(), "Choose a player", Toast.LENGTH_SHORT).show();
        }else {
            if (numberOfDarts == 0) {
                Toast.makeText(getBaseContext(), "Time for another player", Toast.LENGTH_SHORT).show();
            } else {
                if (leftFrame.isShown()) {
                    scoreA = scoreA - 10;
                    score = scoreA;
                } else if (rightFrame.isShown()) {
                    scoreB = scoreB - 10;
                    score = scoreB;
                }
                numberOfDarts = numberOfDarts - 1;
                display(score);
            }
        }
    }

    public void throw5(View view) {
        ImageView leftFrame = findViewById(R.id.playerAframe);
        ImageView rightFrame = findViewById(R.id.playerBframe);
        if(score == 0){
            Toast.makeText(getBaseContext(), "Choose a player", Toast.LENGTH_SHORT).show();
        }else {
            if (numberOfDarts == 0) {
                Toast.makeText(getBaseContext(), "Time for another player", Toast.LENGTH_SHORT).show();
            } else {
                if (leftFrame.isShown()) {
                    scoreA = scoreA - 5;
                    score = scoreA;
                } else if (rightFrame.isShown()) {
                    scoreB = scoreB - 5;
                    score = scoreB;
                }
                numberOfDarts = numberOfDarts - 1;
                display(score);
            }
        }
    }

    public void throw1(View view) {
        ImageView leftFrame = findViewById(R.id.playerAframe);
        ImageView rightFrame = findViewById(R.id.playerBframe);
        if(score == 0){
            Toast.makeText(getBaseContext(), "Choose a player", Toast.LENGTH_SHORT).show();
        }else {
            if (numberOfDarts == 0) {
                Toast.makeText(getBaseContext(), "Time for another player", Toast.LENGTH_SHORT).show();
            } else {
                if (leftFrame.isShown()) {
                    scoreA = scoreA - 1;
                    score = scoreA;
                } else if (rightFrame.isShown()) {
                    scoreB = scoreB - 1;
                    score = scoreB;
                }
                numberOfDarts = numberOfDarts - 1;
                display(score);
            }
        }
    }

    public void reset(View view) {
        ImageView leftDarts = findViewById(R.id.leftDarts);
        leftDarts.setImageResource(R.drawable.left_3darts);
        ImageView rightDarts = findViewById(R.id.rightDarts);
        rightDarts.setImageResource(R.drawable.right_3darts);
        ImageView leftFrame = findViewById(R.id.playerAframe);
        ImageView rightFrame = findViewById(R.id.playerBframe);
        leftFrame.setVisibility(View.INVISIBLE);
        rightFrame.setVisibility(View.INVISIBLE);
        score = 0;
        scoreA = 300;
        scoreB = 300;
        numberOfDarts = 0;
        display(score);
    }

    public void display(int score) {


        TextView scoreView = (TextView) findViewById(R.id.current_result);
        scoreView.setText(String.valueOf(score));
        ImageView leftFrame = findViewById(R.id.playerAframe);
        ImageView rightFrame = findViewById(R.id.playerBframe);
        ImageView leftDarts = findViewById(R.id.leftDarts);
        ImageView rightDarts = findViewById(R.id.rightDarts);

        if (leftFrame.isShown()){
            if(numberOfDarts == 3){
                leftDarts.setImageResource(R.drawable.left_3darts);
            } else if(numberOfDarts == 2){
                leftDarts.setImageResource(R.drawable.left_2darts);
            } else if(numberOfDarts == 1){
                leftDarts.setImageResource(R.drawable.left_1dart);
            } else{
                leftDarts.setImageResource(R.drawable.left_0darts);
            }
        } else if (rightFrame.isShown()){
            if(numberOfDarts == 3){
                rightDarts.setImageResource(R.drawable.right_3darts);
            } else if(numberOfDarts == 2){
                rightDarts.setImageResource(R.drawable.right_2darts);
            } else if(numberOfDarts == 1){
                rightDarts.setImageResource(R.drawable.right_1dart);
            } else{
                rightDarts.setImageResource(R.drawable.right_0darts);
            }
        }


    }
}

