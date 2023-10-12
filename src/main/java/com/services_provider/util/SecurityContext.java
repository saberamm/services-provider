package com.services_provider.util;

public class SecurityContext {
    public static Long id;
    public static String firstname;
    public static String lastname;
    public static String username;
    public static String email;

    public static void clear() {
        id = null;
        firstname = null;
        lastname = null;
        username = null;
        email = null;
    }
}
