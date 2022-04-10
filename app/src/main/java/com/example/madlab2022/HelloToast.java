package com.example.madlab2022;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HelloToast extends AppCompatActivity {

    private TextView mCounterValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_toast);

        mCounterValue = findViewById(R.id.counterValue);

        Bundle bundle = getIntent().getExtras();

        if(bundle==null)
        {
            mCounterValue.setText("0");
        }
        else
        {
            String valueExtract;

            valueExtract = bundle.getString("CounterValue");
            mCounterValue.setText(valueExtract);
        }
    }
}