package com.mobile.lab.lab4_1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyView vw = new MyView(this);
        setContentView(vw);

    }

    protected class MyView extends View {
        private float x,y;
        // create objects
        Paint pnt = new Paint();
        Path path =new Path();

        public MyView(Context context) {
            super(context);
            pnt.setStyle(Paint.Style.STROKE); // draw only the edge
            pnt.setStrokeWidth(20); // set thickness
        }

        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            pnt.setColor(Color.BLUE);

            canvas.drawPath(path,pnt); // draw path on the canvas

        }
        public boolean onTouchEvent(MotionEvent event) {
            //get coordinates x,y
            x=event.getX();
            y=event.getY();
            // when the screen has first touch , move the initial point of path
            if(event.getAction()==MotionEvent.ACTION_DOWN) {
                path.moveTo(x,y);
            }
            // when the screen has moving of touch , draw following coordinates
            if(event.getAction()==MotionEvent.ACTION_MOVE)
            {
                path.lineTo(x,y);
            }

            //renewal of canvas
           invalidate();
            return true;
        }

    }
}
