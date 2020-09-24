/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thepenwithinterface;

/**
 *
 * @author Oytun
 */
public abstract class Shape implements IDrawable {

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    abstract double getArea();

    public void changeColor(String color) {
        this.color = color;
    }

    @Override
    public double getDrawingInfo() {
        return this.getArea();
    }
}
