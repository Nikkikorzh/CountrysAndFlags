package com.example.countrysandflags;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.countrysandflags.Country;
import com.example.countrysandflags.R;

import java.util.List;

public class StateAdapter extends RecyclerView.Adapter<StateAdapter.myViewHolder> {

    private LayoutInflater inflater;
    private List<Country> states;

    private Context context;

    interface OnCountryClickListener{
        void onStateClick(Country country, int position);
    }
    private OnCountryClickListener onClickListener;
    public StateAdapter(Context context, List<Country> states,OnCountryClickListener onClickListener) {
        this.onClickListener = onClickListener;
        this.states = states;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getItemCount() {
        return states.size();
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        @SuppressLint("ResourceType")
        View view = inflater.inflate(R.layout.list_item,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Country country = states.get(position);
        holder.img.setImageResource(country.getFlagId());
        holder.nameText.setText(country.getName());
        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                onClickListener.onStateClick(country, position);
            }
        });
    }



    public class myViewHolder extends RecyclerView.ViewHolder {
        TextView nameText;

        ImageView img;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            nameText = itemView.findViewById(R.id.nameItem);
            img = itemView.findViewById(R.id.flagItem);
        }
    }
}
