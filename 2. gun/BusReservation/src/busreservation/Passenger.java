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
public class Passenger {
    private String name;
    private Destination destination;

    public Passenger(String name, Destination destination) {
        this.name = name;
        this.destination = destination;
    }

    public String getName() {
        return name;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }
    
}
