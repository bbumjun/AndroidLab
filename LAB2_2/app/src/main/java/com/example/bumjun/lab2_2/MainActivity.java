package com.example.bumjun.lab2_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //create object
    EditText Url;
    Button nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //match object with views of xml source
        Url = (EditText) findViewById(R.id.editText1);
        nextBtn = (Button) findViewById(R.id.button1);

        nextBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, NewActivity.class);
                String myUrl = Url.getText().toString();

                //create new bundle
                Bundle bundle1 = new Bundle();
                //put url String in bundle
                bundle1.putString("url", myUrl);
                //deliver the bundle to NewActivity
                intent.putExtras(bundle1);
                //start NewActivity
                startActivity(intent);
            }

        });
    }

}
