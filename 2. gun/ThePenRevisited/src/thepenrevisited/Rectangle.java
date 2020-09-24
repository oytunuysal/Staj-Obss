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
public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(int width, int height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void draw() {
        int area = this.getHeight() * this.getWidth();
        System.out.println("Area of the Rectangle: " + area);
    }

}
