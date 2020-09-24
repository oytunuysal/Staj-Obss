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
public class ThePenWithInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pen pen = new Pen();

        Circle aCirle = new Circle(100, "Red");
        Rectangle aRectangle = new Rectangle(10, 15, "Blue");

        pen.draw(aCirle);
        pen.draw(aRectangle);

        pen.changeColor("Orange", aCirle);
        pen.changeColor("Purple", aRectangle);

        aCirle.passByValue(aCirle.getRadius());
        aCirle.printRadius();
    }

}
