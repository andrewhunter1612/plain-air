import Airports.Routes;
import People.CabinRank;
import People.Passenger;
import People.Pilot;
import Plane.Flight;
import Plane.Plane;
import org.junit.Before;
import Plane.PlaneType;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Pilot pilot;
    Passenger passenger, passenger1, passenger2, passenger3;

    @Before
    public void before(){
        passenger = new Passenger("James", 50, 20);
        passenger1 = new Passenger("James", 60, 21);
        passenger2 = new Passenger("James", 45, 15);
        passenger3 = new Passenger("James", 57, 18);
        plane = new Plane(PlaneType.BOEING747);
        pilot = new Pilot("Andrew", 100, CabinRank.CAPTAIN, "123string");
        flight = new Flight(plane, pilot, "Glasgow 123", Routes.GLA_EDI, "14:00");
        flight.addPassenger(passenger);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
    }

    @Test
    public void checkPilotInfo(){
        assertEquals("Andrew", pilot.getName());
        assertEquals("Captain", pilot.getRank());
    }

    @Test
    public void checkPlaneInfo(){
        assertEquals(400, plane.getCapacity());
        assertEquals(10000, plane.getMass());
    }

    @Test
    public void checkFlightInfo(){
        assertEquals(400, flight.getPlane().getCapacity());
    }

    @Test
    public void addPassengersToFlight(){
        assertEquals(74, flight.calculatePassengerBagTotalMass(), 0.0);
    }

    @Test
    public void calculatePassengerTotalMass(){
        assertEquals(212, flight.calculatePassengerTotalMass(), 0.0);
    }

    @Test
    public void calculatePassengerBaggageMass(){
        assertEquals(12.5, flight.baggageMassPerPassenger(), 0.0);
    }

    @Test
    public void calculateRemainingMass(){
        assertEquals(9714, flight.calculateMassLeftForBaggage(), 0.0);
    }
}
