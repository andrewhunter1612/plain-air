package Plane;

import People.Passenger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Plane {

    private int capacity;
    private int mass;
    private int rows;
    private int seatsPerRow;
    private final HashMap<Integer, String> letters;
    private ArrayList<String> seatList;

    public Plane(PlaneType type) {
        this.capacity = type.getCapacity();
        this.mass = type.getMassCapacity();
        this.rows = type.getRows();
        this.seatsPerRow = type.getSeatsPerRow();
        this.letters = new HashMap<>();
        letters.put(1, "A");
        letters.put(2, "B");
        letters.put(3, "C");
        letters.put(4, "D");
        letters.put(5, "E");
        letters.put(6, "F");
        letters.put(7, "G");
        letters.put(8, "H");
        setSeats();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getMass() {
        return mass;
    }

    public ArrayList<String> setSeats() {
        seatList = new ArrayList<>();

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.seatsPerRow; j++) {
                String newSeat = (i + 1) + this.letters.get(j + 1);
                seatList.add(newSeat);
            }
        }
        return seatList;
    }

    public void bookSeat(Passenger passenger) {
        String seat = this.seatList.get(new Random().nextInt(this.seatList.size()));
        passenger.setSeat(seat);
        this.seatList.remove(seatList.indexOf(seat));
    }
}
