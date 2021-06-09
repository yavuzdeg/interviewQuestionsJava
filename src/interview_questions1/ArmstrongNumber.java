package interview_questions1;

/*
A number is called an Armstrong Number is it equals to the sum of the cube of its every digit.
For example; 153 is an Armstrong Number.
Because ==>  (1*1*1)+(5*5*5)+(3*3*3) = 153
You need to write a program to check if the given number is Armstrong number or not.
*/

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an armstrong number: ");
        int number = scan.nextInt();
        if (armstrongNumber(number) == number){
            System.out.println(number + " is an armstrong number.");
        }else{
            System.out.println(number + " is NOT an armstrong number.");
        }
    }

    public static int armstrongNumber (int number){

        int armstrongValue = 0;
        int digit = 0;
        while (number > 0) {
            digit = number % 10;
            armstrongValue += digit*digit*digit;
            number = number / 10;
        }
        return armstrongValue;

    }

}
