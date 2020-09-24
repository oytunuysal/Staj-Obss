/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventsexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Oytun
 */
public class Button {

    private List<IMouseListener> mouseListeners;
    //button id

    public void click() {
        ClickEvent clickEvent = new ClickEvent(this);
        for (Iterator<IMouseListener> iterator = mouseListeners.iterator(); iterator.hasNext();) {
            IMouseListener listener = iterator.next();
            listener.mouseClicked(clickEvent); 
        }
    }

    public Button() {
        this.mouseListeners = new ArrayList<>();
    }

    public void addMouseClickListener(IMouseListener mouseListener) {
        this.mouseListeners.add(mouseListener);
    }

    public void removeMouseClickListener(IMouseListener mouseListener) {
        this.mouseListeners.remove(mouseListener);
    }
}
