package Strings;

/**
 * Created by RaedMassoud on 2/15/2024
 *
 * @author: RaedMassoud
 * @date: 2/15/2024
 * @project: Murex Practice
 */
public class FunnyString {


    public String myfunny(String s){

        int n = s.length();

        char[] string = s.toCharArray();
        char[] revString = new char[n];

        int[] nums = new int[n];
        int[] revNums = new int[n];

        for(int i = 0; i < s.length(); i++) {
            revString[i] = string[n - i - 1];

            nums[i] = (int) string[i];
            revNums[i] = (int) revString[i];
        }

        int[] result = new int[n - 1];
        int[] resultTwo = new int[n - 1];


        for(int i = 0; i < n - 1; i++) {
            if(Math.abs(nums[i] - nums[i + 1]) != Math.abs(revNums[i] - revNums[i+1]))
                return "not funny";
        }


        return "funny";
    }
}
