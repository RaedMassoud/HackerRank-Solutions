package Strings;
import java.util.Stack;

/**
 * Created by RaedMassoud on 2/16/2024
 *
 * @author: RaedMassoud
 * @date: 2/16/2024
 * @project: Murex Practice
 */
public class SuperReducedString {

    public String superReducedString(String s) {

        // Init
        Stack<Character> result = new Stack<>();
        char current;

        // main logic
        for(int i = 0; i < s.length(); i++) {
            current = s.charAt(i);

            if(result.isEmpty())
                result.push(current);
            else if(result.peek() == current)
                result.pop();
            else
                result.push(current);

        }
        StringBuilder builder = new StringBuilder();

        for(Character c : result)
            builder.append(c);

        return builder.length() > 0 ? builder.toString() : "Empty String";
    }
}

