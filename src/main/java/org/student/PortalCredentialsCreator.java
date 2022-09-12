package org.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PortalCredentialsCreator {
    public List<UserName> createListOfUsernames(List<Student> studentList) {
        List<UserName> usernames = new ArrayList<>();
        Map<String, List<Student>> firstNames = studentList.stream().collect(Collectors.groupingBy((Student::getFirstName)));
        firstNames.forEach((firstName, student) -> usernames.add(new UserName(firstName.toLowerCase())));
        return usernames;
    }

    public List<PassWord> createListOfRandomPasswords(List<Student> studentList) {
        return null;
    }
}
