package com.example.jokelibary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Admin on 17-Aug-17.
 */

public class jokeActivity extends AppCompatActivity{

    public static final String JOKE_INTENT_TAG = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        String joke = getIntent().getStringExtra(JOKE_INTENT_TAG);
        TextView jokeTextView = (TextView) findViewById(R.id.joke_textview);
        jokeTextView.setText(joke);
    }



}
