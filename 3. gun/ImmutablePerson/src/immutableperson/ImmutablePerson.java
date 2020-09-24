/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package immutableperson;

import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author Oytun
 */
public class ImmutablePerson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean cont = true;
        String name, surname, model;
        //Date birthdaDate;
        Scanner scanner = new Scanner(System.in);
        while (cont) {
            System.out.println("Enter the name:");
            name = scanner.next();
            System.out.println("Enter the surname:");
            surname = scanner.next();
            //birthdaDate.setDate(scanner.next());
            
        }
    }

}
