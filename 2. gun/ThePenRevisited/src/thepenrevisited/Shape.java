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
public class Shape {

    String color;

    public Shape(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    //abstract ?
    public void draw() {

    }

    public void changeColor(String color) {
        this.color = color;
    }
}
