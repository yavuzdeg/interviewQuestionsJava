package interview_questions1;

import java.util.ArrayList;
import java.util.List;

public class NonRepeatedElements {

    /*
    Create a method to return just non-repeated element or elements
	  	[3, 2, 5, 5, 1, 3, 1] ==> [2]
	  	[3, 2, 5, 5, 7, 3, 1] ==> [2, 7, 1]
     */

    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>();
        numbers.add(9);
        numbers.add(2);
        numbers.add(5);
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        numbers.add(1);

        System.out.println(getElements(numbers));
    }

    public static List<Integer> getElements(List<Integer> numbers) {

        List<Integer> numbers2 = new ArrayList<>();
        List<Integer> numbers3 = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.indexOf(numbers.get(i)) == numbers.lastIndexOf(numbers.get(i))) {
                numbers2.add(numbers.get(i));

            }else {
                numbers3.add(numbers.get(i));
            }
        }

        return numbers2;


    }


}
