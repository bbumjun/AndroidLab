package com.example.bumjun.lab3_1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    // create object
    Button mBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtn = (Button)findViewById(R.id.button1);
        // if the button is clicked long, display contextMenu
        registerForContextMenu(mBtn);
    }
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu,v,menuInfo);
        menu.setHeaderTitle("Button Menu");
        getMenuInflater().inflate(R.menu.button_menu,menu);


    }
/*
if one of menu item clicked,  change the text color
 */
    public boolean onContextItemSelected (MenuItem item) {

        int curId=item.getItemId();
        switch(curId) {
            case R.id.red:
                mBtn.setTextColor(Color.RED);
                break;
            case R.id.green:
                mBtn.setTextColor(Color.GREEN);
                break;
            case R.id.blue :
                mBtn.setTextColor(Color.BLUE);
                break;
            default:break;

        }
        return super.onContextItemSelected(item);
    }
}
