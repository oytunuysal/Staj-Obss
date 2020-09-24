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
public class Pen {

    public void draw(IDrawable drawable) {
        double area = drawable.getDrawingInfo();
        System.out.println("Drawing a shape with area of " + area);
    }

    public void changeColor(String color, Shape shape) {
        shape.changeColor(color);
        System.out.println("Color changed to " + color);
    }

}
