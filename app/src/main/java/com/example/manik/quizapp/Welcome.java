package com.example.manik.quizapp;

/**
 * Created by manik on 19-12-2017.
 */

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Objects;

public class Welcome extends MainActivity {

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from new_activity.xml
        setContentView(R.layout.welcome);

    }


    public void myScore(View view) {

        int score = 10 + question1() + question2() + question3() + question4() +
                question5() + question6() + question7() + question8()
                + question9();

        if (score == 100){
            Toast.makeText(this, "You got all the answers right" +  "\n Congrats Genius !!!" , Toast.LENGTH_LONG).show();

        }
        else if (score<=90) {
            Toast.makeText(this, "Your score is " + score, Toast.LENGTH_SHORT).show();
        }

    }


    private int question1() {
        RadioButton maleRadioButton;
        maleRadioButton = (RadioButton) findViewById(R.id.answer1);
        if (maleRadioButton.isChecked()) {
            return 10;
        } else {
            return 0;
        }
    }

    private int question2() {
        EditText text = (EditText) findViewById(R.id.answer2);
        String value = text.getText().toString().toLowerCase();
        if ("thanks".equals(value)) {
            return 10;
        }
        return 0;
    }

    private int question3() {
        EditText text = (EditText) findViewById(R.id.answer3);
        String value = text.getText().toString().toLowerCase();

        if ("thanks".equals(value)) {
            return 10;
        }
        return 0;
    }

    private int question4() {
        CheckBox maleCheckBox = (CheckBox) findViewById(R.id.cb1);
        CheckBox malCheckBox = (CheckBox) findViewById(R.id.cb2);
        CheckBox femaleCheckBox = (CheckBox) findViewById(R.id.cb3);
        CheckBox checkbox = (CheckBox) findViewById(R.id.cb4);

        if (malCheckBox.isChecked()) {
            return 0;
        } else if (maleCheckBox.isChecked() && femaleCheckBox.isChecked() && checkbox.isChecked()) {
            return 10;
        } else {
            return 0;
        }
    }

    private int question5() {
        EditText text = (EditText) findViewById(R.id.answer5);
        String value = text.getText().toString().toLowerCase();

        if ("thanks".equals(value)) {
            return 10;
        }
        return 0;
    }

    private int question6() {
        EditText text = (EditText) findViewById(R.id.answer6);
        String value = text.getText().toString().toLowerCase();

        if ("thanks".equals(value)) {
            return 10;
        }
        return 0;
    }

    private int question7() {
        EditText text = (EditText) findViewById(R.id.answer7);
        String value = text.getText().toString().toLowerCase();

        if ("thanks".equals(value)) {
            return 10;
        }
        return 0;
    }

    private int question8() {
        RadioButton maleRadioButton;
        maleRadioButton = (RadioButton) findViewById(R.id.answer8);
        if (maleRadioButton.isChecked()) {
            return 10;
        } else {
            return 0;
        }
    }

    private int question9() {
        RadioButton maleRadioButton;
        maleRadioButton = (RadioButton) findViewById(R.id.answer9);
        if (maleRadioButton.isChecked()) {
            return 10;
        } else {
            return 0;
        }
    }



    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Are you sure you want to exit?")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {
                        Welcome.super.onBackPressed();
                    }
                }).create().show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_item_one ){

            // Do something
            return true;
        }
        if (id == R.id.action_item_two) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
