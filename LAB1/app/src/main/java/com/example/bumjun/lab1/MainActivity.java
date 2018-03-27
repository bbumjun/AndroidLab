package com.example.bumjun.lab1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    ImageView imageView2;
    int imageIndex=0;  //initialize index of image

    /*
    initialize image view from image source of xml file
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        imageView=findViewById(R.id.image1);
        imageView2=findViewById(R.id.image2);
    };

    /*
    if button view is clicked, implement changeImage() method
     */
    public void onButtonClicked(View v) {

        changeImage();
    }

    /*
    change each of visibility  and change index 0 or 1
     */
    private void changeImage() {

        if(imageIndex==0) {
            imageView.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);
            imageIndex=1;
        }
        else if(imageIndex==1) {
            imageView.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageIndex=0;


        }
    }
}

