package com.example.countrysandflags;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class CoutrysListFragment extends Fragment {

    ArrayList<Country> states = new ArrayList<Country>();
    ListView countriesList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_coutrys_list, container, false);
        super.onCreate(savedInstanceState);
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


        // получаем элемент ListView
        countriesList = view.findViewById(R.id.countriesList);
        // создаем адаптер
        StateAdapter stateAdapter = new StateAdapter(getContext(), R.layout.list_item,states);
        // устанавливаем для списка адаптер
        countriesList.setAdapter(stateAdapter);
        // добавляем для списка слушатель

        countriesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Country country = states.get(position);


                Bundle bundle = new Bundle();
                bundle.putInt("flagId", country.getFlagId());
                bundle.putString("countryName", country.getName());
                bundle.putString("capital", country.getCapital());
                bundle.putInt("area", country.getSize());


                DetailsFragment detailsFragment = new DetailsFragment();
                detailsFragment.setArguments(bundle);
                requireActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container, detailsFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
        return view;
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