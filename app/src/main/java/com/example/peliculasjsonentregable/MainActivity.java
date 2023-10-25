package com.example.peliculasjsonentregable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
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
}