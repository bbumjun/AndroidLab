package com.example.bumjun.lab3_3;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // create object
    public Button btn_frag1;
    public Button btn_frag2;
    Fragment1 fragment1;
    Fragment2 fragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        setLisnter();
    }

    public void init() {
        // match objects with views of xml source
        btn_frag1 = findViewById(R.id.btn_frag1);
        btn_frag2 = findViewById(R.id.btn_frag2);

        fragment1= new Fragment1();
        fragment2= new Fragment2();

    }
    public void setLisnter() {

    btn_frag1.setOnClickListener(new View.OnClickListener() {

        public void onClick(View v) {
            // return first fragment
           getSupportFragmentManager().beginTransaction().replace(R.id.framelayout_for_fragment,fragment1).commit();
        }

    });
    btn_frag2.setOnClickListener(new View.OnClickListener() {

        public void onClick(View v) {
            // return second fragment
            getSupportFragmentManager().beginTransaction().replace(R.id.framelayout_for_fragment,fragment2).commit();
        }

    });

    }



}
