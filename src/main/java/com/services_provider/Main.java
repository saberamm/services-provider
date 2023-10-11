package com.services_provider;

import com.services_provider.model.User;
import com.services_provider.util.ApplicationContext;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        User user = new User("aa", "aa", "aa", "yyOs1#222", LocalDate.of(2000, 2, 2));
        System.out.println(ApplicationContext.getUserService().save(user));
    }
}