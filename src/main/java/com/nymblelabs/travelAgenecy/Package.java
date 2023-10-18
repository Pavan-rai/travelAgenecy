package com.nymblelabs.travelAgenecy;

import com.nymblelabs.travelAgenecy.passenger.GoldPassenger;
import com.nymblelabs.travelAgenecy.passenger.Passenger;
import com.nymblelabs.travelAgenecy.passenger.PremiumPassenger;
import com.nymblelabs.travelAgenecy.passenger.StandardPassenger;

import java.util.HashMap;
import java.util.List;

public class Package {
    private String name;
    private Integer capacity;
    private List<Destination> destinations;
    private List<PremiumPassenger> premiumPassengers;
    private List<GoldPassenger> goldPassengers;
    private List<StandardPassenger> standardPassengers;

    public List<PremiumPassenger> getPremiumPassengers() {
        return premiumPassengers;
    }

    public void setPremiumPassengers(List<PremiumPassenger> premiumPassengers) {
        this.premiumPassengers = premiumPassengers;
    }

    public List<GoldPassenger> getGoldPassengers() {
        return goldPassengers;
    }

    public void setGoldPassengers(List<GoldPassenger> goldPassengers) {
        this.goldPassengers = goldPassengers;
    }

    public List<StandardPassenger> getStandardPassengers() {
        return standardPassengers;
    }

    public void setStandardPassengers(List<StandardPassenger> standardPassengers) {
        this.standardPassengers = standardPassengers;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public List<Destination> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<Destination> destinations) {
        this.destinations = destinations;
    }



    public void printItinerary(){
        System.out.println("Package name : "+ getName());

        for(Destination destination : this.getDestinations()){
            System.out.println("Destination name : " +destination.getName());
            List<Activity> activities = destination.getActivity();
            System.out.println("Activities Description for destinations : ");
            for(Activity activity : activities) {
                System.out.print(" Activity Name : " + activity.getName());
                System.out.print(" Activity Description : " + activity.getDescription());
                System.out.print(" Activity Cost : " + activity.getCost());
                System.out.println(" Activity Capacity : " + activity.getCapacity());
            }
        }
    }

    public void printPassengerList(){
        System.out.println("Package name : "+ getName() +" Package Passenger Capacity : " + this.getCapacity());
        System.out.println(" Number of passengers currently enrolled : " + (this.getGoldPassengers().size() + this.getPremiumPassengers().size() + this.getStandardPassengers().size()));

        for(Passenger passenger : this.getPremiumPassengers()){
            System.out.println(" Passenger Name : "+ passenger.getName() + " Passenger ContactNumber : " + passenger.getContactNumber());
        }
        for(Passenger passenger : this.getStandardPassengers()){
            System.out.println(" Passenger Name : "+ passenger.getName() + " Passenger ContactNumber : " + passenger.getContactNumber());
        }
        for(Passenger passenger : this.getGoldPassengers()){
            System.out.println(" Passenger Name : "+ passenger.getName() + " Passenger ContactNumber : " + passenger.getContactNumber());
        }

    }

    public void printDetailsOfPassengerList(){
        for(PremiumPassenger passenger : this.getPremiumPassengers()){
            System.out.println(" Passenger Name : "+ passenger.getName() + " Passenger ContactNumber : " + passenger.getContactNumber());
            List<Destination> destinations = passenger.getDestinations();
            for(Destination destination : destinations){
                List<Activity> activities = destination.getActivity();
                for(Activity activity : activities)
                    System.out.println(" Activity Name : " + activity.getName() + " Price Paid for Activity : " + activity.getCost());
            }
        }
        for(StandardPassenger passenger : this.getStandardPassengers()){
            System.out.println(" Passenger Name : "+ passenger.getName() + " Passenger ContactNumber : " + passenger.getContactNumber() +" Balance : "+ passenger.getBalance());
            List<Destination> destinations = passenger.getDestinations();
            for(Destination destination : destinations){
                List<Activity> activities = destination.getActivity();
                for(Activity activity : activities)
                    System.out.println(" Activity Name : " + activity.getName() + " Price Paid for Activity : " + activity.getCost());
            }
        }
        for(GoldPassenger passenger : this.getGoldPassengers()){
            System.out.println(" Passenger Name : "+ passenger.getName() + " Passenger ContactNumber : " + passenger.getContactNumber() +" Balance : "+ passenger.getBalance());
            List<Destination> destinations = passenger.getDestinations();
            for(Destination destination : destinations){
                List<Activity> activities = destination.getActivity();
                for(Activity activity : activities)
                   System.out.println(" Activity Name : " + activity.getName() + " Price Paid for Activity : " + activity.getCost());
            }
        }
    }

    public void printDetailsOfActivities(){

        HashMap<Activity,Integer> activityIntegerHashMap = new HashMap<>();

        for(PremiumPassenger passenger : this.getPremiumPassengers()){
            List<Destination> destinations = passenger.getDestinations();
            for(Destination destination : destinations){
                List<Activity> activities = destination.getActivity();
                for(Activity activity : activities)
                    activityIntegerHashMap.put(activity,activityIntegerHashMap.getOrDefault(activity,0) + 1);
            }
        }

        for(StandardPassenger passenger : this.getStandardPassengers()){
            List<Destination> destinations = passenger.getDestinations();
            for(Destination destination : destinations){
                List<Activity> activities = destination.getActivity();
                for(Activity activity : activities)
                  activityIntegerHashMap.put(activity,activityIntegerHashMap.getOrDefault(activity,0) + 1);
            }
        }

        for(GoldPassenger passenger : this.getGoldPassengers()){
            List<Destination> destinations = passenger.getDestinations();
            for(Destination destination : destinations){
                List<Activity> activities = destination.getActivity();
                for(Activity activity : activities)
                    activityIntegerHashMap.put(activity,activityIntegerHashMap.getOrDefault(activity,0) + 1);
            }
        }

        for(Destination destination : this.getDestinations()){
            List<Activity> activities = destination.getActivity();
            for(Activity activity : activities) {
                if (activity.getCapacity() > activityIntegerHashMap.get(activity)) {
                    System.out.println("Activity name : " + activity.getName());
                    System.out.println("Activity Space Available : " + (activity.getCapacity() - activityIntegerHashMap.get(activity)));
                }
            }
        }

    }

}
