package br.com.livroandroid.mymusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class cazuza extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_marian_anderson.xml layout file
        setContentView(R.layout.activity_cazuza);

        // Find the View that shows the aveMaria text
        TextView aveMaria = (TextView) findViewById(R.id.avemariatext);
        // Set a click listener on that View
        Ideologia.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            public void onClick(View view) {
                Intent IdeologiaIntent = new Intent(cazuza.this, Ideologia.class);
                startActivity(IdeologiaIntent);
            }
        });
        // Find the View that shows the Der Tod text
        final TextView QuaseUmSegundo = (TextView) findViewById(R.id. QuaseUmSegundo);
        // Set a click listener on that View
        QuaseUmSegundo.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            public void onClick(View view) {
                Intent QuaseUmSegundoIntent = new Intent(cazuza.this, QuaseUmSegundo.class);
                startActivity(QuaseUmSegundoIntent);
            }
        });

        // Find the View that shows the DeepRiver text
        TextView Exagerado = (TextView) findViewById(R.id.exagerado);
        // Set a click listener on that View
       Exagerado.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            public void onClick(View view) {
                Intent ExageradoIntent = new Intent(cazuza.this, Exagerado.class);
                startActivity(ExageradoIntent);
            }
        });
    }
}
