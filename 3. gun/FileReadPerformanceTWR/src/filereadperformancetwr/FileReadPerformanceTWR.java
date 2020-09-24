/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereadperformancetwr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Oytun
 */
public class FileReadPerformanceTWR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Oytun\\Desktop\\Obss staj\\sampleACAD.txt");
        char[] c = new char[100000000];
        char[] d = new char[100000000];

        try (
                FileReader fileReader = new FileReader(file)) {

            if (fileReader.ready()) {
                long startingTime = System.currentTimeMillis();
                fileReader.read(c);
                long endingTime = System.currentTimeMillis();
                System.out.println("Final score for filereader: " + (endingTime - startingTime));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            if (bufferedReader.ready()) {
                long startingTimeBuffered = System.currentTimeMillis();
                bufferedReader.read(d);

                long endingTimeBuffered = System.currentTimeMillis();
                System.out.println("Final score for bufferedReader: " + (endingTimeBuffered - startingTimeBuffered));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
