package com.example.countrysandflags;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class CountriesViewModel extends ViewModel {

    private MutableLiveData<List<Country>> statesData = new MutableLiveData<>();

    public LiveData<List<Country>> getCountries() {
        if (statesData.getValue() == null) {
            setCountries();
        }
        return statesData;
    }

    private void setCountries() {
        List<Country> states = new ArrayList<>();
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

        statesData.setValue(states);
    }
}
