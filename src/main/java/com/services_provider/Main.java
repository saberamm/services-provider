package com.services_provider;

import com.services_provider.model.User;
import com.services_provider.util.ApplicationContext;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        User user = new User("aa", "aa", "aa", "yyOs1#222", LocalDate.of(2000, 2, 2), "sss@sss.com");
        ApplicationContext.getUserService().save(user);
        /*LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd' 'HH:mm");
        String formattedDateTime = now.format(formatter);
        System.out.println(formattedDateTime);*/
    }
}