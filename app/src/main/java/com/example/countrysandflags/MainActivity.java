package com.example.countrysandflags;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity{

    ArrayList<Country> states = new ArrayList<Country>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.countries);
        StateAdapter.OnCountryClickListener stateClickListener = new StateAdapter.OnCountryClickListener() {
            @Override
            public void onStateClick(Country state, int position) {

                Country country = states.get(position);

                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra("flagId",country.getFlagId());
                intent.putExtra("name",country.getName());
                intent.putExtra("capital",country.getCapital());
                intent.putExtra("size",country.getSize());
                startActivity(intent);
            }
        };
        StateAdapter adapter = new StateAdapter(this, states, stateClickListener);
        recyclerView.setAdapter(adapter);


    }
    private void setInitialData(){

        states.add(new Country ("Индия", R.drawable.india,"Нью-Дели",3500));
        states.add(new Country ("Молдова", R.drawable.moldova,"Кишинёв",200));
        states.add(new Country ("Казахстан",  R.drawable.kazakhstan,"Астана",550));
        states.add(new Country ("Украина", R.drawable.ukraine,"Киев",2800));
        states.add(new Country ("Германия", R.drawable.germany,"Берлин",550));
        states.add(new Country ("Франция", R.drawable.france,"Париж",1890));
        states.add(new Country ("Беларусь", R.drawable.belarus,"Минск",1080));
        states.add(new Country ("Румыния",  R.drawable.romania,"Бухарест",760));
        states.add(new Country ("США", R.drawable.usa,"Вашингтон",2330));
        states.add(new Country ("Китай", R.drawable.china,"Пекин",3200));
    }


}