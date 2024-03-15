package com.example.countrysandflags;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class StateAdapter extends ArrayAdapter<Country> {

    private LayoutInflater inflater;
    private int layout;
    private List<Country> states;

    private Context context;


    public StateAdapter(Context context, List<Country> states) {
        super(context, R.layout.list_item, states);
        this.context = context;
        this.states = states;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.list_item, parent, false);

        ImageView flagView = view.findViewById(R.id.flag);
        TextView nameView = view.findViewById(R.id.name);

        Country country = states.get(position);

        flagView.setImageResource(country.getFlagId());
        nameView.setText(country.getName());

        return view;
    }
}
