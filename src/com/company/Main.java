package com.company;

import model.User;

public class Main {

    public static void main(String[] args) {
	// write your code here
        User user = new User("Serebro", "Alex", "Stanislavovich");
        System.out.println(user.getLogin());
        System.out.println(user.getPassword());
        System.out.println(user.isEquals("user"));

    }
}
