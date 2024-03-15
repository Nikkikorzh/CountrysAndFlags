package com.example.countrysandflags;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

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
    ListView countriesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {

            CoutrysListFragment countryListFragment = new CoutrysListFragment();


            FragmentManager fragmentManager = getSupportFragmentManager();


            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


            fragmentTransaction.add(R.id.cont, countryListFragment);


            fragmentTransaction.commit();
        }
//        String[] names = new String[] {
//                "Moldova","Kazakhstan","United States of America","Ukraine","Belarus",
//                "India","China","Romania","France","Germany"
//        };
//        int[] id = new int[]{
//                R.drawable.moldova, R.drawable.moldova,R.drawable.kazakhstan,
//                R.drawable.ukraine , R.drawable.germany, R.drawable.france,
//                R.drawable.belarus, R.drawable.romania,R.drawable.usa,
//                R.drawable.china
//        };

//        countriesList = findViewById(R.id.countriesList);
//        StateAdapter stateAdapter = new StateAdapter((Context) this, R.layout.list_item,states);
//        countriesList.setAdapter(stateAdapter);
//
//        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
//
//                // получаем выбранный пункт
//                Country selectedState = (Country) parent.getItemAtPosition(position);
//                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
//                intent.putExtra("name",selectedState.getName());
//                intent.putExtra("id",selectedState.getFlagId());
//                intent.putExtra("capital",selectedState.getCapital());
//                intent.putExtra("size",selectedState.getSize());
//                startActivity(intent);
//            }
//        };
//        countriesList.setOnItemClickListener(itemListener);



    }



}

