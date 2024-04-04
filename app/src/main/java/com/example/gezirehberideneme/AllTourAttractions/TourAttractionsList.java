package com.example.gezirehberideneme.AllTourAttractions;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.gezirehberideneme.MainActivity;
import com.example.gezirehberideneme.R;

import java.util.ArrayList;

public class TourAttractionsList extends AppCompatActivity {

    ImageView imageView;
    RecyclerView recycler;
    LinearLayoutManager manager;
    TourAttractionsList_Adapter adapter;
    ArrayList<TourAttractionsList_Model> array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_attractions_list);

        array = new ArrayList<>();
        array.add(new TourAttractionsList_Model("Kız Kulesi", "İstanbul, Üsküdar", R.drawable.maidentower));
        array.add(new TourAttractionsList_Model("Rumeli Hisarı", "İstanbul, Sarıyer", R.drawable.rumelihisari));
        array.add(new TourAttractionsList_Model("Sümela Manastırı", "Trabzon, OrtaHisar", R.drawable.sumelamanastiri));
        array.add(new TourAttractionsList_Model("Galata Kulesi", "İstanbul, Beyoğlu, İstiklal Cad.", R.drawable.galatatower));
        array.add(new TourAttractionsList_Model("Tuz Mağrası", "Çankırı, Balıbağı", R.drawable.tuzmagrasi));
        array.add(new TourAttractionsList_Model("Ilgaz Kayak Mer.", "Çankırı, Ilgaz", R.drawable.ilgaz));
        array.add(new TourAttractionsList_Model("Nemrut Dağı", "Adıyaman, Kahta", R.drawable.nemrutdagi));
        array.add(new TourAttractionsList_Model("Balıklı Göl", "Şanlıurfa, Eyyübiye", R.drawable.balikligol));
        array.add(new TourAttractionsList_Model("Dolmabahçe Sarayı", "İstanbul, Taksim", R.drawable.dolmabahcesarayi));
        array.add(new TourAttractionsList_Model("Saat Kulesi", "İzmir, Konak", R.drawable.saatkulesi));



        adapter = new TourAttractionsList_Adapter(this, array);

        manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recycler = findViewById(R.id.tourattr_recycler);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(manager);

        imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TourAttractionsList.this, MainActivity.class));
            }
        });

    }
}