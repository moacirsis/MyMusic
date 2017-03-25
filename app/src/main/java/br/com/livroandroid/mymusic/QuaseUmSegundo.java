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


public class QuaseUmSegundo extends AppCompatActivity {

    private MediaPlayer mediaPlayerQuaseUmSegundo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quase_um_segundo);

        mediaPlayerQuaseUmSegundo = MediaPlayer.create(this, R.raw.quaseumsegundo);
        final Button play = (Button) findViewById(R.id.quaseumsegundoplay);
        // Play
        play.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Playing", Toast.LENGTH_SHORT).show();
                mediaPlayerQuaseUmSegundo.start();
            }
        });
        // Pause
        final Button pause = (Button) findViewById(R.id.quaseumsegundopause);
        pause.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Paused", Toast.LENGTH_SHORT).show();
                mediaPlayerQuaseUmSegundo.pause();
            }
        });
        // Reset
        final Button reset = (Button) findViewById(R.id.quaseumsegundoreset);
        reset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Reset", Toast.LENGTH_SHORT).show();
                mediaPlayerQuaseUmSegundo.reset();
            }
        });

        // Find the View that shows the aveMaria text
        TextView Ideologia = (TextView) findViewById(R.id.ideologiatext);
        // Set a click listener on that View
        Ideologia.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            public void onClick(View view) {
                Intent IdeologiaIntent = new Intent(QuaseUmSegundo.this, Ideologia.class);
                startActivity(IdeologiaIntent);
            }
        });
        // Find the View that shows the DeepRiver text
        TextView deepRiver = (TextView) findViewById(R.id.exagerado);
        // Set a click listener on that View
        deepRiver.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            public void onClick(View view) {
                Intent ExageradoIntent = new Intent(QuaseUmSegundo.this, Exagerado.class);
                startActivity(ExageradoIntent);
            }
        });

        // Find the View that shows the Home Screen text
        TextView homeScreen = (TextView) findViewById(R.id.homescreen);
        // Set a click listener on that View
        homeScreen.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeScreenIntent = new Intent(QuaseUmSegundo.this, cazuza.class);
                startActivity(homeScreenIntent);
            }
        });

    }
}

