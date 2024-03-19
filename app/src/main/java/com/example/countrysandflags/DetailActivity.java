package com.example.countrysandflags;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int flagId = getIntent().getIntExtra("flagId", 0);
        String name = getIntent().getStringExtra("name");
        String capital = getIntent().getStringExtra("capital");
        int size = getIntent().getIntExtra("size", 0);

        ImageView flagImageView = findViewById(R.id.flag);
        TextView countryNameTextView = findViewById(R.id.name);
        TextView capitalText = findViewById(R.id.capital);
        TextView sizeText = findViewById(R.id.size);


        flagImageView.setImageResource(flagId);
        countryNameTextView.setText("Название страны : " + name);
        capitalText.setText("Название столицы : "+capital);

        sizeText.setText(Integer.toString(size));
    }
}