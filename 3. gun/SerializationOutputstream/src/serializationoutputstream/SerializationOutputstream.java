/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializationoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Oytun
 */
public class SerializationOutputstream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        write();
        read();
    }

    public static void write() {
        Course mathCourse = new Course("Math");
        Student student1 = new Student("12345", "Ali", "Veli", mathCourse);

        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\Oytun\\Desktop\\Obss staj\\new.txt"); ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            oos.writeObject(student1);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void read() {

        try (FileInputStream fis = new FileInputStream("C:\\Users\\Oytun\\Desktop\\Obss staj\\new.txt"); ObjectInputStream ois = new ObjectInputStream(fis);) {
            Student student1 = (Student) ois.readObject(); //nullptr
            System.out.println("Name:" + student1);

        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
