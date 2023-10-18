package com.nymblelabs.travelAgenecy;

import java.util.List;

public class Destination {
    private String name;
    private List<Activity> activity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Activity> getActivity() {
        return activity;
    }

    public void setActivity(List<Activity> activity) {
        this.activity = activity;
    }
}
