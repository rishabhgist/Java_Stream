package org.student;

import lombok.Data;

@Data
public class Student {
    private int rollNumber;
    private String firstName;
    private String lastName;
    private int currentYearOfStudent;

    public Student(int rollNumber, String firstName, String lastName, int currentYearOfStudent) {
        this.rollNumber = rollNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.currentYearOfStudent = currentYearOfStudent;
    }
}
