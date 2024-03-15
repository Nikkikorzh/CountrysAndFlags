package com.example.countrysandflags;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailsFragment extends Fragment {

    private ImageView flagImageView;
    private TextView countryNameTextView;
    private TextView capitalTextView;
    private TextView areaTextView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_details, container, false);

        flagImageView = view.findViewById(R.id.flagImage);
        countryNameTextView = view.findViewById(R.id.countryName);
        capitalTextView = view.findViewById(R.id.countryCapital);
        areaTextView = view.findViewById(R.id.countrySize);

        DetailsViewModel detailsViewModel = new ViewModelProvider(requireActivity()).get(DetailsViewModel.class);
        detailsViewModel.getSelectedCountry().observe(getViewLifecycleOwner(), country -> {
            countryNameTextView.setText("Country: "+country.getName());
            flagImageView.setImageResource(country.getFlagId());
            areaTextView.setText("Size:" + Integer.toString(country.getSize()));
            capitalTextView.setText("Capital: " + country.getCapital());

        });

        return view;
    }

}