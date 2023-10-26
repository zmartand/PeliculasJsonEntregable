package com.example.peliculasjsonentregable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetalleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        //Obtener la pelicula seleccionada de la actividad principal
        Intent intent = getIntent();
        Pelicula pelicula = (Pelicula) intent.getSerializableExtra("pelicula");

        //Obtener referencias a los elementos de la interfaz de usuario
        ImageView imageView = findViewById(R.id.imageView);
        TextView tituloTextView = findViewById(R.id.tituloTextView);
        TextView directorTextView = findViewById(R.id.directorTextView);
        TextView actoresTextView = findViewById(R.id.actoresTextView);

        //Cargar la portada de la pelicula en el ImageView usando Glide
        Glide.with(this).load(pelicula.getPortada()).into(imageView);

        //Mostrar el titulo de la pelicula en el TextView
        tituloTextView.setText("Título: " + pelicula.getTitulo());

        //Mostrar el director de la pelicula en el TextView
        directorTextView.setText("Director: " + pelicula.getDirector());

        //Mostrar los actores de la pelicula en el TextView
        //Utiliza String.join para combinar los nombres de los actores con coma
        actoresTextView.setText("Actores: " + String.join(", ", pelicula.getActores()));
    }
}