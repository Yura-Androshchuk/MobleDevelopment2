package com.example.mobdevelopmenlab2;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.fragment.app.FragmentActivity;

public class MainActivity extends FragmentActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // получаем объект RadioGroup
        RadioGroup radGrp =  (RadioGroup)findViewById(R.id.radios);
        // обработка переключения состояния переключателя
        radGrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup arg0, int id) {
                TextView textView = (TextView) findViewById(R.id.textView);
                EditText editText = (EditText) findViewById(R.id.editText);
                switch(id) {
                    case R.id.serif:
                        textView.setText("");
                        textView.setTypeface(Typeface.create("serif", Typeface.NORMAL));
                        break;
                    case R.id.casual:
                        textView.setText("");
                        textView.setTypeface(Typeface.create("casual", Typeface.NORMAL));
                        break;
                    case R.id.cursive:
                        textView.setText("");
                        textView.setTypeface(Typeface.create("cursive", Typeface.NORMAL));
                        break;
                    case R.id.monospace:
                        textView.setText("");
                        textView.setTypeface(Typeface.create("monospace", Typeface.NORMAL));
                        break;
                    default:
                        // textView.setTypeface(Typeface.create("serif", Typeface.NORMAL));
                        break;
                }
            }});

    }

}
