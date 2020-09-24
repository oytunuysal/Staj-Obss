/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionexample;

/**
 *
 * @author Oytun
 */
public class MyUncheckedException extends RuntimeException {

    public MyUncheckedException(Throwable exception) {
        super(exception);
    }
}
