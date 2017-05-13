package com.example.darlington.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Questions extends AppCompatActivity {

    //declare and initialise required variables
    private RadioButton radioButtonId1;
    private RadioButton radioButtonId2;
    private RadioButton radioButtonId3;
    private RadioButton radioButtonId4;
    private RadioGroup radioGroupId;
    private RadioButton radioButtonId;
    private int radioBtnId;
    public static String answer_one, answer_two, answer_three = "nil";
    public static String answer_four = "nil";
    public static String answer_five = "nil";
    public static String answer_six = "nil";
    public static String answer_seven = "nil";
    public static String answer_eight = "nil";
    public static String answer_nine = "nil";
    public static String answer_ten = "nil";
    int question_no = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        TextView questions = (TextView) findViewById(R.id.textView);
        questions.setText(R.string.question1);
        radioButtonId1 = (RadioButton) findViewById(R.id.radioButton1);
        radioButtonId2 = (RadioButton) findViewById(R.id.radioButton2);
        radioButtonId3 = (RadioButton) findViewById(R.id.radioButton3);
        radioButtonId4 = (RadioButton) findViewById(R.id.radioButton4);
        radioButtonId1.setText(R.string.ques1opt1);
        radioButtonId2.setText(R.string.ques1opt2);
        radioButtonId3.setText(R.string.ques1opt3);
        radioButtonId4.setText(R.string.ques1opt4);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.exit:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


    public void next(View view){
        question_no += 1;
        TextView questions = (TextView) findViewById(R.id.textView);
        radioButtonId1 = (RadioButton) findViewById(R.id.radioButton1);
        radioButtonId2 = (RadioButton) findViewById(R.id.radioButton2);
        radioButtonId3 = (RadioButton) findViewById(R.id.radioButton3);
        radioButtonId4 = (RadioButton) findViewById(R.id.radioButton4);
        switch (question_no){
            case 1:
                radioGroupId = (RadioGroup) findViewById(R.id.questionOneAnswer); // get's the radio group id
                radioBtnId = radioGroupId.getCheckedRadioButtonId(); // returns an int of the checked radio button
                radioButtonId = (RadioButton) findViewById(radioBtnId);  // get's the id of the checked radio button
                if (radioBtnId == -1) {  // conditional statement to check if any button is selected or not.
                    answer_one = "nil"; // assign the value default if no button is selected
                    Toast.makeText(this, "No Answer Selected - Wrong!", Toast.LENGTH_SHORT).show();
                }
                else {
                    answer_one = radioButtonId.getText().toString(); // get the value (CharSequence) of the selected button and updates answer_one
                    if (answer_one.equals("60")){
                        Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
                    }
                }
                questions.setText(R.string.question2);
                radioButtonId1.setText(R.string.ques2opt1);
                radioButtonId2.setText(R.string.ques2opt2);
                radioButtonId3.setText(R.string.ques2opt3);
                radioButtonId4.setText(R.string.ques2opt4);
                radioGroupId.clearCheck();
                break;
            case 2:
                radioGroupId = (RadioGroup) findViewById(R.id.questionOneAnswer); // get's the radio group id
                radioBtnId = radioGroupId.getCheckedRadioButtonId(); // returns an int of the checked radio button
                radioButtonId = (RadioButton) findViewById(radioBtnId);  // get's the id of the checked radio button
                if (radioBtnId == -1) {  // conditional statement to check if any button is selected or not.
                    answer_two = "nil"; // assign the value default if no button is selected
                    Toast.makeText(this, "No Answer Selected - Wrong!", Toast.LENGTH_SHORT).show();
                }
                else {
                    answer_two = radioButtonId.getText().toString();  // get the value (CharSequence) of the selected button, convert to string and updates answer_one
                    if (answer_two.equals("Saturday")){
                        Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
                    }
                }
                questions.setText(R.string.question3);
                radioButtonId1.setText(R.string.ques3opt1);
                radioButtonId2.setText(R.string.ques3opt2);
                radioButtonId3.setText(R.string.ques3opt3);
                radioButtonId4.setText(R.string.ques3opt4);
                radioGroupId.clearCheck();
                break;
            case 3:
                radioGroupId = (RadioGroup) findViewById(R.id.questionOneAnswer); // get's the radio group id
                radioBtnId = radioGroupId.getCheckedRadioButtonId(); // returns an int of the checked radio button
                radioButtonId = (RadioButton) findViewById(radioBtnId);  // get's the id of the checked radio button
                if (radioBtnId == -1) {  // conditional statement to check if any button is selected or not.
                    answer_three = "nil"; // assign the value default if no button is selected
                    Toast.makeText(this, "No Answer Selected - Wrong!", Toast.LENGTH_SHORT).show();
                }
                else {
                    answer_three = radioButtonId.getText().toString();  // get the value (CharSequence) of the selected button and updates answer_one
                    if (answer_three.equals("Bank")){
                        Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
                    }
                }
                questions.setText(R.string.question4);
                radioButtonId1.setText(R.string.ques4opt1);
                radioButtonId2.setText(R.string.ques4opt2);
                radioButtonId3.setText(R.string.ques4opt3);
                radioButtonId4.setText(R.string.ques4opt4);
                radioGroupId.clearCheck();
                break;
            case 4:
                radioGroupId = (RadioGroup) findViewById(R.id.questionOneAnswer); // get's the radio group id
                radioBtnId = radioGroupId.getCheckedRadioButtonId(); // returns an int of the checked radio button
                radioButtonId = (RadioButton) findViewById(radioBtnId);  // get's the id of the checked radio button
                if (radioBtnId == -1) {  // conditional statement to check if any button is selected or not.
                    answer_four = "nil"; // assign the value default if no button is selected
                    Toast.makeText(this, "No Answer Selected - Wrong!", Toast.LENGTH_SHORT).show();
                }
                else {
                    answer_four = radioButtonId.getText().toString();  // get the value (CharSequence) of the selected button and updates answer_one
                    if (answer_four.equals("Hereditary")){
                        Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
                    }
                }
                questions.setText(R.string.question5);
                radioButtonId1.setText(R.string.ques5opt1);
                radioButtonId2.setText(R.string.ques5opt2);
                radioButtonId3.setText(R.string.ques5opt3);
                radioButtonId4.setText(R.string.ques5opt4);
                radioGroupId.clearCheck();
                break;
            case 5:
                radioGroupId = (RadioGroup) findViewById(R.id.questionOneAnswer); // get's the radio group id
                radioBtnId = radioGroupId.getCheckedRadioButtonId(); // returns an int of the checked radio button
                radioButtonId = (RadioButton) findViewById(radioBtnId);  // get's the id of the checked radio button
                if (radioBtnId == -1) {  // conditional statement to check if any button is selected or not.
                    answer_five = "nil"; // assign the value default if no button is selected
                    Toast.makeText(this, "No Answer Selected - Wrong!", Toast.LENGTH_SHORT).show();
                } else {
                    answer_five = radioButtonId.getText().toString();  // get the value (CharSequence) of the selected button and updates answer_one
                    if (answer_five.equals("Warri")){
                        Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
                    }
                }
                questions.setText(R.string.question6);
                radioButtonId1.setText(R.string.ques6opt1);
                radioButtonId2.setText(R.string.ques6opt2);
                radioButtonId3.setText(R.string.ques6opt3);
                radioButtonId4.setText(R.string.ques6opt4);
                radioGroupId.clearCheck();
                break;
            case 6:
                radioGroupId = (RadioGroup) findViewById(R.id.questionOneAnswer); // get's the radio group id
                radioBtnId = radioGroupId.getCheckedRadioButtonId(); // returns an int of the checked radio button
                radioButtonId = (RadioButton) findViewById(radioBtnId);  // get's the id of the checked radio button
                if (radioBtnId == -1) {  // conditional statement to check if any button is selected or not.
                    answer_six = "nil"; // assign the value default if no button is selected
                    Toast.makeText(this, "No Answer Selected - Wrong!", Toast.LENGTH_SHORT).show();
                } else {
                    answer_six = radioButtonId.getText().toString();  // get the value (CharSequence) of the selected button and updates answer_one
                    if (answer_six.equals("General Muhammadu Buhari")){
                        Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
                    }
                }
                questions.setText(R.string.question7);
                radioButtonId1.setText(R.string.ques7opt1);
                radioButtonId2.setText(R.string.ques7opt2);
                radioButtonId3.setText(R.string.ques7opt3);
                radioButtonId4.setText(R.string.ques7opt4);
                radioGroupId.clearCheck();
                break;
            case 7:
                radioGroupId = (RadioGroup) findViewById(R.id.questionOneAnswer); // get's the radio group id
                radioBtnId = radioGroupId.getCheckedRadioButtonId(); // returns an int of the checked radio button
                radioButtonId = (RadioButton) findViewById(radioBtnId);  // get's the id of the checked radio button
                if (radioBtnId == -1) {  // conditional statement to check if any button is selected or not.
                    answer_seven = "nil"; // assign the value default if no button is selected
                    Toast.makeText(this, "No Answer Selected - Wrong!", Toast.LENGTH_SHORT).show();
                } else {
                    answer_seven = radioButtonId.getText().toString();  // get the value (CharSequence) of the selected button and updates answer_one
                    if (answer_seven.equals("Keen")){
                        Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
                    }
                }
                questions.setText(R.string.question8);
                radioButtonId1.setText(R.string.ques8opt1);
                radioButtonId2.setText(R.string.ques8opt2);
                radioButtonId3.setText(R.string.ques8opt3);
                radioButtonId4.setText(R.string.ques8opt4);
                radioGroupId.clearCheck();
                break;
            case 8:
                radioGroupId = (RadioGroup) findViewById(R.id.questionOneAnswer); // get's the radio group id
                radioBtnId = radioGroupId.getCheckedRadioButtonId(); // returns an int of the checked radio button
                radioButtonId = (RadioButton) findViewById(radioBtnId);  // get's the id of the checked radio button
                if (radioBtnId == -1) {  // conditional statement to check if any button is selected or not.
                    answer_eight = "nil"; // assign the value default if no button is selected
                    Toast.makeText(this, "No Answer Selected - Wrong!", Toast.LENGTH_SHORT).show();
                } else {
                    answer_eight = radioButtonId.getText().toString();  // get the value (CharSequence) of the selected button and updates answer_one
                    if (answer_eight.equals("Hate")){
                        Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
                    }
                }
                questions.setText(R.string.question9);
                radioButtonId1.setText(R.string.ques9opt1);
                radioButtonId2.setText(R.string.ques9opt2);
                radioButtonId3.setText(R.string.ques9opt3);
                radioButtonId4.setText(R.string.ques9opt4);
                radioGroupId.clearCheck();
                break;
            case 9:
                radioGroupId = (RadioGroup) findViewById(R.id.questionOneAnswer); // get's the radio group id
                radioBtnId = radioGroupId.getCheckedRadioButtonId(); // returns an int of the checked radio button
                radioButtonId = (RadioButton) findViewById(radioBtnId);  // get's the id of the checked radio button
                if (radioBtnId == -1) {  // conditional statement to check if any button is selected or not.
                    answer_nine = "nil"; // assign the value default if no button is selected
                    Toast.makeText(this, "No Answer Selected - Wrong!", Toast.LENGTH_SHORT).show();
                } else {
                    answer_nine = radioButtonId.getText().toString();  // get the value (CharSequence) of the selected button and updates answer_one
                    if (answer_nine.equals("Poland")){
                        Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
                    }
                }
                questions.setText(R.string.question10);
                radioButtonId1.setText(R.string.ques10opt1);
                radioButtonId2.setText(R.string.ques10opt2);
                radioButtonId3.setText(R.string.ques10opt3);
                radioButtonId4.setText(R.string.ques10opt4);
                TextView submit = (TextView) findViewById(R.id.submit);
                submit.setText("Submit");
                radioGroupId.clearCheck();
                break;
            case 10:
                radioGroupId = (RadioGroup) findViewById(R.id.questionOneAnswer); // get's the radio group id
                radioBtnId = radioGroupId.getCheckedRadioButtonId(); // returns an int of the checked radio button
                radioButtonId = (RadioButton) findViewById(radioBtnId);  // get's the id of the checked radio button
                if (radioBtnId == -1) {  // conditional statement to check if any button is selected or not.
                    answer_ten = "nil"; // assign the value default if no button is selected
                    Toast.makeText(this, "No Answer Selected - Wrong!", Toast.LENGTH_SHORT).show();
                } else {
                    answer_ten = radioButtonId.getText().toString();  // get the value (CharSequence) of the selected button and updates answer_one
                    if (answer_ten.equals("Jacob Zuma")){
                        Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
                    }
                }
                Intent i = new Intent(Questions.this, Answer.class);
                startActivity(i);
                finish();
        }
    }

    public void hint(View view){
        if (question_no == 0){
            Toast.makeText(this, "Resolve into simultaneous equations", Toast.LENGTH_SHORT).show();
        }
        if (question_no == 1){
            Toast.makeText(this, "2004 was a leap year", Toast.LENGTH_SHORT).show();
        }
        if (question_no == 2){
            Toast.makeText(this, "Rhymes with Rank!", Toast.LENGTH_SHORT).show();
        }
        if (question_no == 3){
            Toast.makeText(this, "More like Inheritance", Toast.LENGTH_SHORT).show();
        }
        if (question_no == 4){
            Toast.makeText(this, "Check Delta", Toast.LENGTH_SHORT).show();
        }
        if (question_no == 5){
            Toast.makeText(this, "Could be the present President", Toast.LENGTH_SHORT).show();
        }
        if (question_no == 6){
            Toast.makeText(this, "Try determination", Toast.LENGTH_SHORT).show();
        }
        if (question_no == 7){
            Toast.makeText(this, "Antonym means opposite", Toast.LENGTH_SHORT).show();
        }
        if (question_no == 8){
            Toast.makeText(this, "No Idea!", Toast.LENGTH_SHORT).show();
        }
        if (question_no == 9){
            Toast.makeText(this, "Obviuosly Jabob *um*", Toast.LENGTH_SHORT).show();
        }


    }



}
