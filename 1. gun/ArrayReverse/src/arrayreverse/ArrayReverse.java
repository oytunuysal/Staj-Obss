/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayreverse;

/**
 *
 * @author Oytun
 */
public class ArrayReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {1, 4, 2, 7, 3, 15, 35, 13, 11, 6};
        int[] reverseArray = new int[array.length]; //or it can just work on the array itself
        for (int i = 0; i < array.length; i++) {
            reverseArray[array.length - 1 - i] = array[i];
        }
        for (int i : reverseArray) {
            System.out.print(i + " ");
        }
    }
}
