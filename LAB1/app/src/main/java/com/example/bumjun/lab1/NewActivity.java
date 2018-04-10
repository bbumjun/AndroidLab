package com.example.bumjun.lab1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by bumju on 2018-04-02.
 */

public class NewActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        Button button0 =(Button)findViewById(R.id.button2);
        button0.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                Toast.makeText(getApplication(),"이전 화면으로 돌아갑니다",Toast.LENGTH_LONG).show();
                Intent intent = new Intent();
                intent.putExtra("name","mike");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}
