package interview_questions1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuestion {

    // write a program which takes the number of elements, and the integer elements from the user,
    // then find the difference between max and min element.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of the elements of the integer array");
        int arrayLength = scan.nextInt();

        int[] intArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {

            System.out.println("Enter an integer element");
            int element = scan.nextInt();
            intArray[i] = element;

        }
        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println(intArray[arrayLength-1] - intArray[0]);

        scan.close();
    }
}
