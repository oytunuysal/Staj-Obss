/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericseriallizable;

import java.io.Serializable;

/**
 *
 * @author Oytun
 */
public class Student implements Serializable {

    private String studentNumber;
    private String name;

    public Student(String studentNumber, String name) {
        this.studentNumber = studentNumber;
        this.name = name;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" + "studentNumber=" + studentNumber + ", name=" + name + '}';
    }

}
