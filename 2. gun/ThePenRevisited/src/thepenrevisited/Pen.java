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
public class Pen {

    public void drawShape(Shape shape) {
        shape.draw();
    }

    public void changeColor(String color, Shape shape) {
        shape.changeColor(color);
        System.out.println("Color changed to " + color);
    }

}
