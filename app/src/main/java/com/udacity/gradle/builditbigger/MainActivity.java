package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.Jokes;
import com.example.jokelibary.jokeActivity;


public class MainActivity extends AppCompatActivity {

    Button tellJokeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tellJokeButton = (Button) findViewById(R.id.tellJoke);
        tellJokeButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Jokes myJoke = new Jokes();
                Intent intent = new Intent(MainActivity.this, jokeActivity.class);
                intent.putExtra(jokeActivity.JOKE_INTENT_TAG, myJoke.getJoke());
                startActivity(intent);
            }

        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
