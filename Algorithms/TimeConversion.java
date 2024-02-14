package Algorithms;

/**
 * Created by RaedMassoud on 2/14/2024
 *
 * @author: RaedMassoud
 * @date: 2/14/2024
 * @project: HackerRank-Solutions
 */
public class TimeConversion {

    // Method to convert time for 12-hour format to military format
    private String timeConversion(String time) {

        // If String ends with PM
        if(time.substring(8).equals("PM")) {

            // Get hours
            int hour = Integer.parseInt(time.substring(0, 2));

            // Convert to military
            if(hour != 12)
                hour += 12;

            // Return converted hours, minutes, and seconds
            return String.valueOf(hour).concat(time.substring(2, 8));

        }

        // In case of AM
        if(time.substring(0, 2).equals("12"))
            return String.format("00").concat(time.substring(2, 8));
        else
            return time.substring(0, 8);


    }
}
