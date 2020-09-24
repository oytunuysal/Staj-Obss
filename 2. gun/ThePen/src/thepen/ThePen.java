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
public class ThePen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pen pen = new Pen();
        
        Circle aCirle = new Circle(100, "Red");
        Rectangle aRectangle = new Rectangle(10, 15, "Blue");
        
        pen.drawCircle(aCirle);
        pen.drawRectangle(aRectangle);
        
        pen.changeColorCircle("Orange", aCirle);
        pen.changeColorRectangle("Purple", aRectangle);
        
        aCirle.passByValue(aCirle.getRadius());
        aCirle.printRadius();
    }
    
}
