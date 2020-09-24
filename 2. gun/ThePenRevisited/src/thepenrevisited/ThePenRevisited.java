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
public class ThePenRevisited {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pen pen = new Pen();

        Circle aCirle = new Circle(100, "Red");
        Rectangle aRectangle = new Rectangle(10, 15, "Blue");
        /*
                pen.drawCircle(aCirle);
        pen.drawRectangle(aRectangle);

        pen.changeColorCircle("Orange", aCirle);
        pen.changeColorRectangle("Purple", aRectangle);
         */

        pen.drawShape(aCirle);
        pen.drawShape(aRectangle);

        pen.changeColor("Orange", aCirle);
        pen.changeColor("Purple", aRectangle);

        aCirle.passByValue(aCirle.getRadius());
        aCirle.printRadius();
    }

}
