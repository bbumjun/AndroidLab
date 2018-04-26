package com.example.bumjun.lab3_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    // create objects
    EditText editText;
    RadioGroup radioGender;
    RadioButton radMale;
    RadioButton radFemale;
    CheckBox chkSMS;
    CheckBox chkEmail;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //match objects with views of xml source
        editText=(EditText)findViewById(R.id.editText1);
        radioGender=(RadioGroup)findViewById(R.id.radioGroupGender);
        radMale=(RadioButton)findViewById(R.id.radMale);
        radFemale=(RadioButton)findViewById(R.id.radFemale);
        chkSMS=(CheckBox)findViewById(R.id.chkSMS);
        chkEmail=(CheckBox)findViewById(R.id.chkEmail);
        button1=(Button) findViewById(R.id.btn1);

        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(),NewActivity.class);
                String name =editText.getText().toString();
                Bundle bundle1=new Bundle();
                // put name string in bundle
                bundle1.putString("name",name);

                // put string that is checked radio button in bundle
                int radioId = radioGender.getCheckedRadioButtonId();
                if(radMale.getId()==radioId)

                    bundle1.putString("gender","남");
                if(radFemale.getId()==radioId)

                    bundle1.putString("gender","여");

                // put sting that is checked checkBox in bundle
                if(chkSMS.isChecked())

                bundle1.putString("send","SNS");
                if(chkEmail.isChecked())
                    bundle1.putString("send","E-mail");
                //put bundle in intent
                intent.putExtras(bundle1);
                // start NewActivity with intent
                startActivity(intent);
            }

        });
    }
}
