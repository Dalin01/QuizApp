package com.example.darlington.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class UserInfos extends AppCompatActivity {

    public static String name = "None Provided!";
    public static String email = "None Provided!";

    private RadioGroup genderGroupId;
    private int genderBtnSelected;
    private RadioButton genderBtnSelectedId;
    public static String genderGroup = "None Selected";

    private RadioGroup ageGroupId;
    private int ageBtnSelected;
    private RadioButton ageBtnSelectedId;
    public static String ageGroup = "None Selected";

    public static String occupation = "";
    private CheckBox occupationOne, occupationTwo, occupationThree, occupationFour, occupationFive, occupationSix, occupationSeven, occupationOthers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_infos);
    }

    public void startQuiz(View view) {
        EditText full_name = (EditText) findViewById(R.id.name);
        name = full_name.getText().toString();

        EditText e_mail = (EditText) findViewById(R.id.email);
        email = e_mail.getText().toString();

        Intent i = new Intent(UserInfos.this, MyQuizApplication.class);
        startActivity(i);

        genderGroupId = (RadioGroup) findViewById(R.id.genderGroup); // get's the radio group id
        genderBtnSelected = genderGroupId.getCheckedRadioButtonId(); // returns an int of the checked radio button
        genderBtnSelectedId = (RadioButton) findViewById(genderBtnSelected);  // get's the id of the checked radio button
        if (genderBtnSelected == -1) {
            genderGroup = "None Selected";
        } else {
            genderGroup = genderBtnSelectedId.getText().toString();
        }

        ageGroupId = (RadioGroup) findViewById(R.id.ageGroup);
        ageBtnSelected = ageGroupId.getCheckedRadioButtonId();
        ageBtnSelectedId = (RadioButton) findViewById(ageBtnSelected);
        if (ageBtnSelected == -1) {
            ageGroup = "None Selected";
        } else {
            ageGroup = ageBtnSelectedId.getText().toString();
        }

        occupationOne = (CheckBox) findViewById(R.id.occupationOne);
        occupationTwo = (CheckBox) findViewById(R.id.occupationTwo);
        occupationThree = (CheckBox) findViewById(R.id.occupationThree);
        occupationFour = (CheckBox) findViewById(R.id.occupationFour);
        occupationFive = (CheckBox) findViewById(R.id.occupationFive);
        occupationSix = (CheckBox) findViewById(R.id.occupationSix);
        occupationSeven = (CheckBox) findViewById(R.id.occupationSeven);
        occupationOthers = (CheckBox) findViewById(R.id.occupationOthers);

        if (occupationOne.isChecked()) {
            occupation = occupation + occupationOne.getText().toString() + ", ";
        }
        if (occupationTwo.isChecked()) {
            occupation = occupation + occupationTwo.getText().toString() + ", ";
        }
        if (occupationThree.isChecked()) {
            occupation = occupation + occupationThree.getText().toString() + ", ";
        }
        if (occupationFour.isChecked()) {
            occupation = occupation + occupationFour.getText().toString() + ", ";
        }
        if (occupationFive.isChecked()) {
            occupation = occupation + occupationFive.getText().toString() + ", ";
        }
        if (occupationSix.isChecked()) {
            occupation = occupation + occupationSix.getText().toString() + ", ";
        }
        if (occupationSeven.isChecked()) {
            occupation = occupation + occupationSeven.getText().toString() + ", ";
        }
        if (occupationOthers.isChecked()) {
            occupation = occupation + occupationOthers.getText().toString() + ".";
        }
    }
}
