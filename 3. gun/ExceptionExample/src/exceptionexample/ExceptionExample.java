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
public class ExceptionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Executor.exec();
        } catch (MyCheckedException e) {
            e.printStackTrace();
        }

    }

}
