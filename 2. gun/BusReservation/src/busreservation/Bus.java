/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busreservation;

/**
 *
 * @author Oytun
 */
public class Bus {

    private Destination destination;
    private Passenger[] passengers;
    private int seatsLeft;

    public Bus(Destination destination, int capacity) {
        this.passengers = new Passenger[capacity];
        this.destination = destination;
        this.seatsLeft = capacity;
    }

    public void insertPassenger(Passenger passenger) {
        //add something to prevent null pointer
        if (passenger.getDestination() != destination) {
            System.out.println("Destinations do not match");
        } else if (seatsLeft == 0) {
            System.out.println("Bus is full");
        } else {
            passengers[seatsLeft - 1] = passenger;
            seatsLeft--;
            System.out.println("Passenger inserted");
        }

    }
}
