package com.nymblelabs.travelAgenecy;

public class Activity {
    private String name;
    private String description;
    private Integer cost;
    private Integer capacity;
    private Integer filled;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getFilled() {
        return filled;
    }

    public void setFilled(Integer filled) {
        this.filled = filled;
    }
}
