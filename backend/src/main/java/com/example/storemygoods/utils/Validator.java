package com.example.storemygoods.utils;

import java.util.regex.Pattern;

public class Validator {

    private static final String passwordPattern= "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@$!%*?&])([a-zA-Z0-9@$!%*?&]{8,})$";
public static  boolean validatePassword(String password){
    return Pattern.matches(passwordPattern,password);
}
}
