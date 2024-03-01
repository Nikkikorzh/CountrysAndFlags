package com.example.countrysandflags;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends ArrayAdapter<Country> {

    private LayoutInflater inflater;
    private int layout;
    private List<Country> states;

    public Adapter(Context context, int resource, List<Country> countries) {
        super(context, resource, countries);
        this.states = countries;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convertView, ViewGroup parent) {

        View view=inflater.inflate(this.layout, parent, false);

        ImageView flagView = view.findViewById(R.id.flag);
        TextView nameView = view.findViewById(R.id.name);

        Country country = states.get(position);

        flagView.setImageResource(country.getFlagId());
        nameView.setText(country.getName());

        return view;
    }
}
