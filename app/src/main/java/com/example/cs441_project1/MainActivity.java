package com.example.cs441_project1;

import android.os.Bundle;
import android.media.MediaPlayer;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final android.widget.TextView tv = findViewById(R.id.textView2);

        final MediaPlayer englishSound = MediaPlayer.create(this, R.raw.english);
        android.widget.Button englishButton = findViewById(R.id.engButton);

        englishButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){ englishSound.start(); tv.setText(R.string.eng_txt); }
        });

        final MediaPlayer spanishSound = MediaPlayer.create(this, R.raw.spanish);
        android.widget.Button spanishButton = findViewById(R.id.spaButton);

        spanishButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){ spanishSound.start(); tv.setText(R.string.spa_txt); }
        });

        final MediaPlayer frenchSound = MediaPlayer.create(this, R.raw.french);
        android.widget.Button frenchButton = findViewById(R.id.frnButton);

        frenchButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){ frenchSound.start(); tv.setText(R.string.frn_txt);}
        });

        final MediaPlayer swedishSound = MediaPlayer.create(this, R.raw.swedish);
        android.widget.Button swedishButton = findViewById(R.id.swdButton);

        swedishButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){ swedishSound.start(); tv.setText(R.string.swd_txt);}
        });

        final MediaPlayer polishSound = MediaPlayer.create(this, R.raw.polish);
        android.widget.Button polishButton = findViewById(R.id.polButton);

        polishButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){ polishSound.start(); tv.setText(R.string.pol_txt);}
        });

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Select one of the languages to hear 'Hello World' in that language", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
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
