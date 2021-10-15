package interview_questions1;


import java.util.*;

public class result {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        List<Integer> divisors = new ArrayList<>();


        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
               divisors.add(i);
            }
        }


    }
}