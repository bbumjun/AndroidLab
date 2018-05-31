package com.mobile.lab.lab6_2;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button readBtn,saveBtn,clearBtn;
EditText idText,nameText;
String studentId,studentName;
SharedPreferences sh_Pref;
SharedPreferences.Editor toEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        readBtn=(Button)findViewById(R.id.readBtn);
        saveBtn=(Button)findViewById(R.id.saveBtn);
        clearBtn=(Button)findViewById(R.id.clearBtn);
        idText=(EditText)findViewById(R.id.idText);
        nameText=(EditText)findViewById(R.id.nameText);
        readBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                applySharedPrefernces();
            }
        });

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                studentId=idText.getText().toString();
                studentName=nameText.getText().toString();
                sharedPreferences();
            }
        });
        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idText.setText("");
                nameText.setText("");
            }
        });
    }


    public void sharedPreferences() {
        sh_Pref =getSharedPreferences("Student information", MODE_PRIVATE);
        toEdit = sh_Pref.edit();
        toEdit.putString("StudentID",studentId);
        toEdit.putString("Name",studentName);
        toEdit.commit();
    }

    public void applySharedPrefernces() {
        sh_Pref =getSharedPreferences("Student information",MODE_PRIVATE);

        String id = sh_Pref.getString("StudentID","no ID");
        String name =sh_Pref.getString("Name","no name");
        idText.setText(id);
        nameText.setText(name);


    }
}
