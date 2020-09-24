/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thepen;

/**
 *
 * @author Oytun
 */
public class Circle {

    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void passByValue(int radius) {
        radius += radius;
        System.out.println("1st " + radius);
    }

    public void printRadius() {
        System.out.println("" + radius);
    }
}
