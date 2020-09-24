/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventsexample;

import java.util.EventListener;

/**
 *
 * @author Oytun
 */
public interface IMouseListener extends EventListener {

    public void mouseClicked(ClickEvent clickEvent);
}
