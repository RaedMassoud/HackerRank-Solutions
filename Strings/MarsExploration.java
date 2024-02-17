package Strings;

/**
 * Created by RaedMassoud on 2/17/2024
 *
 * @author: RaedMassoud
 * @date: 2/17/2024
 * @project: HackerRank-Solutions
 */
public class MarsExploration {

    // Checks how many letters have been changed
    // consider n = "SOS"
    // A perfect string s is a represented as n + n + n ...
    public static int marsExploration(String s) {

        String message = "SOS";

        int errors = 0;
        int x = 0;

        for(int i = 0; i < s.length(); i++) {

            errors += s.charAt(i) == message.charAt(x) ? 0 : 1;

            x = x == 2 ? 0 : x+1;
        }

        return errors;

    }

}
