package com.mobile.lab.lab4_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    //create objects
    LinearLayout slidingArea;
    Button button;
    Animation slideToLeft,slideToRight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //match objects with views of xml source
        button =(Button)findViewById(R.id.button1);
        slidingArea = (LinearLayout)findViewById(R.id.slidingArea);
        slideToLeft= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.left_slide);
        slideToRight=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.right_slide);
        slidingArea.setVisibility(View.INVISIBLE);

        /*
        If the button text is "OPEN PAGE" , executes  left sliding animation , and change the button's text to "CLOSE PAGE".
        otherwise, executes right sliding animation
         */
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                if(button.getText().equals("OPEN PAGE")) {
                    slidingArea.startAnimation(slideToLeft);
                    slidingArea.setVisibility(View.VISIBLE);
                    button.setText("CLOSE PAGE");

                }
                else if(button.getText().equals("CLOSE PAGE")) {
                    slidingArea.startAnimation(slideToRight);
                    slidingArea.setVisibility(View.GONE);
                    button.setText("OPEN PAGE");
                }
            }
        });
    }


}
