package interview_questions1;

// Write a method that checks whether a number given by the user is prime or not

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a prime number");
        int number = scan.nextInt();
        System.out.println(isPrime(number));

    }

    public static boolean isPrime(int number){


        if (number <= 1){
            return false;
        }
        else if (number == 2 || number == 3){
            return true;
        }


        for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }

            }

        return true;
    }
}
