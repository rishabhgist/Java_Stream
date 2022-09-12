package org.student;

import lombok.Data;

@Data
public class UserName {
    private String username;

    public UserName(String username) {
        this.username = username;
    }
}
