package org.student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PortalCredentialsCreator portal = new PortalCredentialsCreator();
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(50, "John", "Doe", 2020));
        studentList.add(new Student(40, "Mad", "Max", 2021));
        System.out.println(portal.createListOfUsernames(studentList));
    }
}