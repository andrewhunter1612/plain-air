package Plane;

import Airports.Routes;
import People.CabinCrew;
import People.Passenger;
import People.Pilot;

import java.util.ArrayList;
import java.util.Date;

public class Flight {

    private Plane plane;
    private Pilot pilot;
    private ArrayList<CabinCrew> cabinCrews;
    private ArrayList<Passenger> passengers;
    private String flightNumber;
    private String destination;
    private String departure;
    private int flightTime;
    private String departureTime;

    public Flight(Plane plane, Pilot pilot, String flightNumber, Routes routes, String departureTime) {
        this.plane = plane;
        this.pilot = pilot;
        this.cabinCrews = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.destination = routes.getEndCity();
        this.departure = routes.getStartCity();
        this.flightTime = routes.getTimeMins();
        this.departureTime = departureTime;
    }

    public double baggageMassPerPassenger() {
        double mass = Double.parseDouble(String.valueOf(this.plane.getMass()));
        double capacity = Double.parseDouble(String.valueOf(this.plane.getCapacity()));
        return mass / capacity / 2;
    }

    public double calculatePassengerBagTotalMass() {
        double totalBagMass = 0.0;
        for (Passenger passenger : this.passengers){
            totalBagMass += passenger.getBagMass();
        }
        return totalBagMass;
    }

    public double calculatePassengerTotalMass(){
        double totalMass = 0.0;
        for (Passenger passenger : this.passengers){
            totalMass += passenger.getMass();
        }
        return totalMass;
    }

    public double calculateMassLeftForBaggage(){
        return this.plane.getMass() - calculatePassengerTotalMass() - calculatePassengerBagTotalMass();
    }

    public void addPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }

    public Plane getPlane() {
        return plane;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public ArrayList<CabinCrew> getCabinCrews() {
        return cabinCrews;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDeparture() {
        return departure;
    }

    public int getFlightTime() {
        return flightTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }


}
