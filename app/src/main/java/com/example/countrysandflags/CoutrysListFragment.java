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

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CoutrysListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CoutrysListFragment extends Fragment {

    ArrayList<Country> states = new ArrayList<Country>();

    ListView countriesList ;

    public CoutrysListFragment() {

    }


    public static CoutrysListFragment newInstance(String param1, String param2) {
        CoutrysListFragment fragment = new CoutrysListFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View view = inflater.inflate(R.layout.fragment_coutrys_list,container,false);

        ListView listView = (ListView)view.findViewById(R.id.countriesList);
        StateAdapter stateAdapter = new StateAdapter(getActivity(), R.layout.list_item,states);

        countriesList.setAdapter(stateAdapter);

        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {


                Country selectedState = (Country) parent.getItemAtPosition(position);
                Intent intent = new Intent(getActivity(), DetailsActivity.class);
                intent.putExtra("name",selectedState.getName());
                intent.putExtra("id",selectedState.getFlagId());
                intent.putExtra("capital",selectedState.getCapital());
                intent.putExtra("size",selectedState.getSize());
                startActivity(intent);
            }
        };
        countriesList.setOnItemClickListener(itemListener);
        return inflater.inflate(R.layout.fragment_coutrys_list, container, false);
    }
}