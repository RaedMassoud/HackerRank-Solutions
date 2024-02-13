package Algorithms;

/**
Created by RaedMassoud on 2/13/2024
@author: RaedMassoud
@date: 2/13/2024
@project: HackerRank-Solutions
*/

public class Staircase {

    // This method takes a size and
    // prints a staircase shape
    private void print(int size) {

        for(int i = 0; i < size; i++) {
            for(int j = 1; j <= size; j++) {
                System.out.print(i < size - j? " " : "#");
            }
            System.out.println();
        }

    }


}
