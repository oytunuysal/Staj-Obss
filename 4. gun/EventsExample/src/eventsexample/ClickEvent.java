/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventsexample;

import java.util.Date;
import java.util.EventObject;

/**
 *
 * @author Oytun
 */
public final class ClickEvent extends EventObject { //this should be immutable

    private final Date date;

    //button id
    public ClickEvent(Object source) {
        super(source);
        this.date = new Date();
    }

}
