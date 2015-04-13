package cst1201;

import java.util.Random;
import java.util.Scanner;

public class RandomGenerator {

    public static void main(String[] args) {
        
        int max = 0, min = 0, count, sum = 0;
        double average = 0;
        //TODO: Create a Scanner object to read keyboard input.
        Scanner keyboard = new Scanner(System.in);

        //TODO: Ask the user a lower and upper bound.
        System.out.println("Input a lower bound: ");
        int lower = keyboard.nextInt();

        System.out.println("Input a upper bound: ");
        int upper = keyboard.nextInt();

        //TODO: Ask the user for the number of random integers to generate.
        System.out.println("Enter the number of random integers to generate ");
        count = keyboard.nextInt();

        //TODO: Generate random integers of the desired length and bound.
        Random r = new Random();
        System.out.println();

        for (int j = 0; j < count; j++) {
            int num = r.nextInt(upper - lower) + 1 + lower;

            max = num >= max ? num : max;
            min = num <= min || min == 0 ? num : min;
            sum += num;
            System.out.println(num);
        }
        average = sum / count;

        //TODO: Print the average, max, min, count, and sum of the integers.
        System.out.println("This is average: " + average);
        System.out.println("This is max: " + max);
        System.out.println("This is min: " + min);
        System.out.println("This is count: " + count);
        System.out.println("This is sum: " + sum);
    }
}
