package com.example.bumjun.lab2_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //create object
    EditText Name;
    EditText Age;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //match object with views of xml source
        Button button1 = (Button) findViewById(R.id.button1);
        final EditText Name = (EditText) findViewById(R.id.editText1);
        final EditText Age = (EditText) findViewById(R.id.editText2);

        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                //change type to String
                String name = Name.getText().toString();
                String age = Age.getText().toString();
                // create intent and deliver name and age to NewActivity
                Intent intent = new Intent(getApplicationContext(), NewActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("age", age);
                // start NewActivity
                startActivity(intent);


            }

        });

    }


}
