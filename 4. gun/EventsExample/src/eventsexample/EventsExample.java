/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventsexample;

/**
 *
 * @author Oytun
 */
public class EventsExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Executer

        Form form = new Form();
        Button button = new Button();
        form.setButton(button);

        button.addMouseClickListener(form);

        button.click();
    }

}
