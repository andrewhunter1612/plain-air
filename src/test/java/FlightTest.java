import Airports.Routes;
import People.CabinRank;
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

    @Before
    public void before(){

        plane = new Plane(PlaneType.BOEING747);
        pilot = new Pilot("Andrew", 100, CabinRank.CAPTAIN, "123string");
        flight = new Flight(plane, pilot, "Glasgow 123", Routes.GLA_EDI, "14:00");
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
    public void calculatePassengerBaggageMass(){
        assertEquals(12.5, flight.baggageMassPerPassenger(), 0.0);
    }
}
