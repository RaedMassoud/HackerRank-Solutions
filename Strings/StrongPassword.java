package Strings;

/**
 * Created by RaedMassoud on 2/15/2024
 *
 * @author: RaedMassoud
 * @date: 2/15/2024
 * @project: Murex Practice
 */
public class StrongPassword {

    // Checks if a password is strong
    private int minNumber(int n, String password) {

        // Initialize needed vars and arrays
        char[] pass = password.toCharArray();
        int count=0;
        boolean low = false, upper = false, digit = false, special = false;

        // for each character in the password
        for(char c : pass) {

            // if a digit is found set digit boolean to true
            if(Character.isDigit(c))
                digit = true;

            // if a lowercase is found set lowercase boolean to true
            if(Character.isLowerCase(c))
                low = true;

            // if an uppercase is found set uppercase boolean to true
            if(Character.isUpperCase(c))
                upper = true;

            // if a special char is found set special boolean to true
            if(isSpecial(c))
                special = true;
        }

        // for each missing requirement increment count
        count += low? 0 : 1;
        count += upper? 0 : 1;
        count += digit? 0 : 1;
        count += special? 0 : 1;

        /* return the higher value between count and the
        difference between required length and actual length */
        return Math.max(count, 6 - n);
    }

    // Checks for a special character by traversing a set of special chars
    // and checking if current character matches any of them
    public static boolean isSpecial(char c) {

        String SPECIAL_CHARACTERS = "!@#$%^&*()-+";
        char[] specialChars = SPECIAL_CHARACTERS.toCharArray();

        for(char s : specialChars)
            if(c == s)
                return true;

        return false;
    }


}
