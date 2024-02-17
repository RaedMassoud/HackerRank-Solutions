package Strings;

/**
 * Created by RaedMassoud on 2/17/2024
 *
 * @author: RaedMassoud
 * @date: 2/17/2024
 * @project: HackerRank-Solutions
 */
public class HackerrankString {

    // Check if the word "hackerrank" is found is a string
    // return yes || no
    public static String hackerrankInString(String s) {

        String HR = "hackerrank";

        StringBuilder result = new StringBuilder();

        char current;
        for(int i = 0, j = 0; i < s.length(); i++) {

            current = s.charAt(i);

            if(current == HR.charAt(j)) {
                result.append(current);
                j++;
            }

            if(result.toString().equals("hackerrank"))
                return "YES";

        }

        return "NO";

    }

}
