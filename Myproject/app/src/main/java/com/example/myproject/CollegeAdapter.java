package com.example.myproject;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CollegeAdapter extends RecyclerView.Adapter {

    ArrayList<Namecolleges> mArray;
    Context context;

    public CollegeAdapter(ArrayList<Namecolleges> mArray, Context context) {
        this.mArray = mArray;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.collegelist,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder) holder).namecollege.setText(mArray.get(position).getName());
        ((ViewHolder) holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(context,details.class);

                a.putExtra("name",mArray.get(position));
                context.startActivity(a);
            }
        });


    }

    @Override
    public int getItemCount() {
        return mArray.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView namecollege;
        public View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view=itemView;
            namecollege = view.findViewById(R.id.textView);



        }
    }
}
