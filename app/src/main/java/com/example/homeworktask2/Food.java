package com.example.homeworktask2;

public class Food {

    private int foodID;
    // Title of the article
    private String name;
    // Name of the author
    private String cost;
    // Short text to be displayed on main page
    private String description;
    // Full text of the article
    private int imageDrawableId;

    public Food(int foodID, String name, String cost, String description, int imageDrawableId) {
        this.foodID = foodID;
        this.name = name;
        this.cost = cost;
        this.description = description;
        this.imageDrawableId = imageDrawableId;

    }

    public int getFoodID() {
        return foodID;
    }

    public void setFoodID(int foodID) {
        this.foodID = foodID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageDrawableId() {
        return imageDrawableId;
    }

    public void setImageDrawableId(int imageDrawableId) {
        this.imageDrawableId = imageDrawableId;
    }

}



