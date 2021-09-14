package interview_questions1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciNumbers {

    // print fibonacci numbers and the number of this will be the number written by the user


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many fibonacci numbers you want to see:");
        int number = scan.nextInt();

        List<Integer> fibonacciNumbers = new ArrayList<>();
        if(number <= 0) {
            System.out.println("Enter a positive number!");
        }else if (number == 1) {
            fibonacciNumbers.add(1);
        }else if (number == 2) {
            fibonacciNumbers.add(1);
            fibonacciNumbers.add(1);
        }else if (number == 3){
            fibonacciNumbers.add(1);
            fibonacciNumbers.add(1);
            fibonacciNumbers.add(2);
        }else {
            int a = 1;
            int b = 1;
            fibonacciNumbers.add(1);
            fibonacciNumbers.add(1);
            for (int i = 2; i < number; ) {
                a = a + b;
                fibonacciNumbers.add(a);
                i++;
                b = a + b;
                fibonacciNumbers.add(b);
                i++;
            }

        }


        for (int i = 0; i < fibonacciNumbers.size(); i++) {
            System.out.print(fibonacciNumbers.get(i) + " ");
        }

        scan.close();
    }


}
