package com.example.countrysandflags;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView countrysList = (ListView) findViewById(R.id.country);

        String[] countryArray = new String[]{
                "Moldova","Kazakhstan","United States of America","Ukraine","Belarus",
                "India","China","Romania","France","Germany"
        };

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                R.layout.mydesign,countryArray);

        countrysList.setAdapter(arrayAdapter);
    }
}