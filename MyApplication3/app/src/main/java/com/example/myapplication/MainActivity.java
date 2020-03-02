package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.graphics.Typeface;
//import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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

    public void sendText(View view)
    {
        TextView textView = (TextView) findViewById(R.id.textView);
        EditText editText = (EditText) findViewById(R.id.editText);
        textView.setText(editText.getText());
    }


  /*
    // Обработка нажатия кнопки
    public void sendText(View view)
    {
        RadioGroup radGrp = (RadioGroup)findViewById(R.id.radios);
        // обработка переключения состояния переключателя
        radGrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup arg0, int id) {
                TextView textView = (TextView) findViewById(R.id.textView);
                EditText editText = (EditText) findViewById(R.id.editText);
                switch(id) {
                    case R.id.serif:
                        textView.setTypeface(Typeface.create("serif", Typeface.NORMAL));
                        textView.setText(editText.getText());
                        break;
                    case R.id.casual:
                        textView.setTypeface(Typeface.create("casual", Typeface.NORMAL));
                        textView.setText(editText.getText());
                        break;
                    case R.id.cursive:
                            textView.setTypeface(Typeface.create("cursive", Typeface.NORMAL));
                            textView.setText(editText.getText());
                            break;
                    case R.id.monospace:
                        textView.setTypeface(Typeface.create("monospace", Typeface.NORMAL));
                        textView.setText(editText.getText());
                        break;
                    default:
                        textView.setText(editText.getText());
                        break;
                }
            }
        });
    }*/

    public void cancelRefresh(View view)
    {
        finish();
        startActivity(getIntent());
    }
}
