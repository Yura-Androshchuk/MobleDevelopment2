package com.example.lab3simplev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity
{
    String string;
    public void setString(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    private final static String FILE_NAME = "content.txt";
    //String font;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // сохранение файла
    public void sendText(View view)
    {

        final EditText editText = (EditText) findViewById(R.id.editText);
        // получаем объект RadioGroup
        RadioGroup radGrp =  (RadioGroup)findViewById(R.id.radios);
        // обработка переключения состояния переключателя
        radGrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup arg0, int id) {

                if(id==R.id.serif) {
                    setString("serif");
                }
                else if (id == R.id.casual)
                {
                    setString("casual");
                }
                else if (id==R.id.cursive)
                {
                    setString("cursive");
                }
                else if (id == R.id.monospace)
                {
                    setString("monospace");
                }
                else
                {
                    setString("casual");
                }

            }});
        FileOutputStream fos = null;
        try {
            EditText textBox = (EditText) findViewById(R.id.editText);
            String text = textBox.getText().toString();
            text = text + " " + getString()+"\n";

            fos = openFileOutput(FILE_NAME, MODE_APPEND);
            fos.write(text.getBytes());
            Toast.makeText(this, "Файл сохранен", Toast.LENGTH_SHORT).show();
        }
        catch(IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
        finally{
            try{
                if(fos!=null)
                    fos.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }


    }
    public void openText(View view)
    {
        Intent intent = new Intent(this, FileContent.class);
        startActivity(intent);

    }

}
