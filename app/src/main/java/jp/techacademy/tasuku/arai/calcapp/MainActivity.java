package jp.techacademy.tasuku.arai.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mEditText1, mEditText2;
    float value1, value2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        mEditText1 = (EditText) findViewById(R.id.editText1);
        mEditText2 = (EditText) findViewById(R.id.editText2);
    }

    @Override
    public void onClick(View v) {
        value1 = Float.parseFloat(mEditText1.getText().toString());
        value2 = Float.parseFloat(mEditText2.getText().toString());
        Intent intent = new Intent(this, SecondActivity.class);
        if (v.getId() == R.id.button1) {
            result = value1 + value2;
            intent.putExtra("VALUE", result);
        } else if (v.getId() == R.id.button2) {
            result = value1 - value2;
            intent.putExtra("VALUE", result);
        } else if (v.getId() == R.id.button3) {
            result = value1 * value2;
            intent.putExtra("VALUE", result);
        } else if (v.getId() == R.id.button4) {
            result = value1 / value2;
            intent.putExtra("VALUE", result);
        }
        startActivity(intent);
    }

}
