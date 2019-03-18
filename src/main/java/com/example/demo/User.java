package com.example.demo;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String name;

    private String email;

    public String getName() {
        return name;
    }

    public User(String name, String email){
		this.name = name;
		this.email = email;
	}

    public User() {
    }
}

