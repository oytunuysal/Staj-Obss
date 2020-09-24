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
public class Executor {

    public static void exec() throws MyCheckedException {
        try {
            Divider.devide();
        } catch (ArithmeticException e) { //aritmetic exception
            //           System.err.println("CheckedException!");
            //           throw new MyCheckedException(e);
            throw new MyUncheckedException(e);
        }

    }
}
