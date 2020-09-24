/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberguessgame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Oytun
 */
public class NumberGuessGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(32);
        randomNumber++;
        boolean hasFound = false;

        Scanner scanner = new Scanner(System.in);
        int input;
        while (!hasFound) {
            System.out.print("Take a guess: ");
            try {
                input = scanner.nextInt();
                if (input < randomNumber) {
                    System.out.println("Up!");
                } else if (input > randomNumber) {
                    System.out.println("Down!");
                } else {
                    System.out.println("You've found it!");
                    hasFound = true;
                }
            } catch (Exception e) {
                System.err.println(e);
                scanner.close();
                break;
            }
        }
    }

}
