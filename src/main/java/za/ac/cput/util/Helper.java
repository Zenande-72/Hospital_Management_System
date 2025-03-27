package za.ac.cput.util;
import org.apache.commons.validator.routines.EmailValidator;

import java.util.regex.Pattern;
import java.util.UUID;

/*
Helper.java
Helper Class
Author: Ashlyn Jordan January 230577644
Date: 22 March 2025
*/
public class Helper {
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    public static boolean isNullOrEmpty(String s) {
       if(s.isEmpty()||s==null)
           return true;
       return false;
    }



        public static boolean isValidEmail(String email){
        EmailValidator emailValidator = EmailValidator.getInstance();
        if(email == null){
            throw new UnsupportedOperationException("Email cannot be Null!!!");
        }
        return EMAIL_PATTERN.matcher(email).matches();
    }
    public static String generateId() {
        return UUID.randomUUID().toString();
    }

}
