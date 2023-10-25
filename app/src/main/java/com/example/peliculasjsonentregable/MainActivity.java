package com.example.peliculasjsonentregable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class MainActivity extends AppCompatActivity {
    Gson gson = new Gson();
    private String peliculas_json= "{\n" +
            "  \"peliculas\": [\n" +
            "    {\n" +
            "      \"titulo\": \"El Caballero Oscuro\",\n" +
            "      \"actores\": [\n" +
            "        \"Christian Bale\",\n" +
            "        \"Heath Ledger\",\n" +
            "        \"Aaron Eckhart\"\n" +
            "      ],\n" +
            "      \"portada\": \"https://almacen-rmr.tionazo.com/pelis/caballero-oscuro.jpg\",\n" +
            "      \"director\": \"Christopher Nolan\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"titulo\": \"Cadena Perpetua\",\n" +
            "      \"actores\": [\n" +
            "        \"Tim Robbins\",\n" +
            "        \"Morgan Freeman\",\n" +
            "        \"William Sadler\"\n" +
            "      ],\n" +
            "      \"portada\": \"https://almacen-rmr.tionazo.com/pelis/cadena-perpetua.jpg\",\n" +
            "      \"director\": \"Frank Darabont\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"titulo\": \"City Lights\",\n" +
            "      \"actores\": [\n" +
            "        \"Charlie Chaplin\",\n" +
            "        \"Virginia Cherrill\",\n" +
            "        \"Florence Lee\"\n" +
            "      ],\n" +
            "      \"portada\": \"https://almacen-rmr.tionazo.com/pelis/city_lights.jpg\",\n" +
            "      \"director\": \"Charlie Chaplin\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"titulo\": \"Django\",\n" +
            "      \"actores\": [\n" +
            "        \"Jamie Foxx\",\n" +
            "        \"Christoph Waltz\",\n" +
            "        \"Leonardo DiCaprio\"\n" +
            "      ],\n" +
            "      \"portada\": \"https://almacen-rmr.tionazo.com/pelis/django.jpg\",\n" +
            "      \"director\": \"Quentin Tarantino\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"titulo\": \"Interestellar\",\n" +
            "      \"actores\": [\n" +
            "        \"Matthew McConaughey\",\n" +
            "        \"Anne Hathaway\",\n" +
            "        \"Jessica Chastain\"\n" +
            "      ],\n" +
            "      \"portada\": \"https://almacen-rmr.tionazo.com/pelis/interestellar.jpg\",\n" +
            "      \"director\": \"Christopher Nolan\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"titulo\": \"Malditos Bastardos\",\n" +
            "      \"actores\": [\n" +
            "        \"Brad Pitt\",\n" +
            "        \"Christoph Waltz\",\n" +
            "        \"Mélanie Laurent\"\n" +
            "      ],\n" +
            "      \"portada\": \"https://almacen-rmr.tionazo.com/pelis/malditos-bastardos.jpg\",\n" +
            "      \"director\": \"Quentin Tarantino\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"titulo\": \"El Padrino\",\n" +
            "      \"actores\": [\n" +
            "        \"Marlon Brando\",\n" +
            "        \"Al Pacino\",\n" +
            "        \"James Caan\"\n" +
            "      ],\n" +
            "      \"portada\": \"https://almacen-rmr.tionazo.com/pelis/padrino.jpg\",\n" +
            "      \"director\": \"Francis Ford Coppola\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"titulo\": \"Pulp Fiction\",\n" +
            "      \"actores\": [\n" +
            "        \"John Travolta\",\n" +
            "        \"Uma Thurman\",\n" +
            "        \"Samuel L. Jackson\"\n" +
            "      ],\n" +
            "      \"portada\": \"https://almacen-rmr.tionazo.com/pelis/pulp_fiction.jpg\",\n" +
            "      \"director\": \"Quentin Tarantino\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"titulo\": \"Reservoir Dogs\",\n" +
            "      \"actores\": [\n" +
            "        \"Harvey Keitel\",\n" +
            "        \"Tim Roth\",\n" +
            "        \"Michael Madsen\"\n" +
            "      ],\n" +
            "      \"portada\": \"https://almacen-rmr.tionazo.com/pelis/reservoir_dogs.jpg\",\n" +
            "      \"director\": \"Quentin Tarantino\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"titulo\": \"La Lista de Schindler\",\n" +
            "      \"actores\": [\n" +
            "        \"Liam Neeson\",\n" +
            "        \"Ralph Fiennes\",\n" +
            "        \"Ben Kingsley\"\n" +
            "      ],\n" +
            "      \"portada\": \"https://almacen-rmr.tionazo.com/pelis/schindler.jpg\",\n" +
            "      \"director\": \"Steven Spielberg\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"titulo\": \"Star Wars: Episode IV - A New Hope\",\n" +
            "      \"actores\": [\n" +
            "        \"Mark Hamill\",\n" +
            "        \"Harrison Ford\",\n" +
            "        \"Carrie Fisher\"\n" +
            "      ],\n" +
            "      \"portada\": \"https://almacen-rmr.tionazo.com/pelis/starwars.jpg\",\n" +
            "      \"director\": \"George Lucas\"\n" +
            "    }\n" +
            "  ]\n" +
            "}";

    private Pelicula[] peliculas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Parsear al JSON
        JsonParser parser = new JsonParser();
        JsonObject jsonObject = parser.parse(peliculas_json).getAsJsonObject();
        JsonArray peliculasArray = jsonObject.getAsJsonArray("peliculas");
        peliculas = gson.fromJson(peliculasArray, Pelicula[].class);

        //Configurar botones
        ImageButton[] buttons = new ImageButton[11];
        buttons[0] = findViewById(R.id.p1);
        buttons[1] = findViewById(R.id.p2);
        buttons[2] = findViewById(R.id.p3);
        buttons[3] = findViewById(R.id.p4);
        buttons[4] = findViewById(R.id.p5);
        buttons[5] = findViewById(R.id.p6);
        buttons[6] = findViewById(R.id.p7);
        buttons[7] = findViewById(R.id.p8);
        buttons[8] = findViewById(R.id.p9);
        buttons[9] = findViewById(R.id.p10);
        buttons[10] = findViewById(R.id.p11);

        for (int i = 0; i < buttons.length; i++) {
            final int index = i;
            ImageButton imageButton = buttons[i];
            String contentDescription = imageButton.getContentDescription().toString();

            //Cargar la portada con Glide
            Glide.with(this)
                    .load(peliculas[index].getPortada())
                    .into(imageButton);

        }
    }


}