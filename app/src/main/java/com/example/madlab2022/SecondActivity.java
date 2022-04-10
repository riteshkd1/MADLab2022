package com.example.madlab2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mSubHeading, mParagaph;
    private ImageView mImageView;

    String storeParagaph;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mSubHeading = findViewById(R.id.subHeading);
        mParagaph = findViewById(R.id.paragaph);
        mImageView = findViewById(R.id.imageView);

        displayTask();

        mImageView.setOnClickListener(this);

    }

    private void displayTask() {
        Bundle bundle = getIntent().getExtras();
        mSubHeading.setText("Text One");
        storeParagaph = bundle.getString("TextOne");
        mParagaph.setText(storeParagaph);

    }

    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.imageView)
        {
            startActivity(new Intent(SecondActivity.this, MainActivity.class));
        }

    }
}