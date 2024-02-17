package Strings;

/**
 * Created by RaedMassoud on 2/17/2024
 *
 * @author: RaedMassoud
 * @date: 2/17/2024
 * @project: HackerRank-Solutions
 */
public class CaeserCipher {

    // Encrypts letters by shifting k amount
    public String caesarCipher(String s, int k) {

        if(k == 0) // no shift return original
            return s;


        StringBuilder result = new StringBuilder();

        char current; // traverse the string
        for(int i = 0; i < s.length(); i++) {

            current = s.charAt(i);

            // if current letter is alphabetic
            if(Character.isAlphabetic(current)) {
                int num = current;

                // if lower case
                if(Character.isLowerCase(num)) {
                    num = 'a' + (num - 'a' + k) % 26;

                    // if upper case
                } else {
                    num = 'A' + (num - 'A' + k) % 26;
                }

                // add encrypted letter to result
                current = (char) num;
                result.append(current);

            } else // add original to result (Not alphabetic)
                result.append(current);

        }
        // return result
        return result.toString();
    }
}
