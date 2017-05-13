package com.example.darlington.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MyQuizApplication extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_quiz_application);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.aboutApp:
                Toast.makeText(this, "This project and course work is fully funded by Andela and Google. The project is an app that quizzes its users on simple everyday activities", Toast.LENGTH_LONG).show();
                return true;
            case R.id.helpApp:
                Toast.makeText(this, "In case of Assistance, Inaccuracy, or poor display on your device, please send an email to somtodarlington@yahoo.com", Toast.LENGTH_LONG).show();
                return true;
            case R.id.termsApp:
                Toast.makeText(this, "This app is intended for learning purpose only and should not be misused", Toast.LENGTH_LONG).show();
                return true;
            case R.id.exitApp:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void startQuiz(View view) {
        Intent intent = new Intent(this, Questions.class);
        startActivity(intent);
    }
}
