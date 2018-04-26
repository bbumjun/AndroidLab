package com.example.bumjun.lab3_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by bumju on 2018-04-19.
 */

public class NewActivity extends AppCompatActivity {

    // create objects
    TextView textView1;
    TextView textView2;
    TextView textView3;
    Button button2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        // match objects with views of xml source
        textView1= (TextView)findViewById(R.id.textView1);
        textView2=(TextView)findViewById(R.id.textView2);
        textView3=(TextView)findViewById(R.id.textView3);
        button2=(Button)findViewById(R.id.btn2);
        // receive intent to MainActivity
        Intent passedIntent =getIntent();
        // receive bundle to passed intent
        Bundle bundle1 = passedIntent.getExtras();
        final String name = bundle1.getString("name");
        final String gender = bundle1.getString("gender");
        final String send=bundle1.getString("send");

        // display received information
        textView1.setText(name);
        textView2.setText(gender);
        textView3.setText(send);


        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
