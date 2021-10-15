package interview_questions1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MultiplyMaxTwo {

    // Create a method which return two integers whose multiplication is the maximum

    //    12, 7, 3, 11, 8 ==> 12 and 11

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(-9);
        numbers.add(4);
        numbers.add(3);
        numbers.add(-7);
        numbers.add(-10);

        System.out.println(multiplyMax(numbers));

    }

    public static List<Integer> multiplyMax(List<Integer> numbers) {

        List<Integer> result = new ArrayList<>();

        Collections.sort(numbers);

        try {
            if ((numbers.get(0)*numbers.get(1)) > (numbers.get(numbers.size()-2)*numbers.get(numbers.size()-1))) {
                // we wote this, because if there would be two minus numbers, their multiplication will be positive.

                result.add(numbers.get(0));
                result.add(numbers.get(1));
            }else {
                result.add(numbers.get(numbers.size()-2));
                result.add(numbers.get(numbers.size()-1));
            }
        } catch (IndexOutOfBoundsException e) {

            System.out.println("The list must have at least 2 elements");
        }
        return result;
    }

}


