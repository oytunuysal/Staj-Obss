/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializationoutputstream;

import java.io.Serializable;

/**
 *
 * @author Oytun
 */
public class Student implements Serializable {

    private String studentNumber;
    private String name;
    private String surname;
    private Course courseName;
    //private transient Course courseName;

    public Student(String studentNumber, String name, String surname, Course course) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.surname = surname;
        this.courseName = course;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setCourseName(Course courseName) {
        this.courseName = courseName;
    }

    public Course getCourseName() {
        return courseName;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Student{" + "studentNumber=" + studentNumber + ", name=" + name + ", surname=" + surname + ", courseName=" + courseName + '}';
    }

}
