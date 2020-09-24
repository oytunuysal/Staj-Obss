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
public class Pen {

    public void drawRectangle(Rectangle r) {
        int area = r.getHeight() * r.getWidth();
        System.out.println("Area of the Rectangle: " + area);
    }

    public void drawCircle(Circle c) {
        System.out.println("Area of the Circle: " + c.getRadius() * 3.14);
    }

    public void changeColorRectangle(String color, Rectangle r) {
        r.setColor(color);
        System.out.println("Rectangle color changed to " + color);
    }

    public void changeColorCircle(String color, Circle c) {
        c.setColor(color);
        System.out.println("Circle color changed to " + color);
    }
}
