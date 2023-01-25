package org.example;

import java.time.LocalDate;

public class Git {

    private int id;
    private String name; // Declaration
    private String email;
    private LocalDate dob;

    public Git(int id, String name, String email, LocalDate dob){
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Git{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                '}';
    }
}