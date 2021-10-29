package interview_questions1;

public class PrintIntegersWithoutInteger {

  //  Create a method to print integers from 0 to 100 without using any integer

    public static void main(String[] args) {

        intWithoutInt();

    }

    public static void intWithoutInt() {

        Character c1 = 'e' - 'e';  // 0    ascii value of 'e' is 101
        Character c2 = 'e';        // 101

        for (Character i = c1; i < c2; i++) {
            System.out.println((int)i);
        }

    }


}
