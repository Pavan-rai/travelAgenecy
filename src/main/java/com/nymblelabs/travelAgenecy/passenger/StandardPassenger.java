package com.nymblelabs.travelAgenecy.passenger;

import com.nymblelabs.travelAgenecy.Activity;
import com.nymblelabs.travelAgenecy.Destination;

import java.util.List;

public class StandardPassenger extends Passenger {
    private Double balance;

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    private void costDeduction(Activity activity){
        this.setBalance(this.getBalance() - activity.getCost());
    }

    public void signUpActivity(Destination destination) {

        List<Activity> activities = destination.getActivity();

        for (Activity activity : activities) {

            if(activity.getFilled() >= activity.getCapacity())
                continue;

            if (activity.getCost() <= this.getBalance()) {
                this.costDeduction(activity);
            } else {
                continue;
            }

            if (activity.getCapacity() > activity.getFilled()) {
                activity.setFilled(activity.getFilled() + 1);

            }
        }
    }
}
