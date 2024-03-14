package com.example.countrysandflags;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailsFragment extends Fragment {

    TextView textView;

    TextView textView2;

    TextView textView3;

    ImageView imageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_details, container, false);
        imageView = view.findViewById(R.id.flag_image_view);
        textView2 = view.findViewById(R.id.country_name_text_view);
        textView3 = view.findViewById(R.id.capital_text_view);
        textView = view.findViewById(R.id.area_text_view);

        Bundle arguments = getArguments();
        if (arguments != null) {
            int flagId = arguments.getInt("flagId");
            String countryName = arguments.getString("countryName");
            String capital = arguments.getString("capital");
            int area = arguments.getInt("area");


            imageView.setImageResource(flagId);
            textView2.setText(countryName);
            textView3.setText("Столица: " + capital);
            textView.setText("Площадь: " + area);
        }
        return view;
    }


}