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
public class Divider {

    public static int devide() {
        //throws MyCheckedException, MyUncheckedException
        // try {
        return 1 / 0;
        //  } catch (Exception e) {
        //      throw new MyCheckedException(e);
        //  }

    }
}
