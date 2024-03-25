package com.example.tugaspb2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    public Context context;
    public List<Item> items;

    public MyAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.item_view, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Item currentItem = items.get(position);

        holder.nameView.setText(currentItem.getName());
        holder.nimView.setText(currentItem.getNim());
        holder.imageView.setImageResource(currentItem.getImage());

        // Set OnClickListener for the item view
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start DetailActivity and pass the item data
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("name", currentItem.getName());
                intent.putExtra("nim", currentItem.getNim());
                intent.putExtra("image", currentItem.getImage());
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // Add this flag
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
