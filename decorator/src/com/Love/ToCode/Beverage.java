package com.Love.ToCode;

//\Starbuzz
public abstract class Beverage {
    Size size;
    String description = "Unkown Beverage";


    public Size getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = Size.valueOf(size);
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
