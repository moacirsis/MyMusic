package br.com.livroandroid.mymusic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static br.com.livroandroid.mymusic.R.drawable.cazuza;


public class Exagerado extends AppCompatActivity {

    private MediaPlayer mediaPlayerExagerado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exagerado);

        mediaPlayerExagerado = MediaPlayer.create(this, R.raw.exagerado);
        final Button play = (Button) findViewById(R.id.exageradoplay);
        // Play
        play.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Playing", Toast.LENGTH_SHORT).show();
                mediaPlayerExagerado.start();
            }
        });
        // Pause
        final Button pause = (Button) findViewById(R.id.exageradopause);
        pause.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Paused", Toast.LENGTH_SHORT).show();
                mediaPlayerExagerado.pause();
            }
        });
        // Reset
        final Button reset = (Button) findViewById(R.id.exageradoreset);
        reset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Reset", Toast.LENGTH_SHORT).show();
                mediaPlayerExagerado.reset();
            }
        });

        // Find the View that shows the aveMaria text
        TextView Ideologia = (TextView) findViewById(R.id.ideologiatext);
        // Set a click listener on that View
        Ideologia.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            public void onClick(View view) {
                Intent IdeologiaIntent = new Intent(Exagerado.this, Ideologia.class);
                startActivity(IdeologiaIntent);
            }
        });
        // Find the View that shows the Der Tod text
        TextView quaseUmSegundo = (TextView) findViewById(R.id.quaseumsegundo);
        // Set a click listener on that View
        quaseUmSegundo.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            public void onClick(View view) {
                Intent quaseUmSegundoIntent = new Intent(Exagerado.this, quaseUmSegundo.class);
                startActivity(quaseUmSegundoIntent);
            }
        });

        // Find the View that shows the Home Screen text
        TextView homeScreen = (TextView) findViewById(R.id.homescreen);
        // Set a click listener on that View
        homeScreen.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeScreenIntent = new Intent(Exagerado.this, cazuza.class);
                startActivity(homeScreenIntent);
            }
        });


    }
}

