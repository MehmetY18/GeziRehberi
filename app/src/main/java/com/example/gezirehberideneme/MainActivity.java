package com.example.gezirehberideneme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.gezirehberideneme.AllTourAttractions.TourAttractionsList;
import com.example.gezirehberideneme.AllTourAttractions.TourAttractionsList;

//imp com.example.gezirehberideneme gerisi aynı

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView touristdestinations, touristattractions;
    ArrayList<TouristDestinations_MODEL> touristDestinations_models;
    ArrayList<TouristAttractions_MODEL> touristAttractions_models;
    TouristDestinations_ADAPTER touristDestinations_adapter;
    TouristAttractions_ADAPTER touristAttractions_adapter;
    LinearLayoutManager manager;
    TextView seetouristdestinations;
    TextView seetouristattractions;
    Button explore;
    TextView cityname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        touristdestinations = findViewById(R.id.touristdestinations_recyclerview);

        touristDestinations_models = new ArrayList<>();

        touristDestinations_models.add(new TouristDestinations_MODEL(R.drawable.maidentower, "Kız Kulesi", "İstanbul, Üsküdar"));
        touristDestinations_models.add(new TouristDestinations_MODEL(R.drawable.rumelihisari, "Rumeli Hisarı", "İstanbul, Sarıyer"));
        touristDestinations_models.add(new TouristDestinations_MODEL(R.drawable.sumelamanastiri, "Sümela Manastırı", "Trabzon, Ortahisar"));
        touristDestinations_models.add(new TouristDestinations_MODEL(R.drawable.galatatower, "Galata Kulesi", "İstanbul, Beyoğlu, İstiklal Cad."));

        touristDestinations_adapter = new TouristDestinations_ADAPTER(this, touristDestinations_models);
        manager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        touristdestinations.setAdapter(touristDestinations_adapter);
        touristdestinations.setLayoutManager(manager);

        touristattractions = findViewById(R.id.touristattractions_recyclerview);

        touristAttractions_models = new ArrayList<>();
        touristAttractions_models.add(new TouristAttractions_MODEL(R.drawable.tuzmagrasi, "Tuz Mağrası", "Çankırı, Balıbağı"));
        touristAttractions_models.add(new TouristAttractions_MODEL(R.drawable.ilgaz, "Ilgaz Kayak Mer.", "Çankırı, Ilgaz"));
        touristAttractions_models.add(new TouristAttractions_MODEL(R.drawable.nemrutdagi, "Nemrut Dağı", "Adıyaman, Kahta"));
        touristAttractions_models.add(new TouristAttractions_MODEL(R.drawable.balikligol, "Balıklı Göl", "Şanlıurfa, Eyyübiye"));


        touristAttractions_adapter = new TouristAttractions_ADAPTER(this, touristAttractions_models);
        manager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        touristattractions.setAdapter(touristAttractions_adapter);
        touristattractions.setLayoutManager(manager);

        cityname = findViewById(R.id.city_name);
        explore = findViewById(R.id.exploretouristdestinations_button);
        seetouristdestinations = findViewById(R.id.seetouristdestinations_link);
        seetouristattractions = findViewById(R.id.seetouristattractions_link);

        explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TourAttractionsList.class));
            }
        });

        seetouristdestinations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TourAttractionsList.class));
            }
        });

         seetouristattractions.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 startActivity(new Intent(MainActivity.this, TourAttractionsList.class));
             }
         });

    }
}

