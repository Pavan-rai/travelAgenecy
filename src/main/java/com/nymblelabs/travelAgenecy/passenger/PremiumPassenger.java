package com.nymblelabs.travelAgenecy.passenger;

import com.nymblelabs.travelAgenecy.Activity;
import com.nymblelabs.travelAgenecy.Destination;
import java.util.List;

public class PremiumPassenger extends Passenger {

    public void signUpActivity(Destination destination){

        List<Activity> activities = destination.getActivity();

        for(Activity activity : activities){
            if(activity.getFilled() >= activity.getCapacity())
                continue;
            if(activity.getCapacity() > activity.getFilled()){
                activity.setFilled(activity.getFilled() + 1);
            }
        }


    }

}
