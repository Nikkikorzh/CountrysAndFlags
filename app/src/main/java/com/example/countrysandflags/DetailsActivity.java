package com.example.countrysandflags;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView name;
        TextView capital;
        TextView size;
        ImageView image;

        Intent intent = getIntent();
        name = (TextView) findViewById(R.id.textView);
        capital = (TextView) findViewById(R.id.textView2);
        size = (TextView) findViewById(R.id.textView3);
        image = (ImageView) findViewById(R.id.imageView);

        int id = intent.getIntExtra("id",0);
        image.setImageResource(id);
        name.setText(intent.getStringExtra("name"));
        capital.setText(intent.getStringExtra("capital"));
        size.setText(Integer.toString(intent.getIntExtra("size",0)));
    }
}