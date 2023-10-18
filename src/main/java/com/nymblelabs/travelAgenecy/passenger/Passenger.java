package com.nymblelabs.travelAgenecy.passenger;

import com.nymblelabs.travelAgenecy.Destination;
import java.util.List;

public abstract class Passenger {

    private String name;
    private String contactNumber;
    private List<Destination> destinations;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public List<Destination> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<Destination> destinations) {
        this.destinations = destinations;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

}
