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


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_details, container, false);
    }

    public void UpdateData(Country data) {
        TextView tv1 = getView().findViewById(R.id.textView);
        TextView tv2 = getView().findViewById(R.id.textView2);
        TextView tv3 = getView().findViewById(R.id.textView3);
        ImageView img = getView().findViewById(R.id.imageView);

        tv1.setText(data.getName());
        tv2.setText(data.getCapital());
        tv3.setText(Integer.toString(data.getSize()));
        img.setImageResource(data.getFlagId());
    }

}