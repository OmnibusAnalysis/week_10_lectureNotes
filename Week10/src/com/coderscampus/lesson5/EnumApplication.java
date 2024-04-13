package com.coderscampus.lesson5;

import java.sql.SQLOutput;

public class EnumApplication {

    public static void main(String[] args) {
       User user = new User("Casey", "Michael");

        System.out.println(user);

        if ("A".equals(user.getStatus().getValue())) {
            System.out.println("User is active");
        }

        if ("ACTIVE".equals(user.getStatus().name())) {
            System.out.println("User is active");
        }

        System.out.println(Card.ACE.getCardValue());
    }

}
