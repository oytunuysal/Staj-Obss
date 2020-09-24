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
public class Form implements IMouseListener {

    private Button aButton;

    @Override
    public void mouseClicked(ClickEvent clickEvent) {
        System.out.println("Form mouse click.");
    }

    public Button getButton() {
        return aButton;
    }

    public void setButton(Button aButton) {
        this.aButton = aButton;
    }

}
