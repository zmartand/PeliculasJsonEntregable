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

        Intent intent = getIntent();
        Pelicula pelicula = (Pelicula) intent.getSerializableExtra("pelicula");

        ImageView imageView = findViewById(R.id.imageView);
        TextView tituloTextView = findViewById(R.id.tituloTextView);
        TextView directorTextView = findViewById(R.id.directorTextView);
        TextView actoresTextView = findViewById(R.id.actoresTextView);

        Glide.with(this).load(pelicula.getPortada()).into(imageView);
        tituloTextView.setText("Título: " + pelicula.getTitulo());
        directorTextView.setText("Director: " + pelicula.getDirector());
        actoresTextView.setText("Actores: " + String.join(", ", pelicula.getActores()));



    }
}