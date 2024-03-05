package com.example.countrysandflags;

import androidx.appcompat.app.AppCompatActivity;

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

public class MainActivity extends AppCompatActivity {

    ArrayList<Country> states = new ArrayList<Country>();
    ListView countriesList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setInitialData();
        String[] names = new String[] {
                "Moldova","Kazakhstan","United States of America","Ukraine","Belarus",
                "India","China","Romania","France","Germany"
        };
        int[] id = new int[]{
                R.drawable.moldova, R.drawable.moldova,R.drawable.kazakhstan,
                R.drawable.ukraine , R.drawable.germany, R.drawable.france,
                R.drawable.belarus, R.drawable.romania,R.drawable.usa,
                R.drawable.china
        };

        countriesList = findViewById(R.id.countriesList);
        StateAdapter stateAdapter = new StateAdapter((Context) this, R.layout.list_item,states);
        countriesList.setAdapter(stateAdapter);

        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                // получаем выбранный пункт
                Country selectedState = (Country) parent.getItemAtPosition(position);
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("name",selectedState.getName());
                intent.putExtra("id",selectedState.getFlagId());
                intent.putExtra("capital",selectedState.getCapital());
                intent.putExtra("size",selectedState.getSize());
                startActivity(intent);
            }
        };
        countriesList.setOnItemClickListener(itemListener);



    }
    private void setInitialData(){

        states.add(new Country ("Индия", R.drawable.india,3500,"Нью-Дели"));
        states.add(new Country ("Молдова", R.drawable.moldova,200,"Кишинёв"));
        states.add(new Country ("Казахстан",  R.drawable.kazakhstan,550,"Астана"));
        states.add(new Country ("Украина", R.drawable.ukraine,2800,"Киев"));
        states.add(new Country ("Германия", R.drawable.germany,550,"Берлин"));
        states.add(new Country ("Франция", R.drawable.france,1890,"Париж"));
        states.add(new Country ("Беларусь", R.drawable.belarus,1080,"Минск"));
        states.add(new Country ("Румыния",  R.drawable.romania,760,"Бухарест"));
        states.add(new Country ("США", R.drawable.usa,2330,"Вашингтон"));
        states.add(new Country ("Китай", R.drawable.china,3200,"Пекин"));
    }
}