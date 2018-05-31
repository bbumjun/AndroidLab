package com.mobile.lab.lab6_1;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.Buffer;

public class MainActivity extends AppCompatActivity {
Button writeBtn,clearBtn,readBtn,finishBtn;
EditText editText;
private  final static String NOTES ="notes.txt";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final File sdCard = Environment.getExternalStorageDirectory();
        final File directory =new File(sdCard.getAbsolutePath()+"/MyFiles");
        directory.mkdirs();

        writeBtn=(Button)findViewById(R.id.writeBtn);
        clearBtn=(Button)findViewById(R.id.clearBtn);
        readBtn=(Button)findViewById(R.id.readBtn);
        finishBtn=(Button)findViewById(R.id.finishBtn);
        editText=(EditText)findViewById(R.id.editText1);
        writeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                   File file =new File(directory,NOTES);
                    FileOutputStream fOut = new FileOutputStream(file);
                    OutputStreamWriter osw =new OutputStreamWriter(fOut);
                    osw.write(editText.getText().toString());
                    osw.close();
                    Toast.makeText(getApplicationContext(),"Done writing SD \"notes.txt\"",Toast.LENGTH_SHORT).show();

                }catch (Exception e) {
                    Toast.makeText(getApplicationContext(),"Exception: "+e.toString(),Toast.LENGTH_SHORT).show();

                }

            }
        });
        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });

        readBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    File file = new File(directory,NOTES);
                    if (file != null) {
                        FileInputStream fIn =new FileInputStream(file);
                        InputStreamReader isr =new InputStreamReader(fIn);
                        BufferedReader reader = new BufferedReader(isr);
                        String str="";
                        StringBuffer buf = new StringBuffer();
                        while((str=reader.readLine())!=null) {
                            buf.append(str+"\n");
                        }
                        fIn.close();
                        editText.setText(buf.toString());
                        Toast.makeText(getApplicationContext(),"Done reading SD \"notes.txt\"",Toast.LENGTH_SHORT).show();

                    }
                }catch (java.io.FileNotFoundException e) {

                }catch (Throwable t) {
                    Toast.makeText(getApplicationContext(),"Exception : "+t.toString(),Toast.LENGTH_SHORT).show();
                }
            }
        });
        finishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
