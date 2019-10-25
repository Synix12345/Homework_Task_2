package com.example.homeworktask2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;


public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {

    public ArrayList <Food> foods;

    @NonNull
    @Override
    public FoodAdapter.FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food, parent, false);
        FoodViewHolder foodViewHolder = new FoodViewHolder(view);
        return foodViewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        final Food foodAtPosition = foods.get(position);
        holder.headline.setText(foodAtPosition.getName());
        holder.food.setImageResource(foodAtPosition.getImageDrawableId());

        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Context context = view.getContext();
                Intent intent = new Intent(context, FoodDetailActivity.class);
                intent.putExtra("foodID", foodAtPosition.getFoodID());
                context.startActivity(intent);
            }


        });
    }

    public void setData(ArrayList <Food> foods) {
        this.foods = foods;
    }

    @Override
    public int getItemCount() {
        return foods.size();
    }

    public class FoodViewHolder extends RecyclerView.ViewHolder{
        public ImageView food;
        public TextView headline;


        public View view;
        public FoodViewHolder(View itemView) {
            super(itemView);
            view = itemView;
            headline = itemView.findViewById(R.id.foodHeadline);
            food = itemView.findViewById(R.id.foodPhoto);

        }
    }


}

