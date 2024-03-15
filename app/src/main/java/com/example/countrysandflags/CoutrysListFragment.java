package com.example.countrysandflags;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.List;

public class CoutrysListFragment extends Fragment {

    private ListView listView;
    private CountriesViewModel countriesViewModel;
    private DetailsViewModel detailsViewModel;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_coutrys_list, container, false);

        listView = view.findViewById(R.id.countriesList);

        countriesViewModel = new ViewModelProvider(requireActivity()).get(CountriesViewModel.class);
        countriesViewModel.getCountries().observe(getViewLifecycleOwner(), countries -> {
            StateAdapter countryAdapter = new StateAdapter(requireActivity(), countries);
            listView.setAdapter(countryAdapter);
        });


        detailsViewModel = new ViewModelProvider(requireActivity()).get(DetailsViewModel.class);

        listView.setOnItemClickListener((parent, view1, position, id) -> {
            Country selectedCountry = (Country) parent.getItemAtPosition(position);

            detailsViewModel.setSelectedCountry(selectedCountry);


            DetailsFragment detailsFragment = new DetailsFragment();


            requireActivity().getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.cont, detailsFragment)
                    .addToBackStack(null)
                    .commit();
        });

        return view;
    }
}