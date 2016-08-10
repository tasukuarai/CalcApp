package jp.techacademy.tasuku.arai.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        float value1 = intent.getFloatExtra("VALUE1", 0);
        float value2 = intent.getFloatExtra("VALUE2", 0);
        String value3 = intent.getStringExtra("VALUE3");

        TextView textView = (TextView) findViewById(R.id.textView);
        if(value3.equals("+")){
            textView.setText(String.valueOf(value1 + value2));
        }else if(value3.equals("-")){
            textView.setText(String.valueOf(value1 - value2));
        }else if(value3.equals("*")){
            textView.setText(String.valueOf(value1 * value2));
        }else{
            textView.setText(String.valueOf(value1 / value2));
        }
    }

}
