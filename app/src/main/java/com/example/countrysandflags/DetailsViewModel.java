package com.example.countrysandflags;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DetailsViewModel extends ViewModel {

    private MutableLiveData<Country> selectedCountry = new MutableLiveData<>();

    public void setSelectedCountry(Country country) {
        selectedCountry.setValue(country);
    }

    public LiveData<Country> getSelectedCountry() {
        return selectedCountry;
    }
}
