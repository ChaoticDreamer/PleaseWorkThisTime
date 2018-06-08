package com.example.chaoticdreamer.pleaseworkthistime;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity {
    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /*This method resets the quiz score back to 0*/
    public void resetScore(View view){
        score = 0;
    }

    /* This method is for submitting the answers*/

    public void submitAnswers(View view) {

        /*This code enables the user to input their name*/

        EditText nameHolder = (EditText) findViewById(R.id.name_holder);
        Editable nameEditable = nameHolder.getText();
        String name = nameEditable.toString();

        /*Question 1 with radio buttons answer 'no'*/

        RadioButton no = findViewById(R.id.no);

        if (no.isChecked()){
            score = score +1;
        }

        /*Question 2 with checkboxes the correct answers are one and two*/

        CheckBox one = (CheckBox) findViewById(R.id.one);
        boolean oneChecked = one.isChecked();

        CheckBox two = (CheckBox) findViewById(R.id.two);
        boolean twoChecked = two.isChecked();

        CheckBox three = (CheckBox) findViewById(R.id.three);
        boolean threeChecked = three.isChecked();

        CheckBox four = (CheckBox)findViewById(R.id.four);
        boolean fourChecked = four.isChecked();

        if (oneChecked == true && twoChecked == true){
            score = score + 1;
        }

        /*Question 3 with a radio button. The answer is true */

        RadioButton truth = findViewById(R.id.truth);

        if (truth.isChecked()){
            score = score + 1;
        }

        /*Question 4 with a radio button. The answer is arachnids*/

        RadioButton arachnids = findViewById(R.id.arachnids);
        if (arachnids.isChecked()){
            score = score + 1;
        }

        /*This code calculates score and responds with a toasty message*/

        if (score == 4){
            Toast.makeText(getApplicationContext(),name + " Cool Beans with a side of AWESOME SAUCE!",Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), score + " / 4 You can do it! Try again! "+ name, Toast.LENGTH_SHORT).show();
        }
        return;


    }
}