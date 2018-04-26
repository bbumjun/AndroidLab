package com.example.bumjun.lab2_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity {

    //create object
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity);
        //match variables with views of xml source
        Button button1 = (Button) findViewById(R.id.button2);

        //receive intent of MainActivity
        Intent passedIntent = getIntent();
        if (passedIntent != null) {

            String loginName = passedIntent.getStringExtra("name");
            String loginAge = passedIntent.getStringExtra("age");
            //notify delivered information (name,age)
            Toast.makeText(getApplicationContext(), "Student info:" + loginName + " " + loginAge, Toast.LENGTH_LONG).show();

        }

        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                //finish this activity
                finish();
            }
        });
    }
}



