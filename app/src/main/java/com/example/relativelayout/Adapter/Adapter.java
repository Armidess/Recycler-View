package com.example.relativelayout.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.relativelayout.Model.models;
import com.example.relativelayout.R;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.viewHolder> {
    ArrayList<models> list;
    Context context;

    public Adapter(ArrayList<models> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.layout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        models model=list.get(position);
        holder.imgView.setImageResource(model.getPic());
        holder.txtView.setText(model.getText());
        holder.imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Item " +model.getText()+" Is Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        holder.txtView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, model.getText()+" is Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        ImageView imgView;
        TextView txtView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imgView=itemView.findViewById(R.id.imageView);
            txtView = itemView.findViewById(R.id.textView);
        }
    }

}
