package com.example.countrysandflags;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
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
        Adapter adapter = new Adapter((Context) this, R.layout.list_item,states);
        countriesList.setAdapter(adapter);



    }
    private void setInitialData(){

        states.add(new Country ("Индия", R.drawable.india));
        states.add(new Country ("Молдова", R.drawable.moldova));
        states.add(new Country ("Казахстан",  R.drawable.kazakhstan));
        states.add(new Country ("Украина", R.drawable.ukraine));
        states.add(new Country ("Германия", R.drawable.germany));
        states.add(new Country ("Франция", R.drawable.france));
        states.add(new Country ("Беларусь", R.drawable.belarus));
        states.add(new Country ("Румыния",  R.drawable.romania));
        states.add(new Country ("США", R.drawable.usa));
        states.add(new Country ("Китай", R.drawable.china));
    }
}