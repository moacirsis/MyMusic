package br.com.livroandroid.mymusic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static br.com.livroandroid.mymusic.R.drawable.cazuza;


public class Ideologia extends AppCompatActivity {

    private MediaPlayer mediaPlayerIdeologia;

    public static void setOnClickListener(View.OnClickListener onClickListener) {
        Ideologia.onClickListener = onClickListener;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ideologia);

        mediaPlayerIdeologia = MediaPlayer.create(this, R.raw.ideologia);
        final Button play = (Button) findViewById(R.id.ideologiaplay);
        // Play
        play.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Playing", Toast.LENGTH_SHORT).show();
                mediaPlayerIdeologia.start();
            }
        });
        // Pause
        final Button pause = (Button) findViewById(R.id.ideologiapause);
        pause.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Paused", Toast.LENGTH_SHORT).show();
                mediaPlayerIdeologia.pause();
            }
        });
        // Reset
        final Button reset = (Button) findViewById(R.id.ideologiareset);
        reset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Reset", Toast.LENGTH_SHORT).show();
                mediaPlayerIdeologia.reset();
            }
        });

        // Find the View that shows the Der Tod text
        TextView Exagerado = (TextView) findViewById(R.id.exagerado);
        // Set a click listener on that View
        Exagerado.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            public void onClick(View view) {
                Intent ExageradoIntent = new Intent(Ideologia.this, exagerado.class);
                startActivity(ExageradoIntent);
            }
        });

        // Find the View that shows the DeepRiver text
        TextView quaseUmSegundo = (TextView) findViewById(R.id.quaseumsegundo);
        // Set a click listener on that View
        quaseUmSegundo.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            public void onClick(View view) {
                Intent quaseUmSegundoIntent = new Intent(Ideologia.this, quaseUmSegundo.class);
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
                Intent homeScreenIntent = new Intent(Ideologia.this, cazuza.class);
                startActivity(homeScreenIntent);
            }
        });
    }
}

