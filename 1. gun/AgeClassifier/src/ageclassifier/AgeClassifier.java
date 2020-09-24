/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ageclassifier;

import java.util.Scanner;

/**
 *
 * @author Oytun
 */
public class AgeClassifier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int input = 0;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        while (0 != input) {
            if (input < 30) {
                System.out.println("Young");
            } else if (input < 60) {
                System.out.println("Middleaged");
            } else {
                System.out.println("Old");
            }
            input = scanner.nextInt();
        }

    }

}
