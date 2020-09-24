/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package immutableperson;

/**
 *
 * @author Oytun
 */
public final class Car {

    private final String carModel;
    private final Person owner;

    public Car(String carModel, Person owner) {
        this.carModel = carModel;
        this.owner = owner;
    }

    public String getCarModel() {
        return carModel;
    }

    @Override
    public String toString() {
        return "Car{" + "carModel=" + carModel + '}';
    }

}
