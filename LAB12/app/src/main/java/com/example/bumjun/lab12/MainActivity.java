package com.example.bumjun.lab12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText edit_name;
    public Button btn_print;
    public Button btn_clear;
    public TextView view_print;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    /*
    initialize objects from xml source
     */
    public void init() {
        edit_name=findViewById(R.id.name);
        btn_print=findViewById(R.id.print);
        btn_clear=findViewById(R.id.clear);
        view_print=findViewById(R.id.result);
    }
/*
if clear button is clicked , clear the text of view_print
 */
    public void clearClicked(View v) {

        edit_name.setText("");
        view_print.setText("contents");

    }
    /*
    if print button clicked , print edit_name to view_print
     */
    public void printClicked(View v) {

        String text="";

        text=edit_name.getText().toString();
        view_print.setText(text);
    }

}
