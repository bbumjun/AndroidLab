package com.example.bumjun.lab2_2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity {

    //create object
    TextView textView;
    Button goBtn;
    Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        //match object with views of xml source
        textView = (TextView)findViewById(R.id.textView1);
        goBtn=(Button)findViewById(R.id.button2);
        backBtn=(Button)findViewById(R.id.button3);
        //receive intent of MainActivity
        Intent passedIntent =getIntent();
        //receive bundle of passed intent
        Bundle urlBundle = passedIntent.getExtras();
       final String passedUrl= urlBundle.getString("url");

            //display url at textView
            textView.setText(passedUrl);

        goBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                //if user didn't type any string , notify type again
                if(passedUrl.equals("")) {
                    Toast.makeText(getApplicationContext(),"주소를 다시 입력해주세요",Toast.LENGTH_LONG).show();
                }
               else {
                    //show screen that searched the url
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + passedUrl));
                    startActivity(intent);
                }
            }

        });

        backBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"뒤로가기 버튼을 눌렀습니다.",Toast.LENGTH_LONG).show();

                finish();

            }



        });



    }
}
