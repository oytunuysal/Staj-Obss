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
public class BusReservation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //take the destination name from console (use valueOf)
        Bus bus1 = new Bus(Destination.ADANA, 1);
        
        bus1.insertPassenger(new Passenger("Ali", Destination.ADANA));
        bus1.insertPassenger(new Passenger("Veli", Destination.ANKARA));
        bus1.insertPassenger(new Passenger("Mehmet", Destination.ADANA));
        
    }
    
}
