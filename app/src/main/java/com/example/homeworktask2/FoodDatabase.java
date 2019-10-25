package com.example.homeworktask2; // <============= CHANGE ME

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class FoodDatabase {



    public static Food getFoodById(int foodID) { return foods.get(foodID);
    }


    public static ArrayList<Food> getAllFoods() {
        return new ArrayList<Food>((List) Arrays.asList(foods.values().toArray()));
    }


    // You can ignore everything below this for now.
    public static final HashMap<Integer, Food> foods = new HashMap<>();

    static {
        foods.put(1, new Food(
                1,
                "Gourmet Burger",
                "$13.00",
                "Toasted patty with grilled meat seasoned to perfection, topped with two layers of cheese, and lightly sauced with tomatoes and onions",
                R.drawable.burger
        ));
        foods.put(2, new Food(
                2,
                "Spaghetti and Meatballs",
                "$12.00",
                "Perfectly cooked spaghetti with freshly made tomato sauce and basil, and delicious meatballs",
                R.drawable.spagh
        ));
        foods.put(3, new Food(
                3,
                "Fish Fillet",
                "$10.00",
                "Crumbed fish fillet touched up with fresh lemon and herbs, seasoned with salt and pepper",
                R.drawable.fish
        ));
        foods.put(4, new Food(
                4,
                "Potato Salad",
                "$4.00",
                "Freshly made potato salad with an assortment of vegetables and crutons",
                R.drawable.potato
        ));
        foods.put(5, new Food(
                5,
                "Sausages and Egg",
                "$3.50",
                "British style sausage patties and eggs cooked to your liking, with a complementary sauce of your choice",
                R.drawable.sausage
        ));
        foods.put(6, new Food(
                6,
                "Hotdogs",
                "$3.50",
                "Classic American style hotdog with tomato and mustard sauce, and a soft-breaded bun or crispy bun of your choosing",
                R.drawable.hotdog
        ));
        foods.put(7, new Food(
                7,
                "Papaya Salad",
                "$10.50",
                "This vegan green papaya salad is a delicious light appetizer. It is dressed with a tangy and mildly sweet dressing made of rice vinegar, garlic, shallots, soy sauce and maple syrup",
                R.drawable.papaya
        ));
        foods.put(8, new Food(
                8,
                "Meatpie and Chips",
                "$8.50",
                "American style meatpie and freshly cut and salted chips with a sauce of your choosing",
                R.drawable.meat_pie
        ));
        foods.put(9, new Food(
                9,
                "Fried Chips and Gravy",
                "$5.50",
                "Freshly cut and seasoned chips with the best gravy ever, a perfect side dish or snack",
                R.drawable.chips_and_gravy
        ));
        foods.put(10, new Food(
                10,
                "Dumplings",
                "$6.50",
                "Chinese dumplings, pork, chive, cabbage, with a choice of soy sauce or vinegar",
                R.drawable.dumplings
        ));
        foods.put(11, new Food(
                11,
                "Peking Duck",
                "$14.50",
                "BBQ duck cut boneless with a side of chinese pancakes and plum sauce",
                R.drawable.duck
        ));
        foods.put(12, new Food(
                12,
                "Ravioli",
                "$10.50",
                "Freshly made pasta topped with fresh basil",
                R.drawable.ravioli
        ));
        foods.put(13, new Food(
                13,
                "Fruit Salad",
                "$4.50",
                "Freshly made fruit salad, choose five fruits from the following; pineapple, apple, banana, rockmelon, orange, pear, grapes, strawberry, mango",
                R.drawable.fruit_salad
        ));
        foods.put(14, new Food(
                14,
                "Chocolate Pudding",
                "$4.50",
                "The best chocolate pudding you will ever taste, topped with icing sugar",
                R.drawable.choco_pudding
        ));
        foods.put(15, new Food(
                15,
                "Vanilla Ice-Cream",
                "$1.50",
                "Plain scoop of our famous vanilla ice-cream",
                R.drawable.vanilla_icecream
        ));

    }
}


