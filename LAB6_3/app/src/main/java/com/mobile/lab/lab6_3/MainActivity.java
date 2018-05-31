package com.mobile.lab.lab6_3;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SQLiteDatabase db;
    MySQLiteOpenHelper helper;
    String[] student;
    ListView listView;
    Button addBtn,deleteBtn;
    EditText nameText,idText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helper =new MySQLiteOpenHelper(MainActivity.this,"info.db",null,1);
        listView =(ListView)findViewById(R.id.listView);
        addBtn = (Button)findViewById(R.id.addBtn);
        deleteBtn = (Button)findViewById(R.id.deleteBtn);
        nameText =(EditText)findViewById(R.id.editName);
        idText=(EditText)findViewById(R.id.editID);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name =nameText.getText().toString();
                String id =idText.getText().toString();
                if(name.equals("")||id.equals("")) {
                    Toast.makeText(getApplicationContext(),"모든 항목을 입력해 주세요",Toast.LENGTH_SHORT).show();
                }
                else {
                    insert(name,id);
                    invalidate();
                }
            }
        });
        deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nameText.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(),"이름을 입력해주세요",Toast.LENGTH_SHORT).show();
                }
                else {
                    delete(nameText.getText().toString());
                    invalidate();
                }
            }
        });
    }

    public void insert(String name, String id) {
        db=helper.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("name", name);
        values.put("id", id);
        db.insert("student",null,values);
    }

    public void delete (String name) {
        db =helper.getWritableDatabase();
        db.delete("student","name=?",new String[]{name});

    }
    public void select() {
        db=helper.getReadableDatabase();
        Cursor c= db.query("student",null,null,null,null,null,null);

        student=new String[c.getCount()];
        int count=0;
        while(c.moveToNext()) {

            student[count]= c.getString(c.getColumnIndex("name"))+" "+c.getString(c.getColumnIndex("id"));
            count++;

        }
        c.close();

    }

    private void invalidate() {
        select();
        ArrayAdapter<String> adapter =new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,student);
        listView.setAdapter(adapter);
    }
}
