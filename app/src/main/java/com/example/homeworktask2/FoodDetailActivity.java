package com.example.homeworktask2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodDetailActivity extends AppCompatActivity {
    private TextView title;
    private TextView description;
    private TextView price;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_food);

        Intent intent = getIntent();
        int foodID = intent.getIntExtra("foodID", 0);
        Food food = FoodDatabase.getFoodById(foodID);

        title = findViewById(R.id.foodHeadline1);
        description = findViewById(R.id.foodDescription1);
        price = findViewById(R.id.foodPrice1);
        imageView = findViewById(R.id.foodPhoto1);

        title.setText(food.getName());
        description.setText(food.getDescription());
        price.setText(food.getCost());
        imageView.setImageResource(food.getImageDrawableId());
    }


}
