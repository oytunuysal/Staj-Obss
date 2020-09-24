/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericseriallizable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oytun
 */
public class GenericSeriallizable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Oytun\\Desktop\\Obss staj\\objects.txt");
        try (FileOutputStream fos = new FileOutputStream(file); FileInputStream fis = new FileInputStream(file)) {
            Student student1 = new Student("1234", "Ali");
            Student student2 = new Student("1235", "Ahmet");
            Student student3 = new Student("1236", "Veli");
            List<Student> students = new ArrayList<Student>();

            students.add(student1);
            students.add(student2);
            students.add(student3);

            GenericUtility<Student> util = new GenericUtility();
            util.serializeObject(fos, students);
            Student s1 = (Student) util.deserialize(fis);
            System.out.println(s1.toString());
        } catch (Exception e) {
            System.err.println(e);
        }

    }

}
