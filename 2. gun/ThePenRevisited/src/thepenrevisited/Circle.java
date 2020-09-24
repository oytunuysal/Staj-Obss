/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thepenrevisited;

/**
 *
 * @author Oytun
 */
public class Circle extends Shape {

    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void passByValue(int radius) {
        radius += radius;
        System.out.println("1st " + radius);
    }

    public void printRadius() {
        System.out.println("" + radius);
    }
    
    //circle only needs to know its area info
    @Override
    public void draw() {
        System.out.println("Area of the Circle: " + this.getRadius() * 3.14);
    }

}
