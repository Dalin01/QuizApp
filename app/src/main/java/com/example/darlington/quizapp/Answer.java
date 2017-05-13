package com.example.darlington.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Answer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { // start the onCreate method immediately this activity starts
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        TextView userName = (TextView) findViewById(R.id.name);
        TextView userEmail = (TextView) findViewById(R.id.email);
        TextView finalScore = (TextView) findViewById(R.id.score); // find the id of the text view score
        TextView gender = (TextView) findViewById(R.id.gender);
        TextView occupation = (TextView) findViewById(R.id.occupation);
        TextView age = (TextView) findViewById(R.id.age);

        userName.setText(UserInfos.name); // using the setText method, display the name of the user in the TextView
        userEmail.setText(UserInfos.email);
        gender.setText(UserInfos.genderGroup);
        age.setText(UserInfos.ageGroup);
        occupation.setText(UserInfos.occupation);

        int yourScore = calculateScore(); // call the method calculateScore() and assign the returned value to the variable yourScore

        finalScore.setText(Integer.toString(yourScore)); // set the text to yourScore after converting the int value to a String in the text view

    }


    // method that calculate the score of the test taker or user
    public int calculateScore() {

        int score = 0; // declare an int variable score and instantiate it to 1

        if (Questions.answer_one.equals("60")) { // if answer for question 1 equals 60, increment score by 1
            score += 1;
        }
        if (Questions.answer_two.equals("Saturday")) { // if answer for question 2 equals Saturday, increment score by 1
            score += 1;
        }
        if (Questions.answer_three.equals("Bank")) { // if answer for question 3 equals Bank, increment score by 1
            score += 1;
        }
        if (Questions.answer_four.equals("Hereditary")) { // if answer for question 4 equals Hereditary, increment score by 1
            score += 1;
        }
        if (Questions.answer_five.equals("Warri")) { // if answer for question 5,1 equals right, increment score by 1 (question 5 has 3 answers each of 1mark)
            score += 1;
        }
        if (Questions.answer_six.equals("General Muhammadu Buhari")) { // if answer for question 5,2 equals right, increment score by 1
            score += 1;
        }
        if (Questions.answer_seven.equals("Keen")) { // if answer for question 5,3 equals right, increment score by 1
            score += 1;
        }
        if (Questions.answer_eight.equals("Hate")) { // if answer for question 6,1 equals right, increment score by 1 (question 6 has 2 answers each of 1mark)
            score += 1;
        }
        if (Questions.answer_nine.equals("Poland")) { // if answer for question 6,1 equals right, increment score by 1
            score += 1;
        }
        if (Questions.answer_ten.equals("Jacob Zuma")) { // question 7 is bonus, that's why score was instantiated to 1. However, if you fail to provide the name then the mark is removed.
            score += 1;
        }

        return score; // return the final value of score

    }
}
