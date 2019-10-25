package com.example.homeworktask2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class MenuFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    public MenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu, container, false);
        recyclerView = view.findViewById(R.id.rv_main);
        layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);
        FoodAdapter foodAdapter = new FoodAdapter();
        foodAdapter.setData(FoodDatabase.getAllFoods());
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(15);

        recyclerView.setAdapter(foodAdapter);
        return view;

    }

}
