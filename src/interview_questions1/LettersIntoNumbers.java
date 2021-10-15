package interview_questions1;

public class LettersIntoNumbers {

    /*
 	Create a method like;
 	"aabbbbaaad" ==> a2b4a3d1
*/



    public static void main(String[] args) {

        getWord("aabbbbaaahddc");
    }
    public static void getWord (String word) {


        String newWord = "";
        int count = 1;

        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                count++;
                continue;
            }else {
                newWord = newWord + word.charAt(i) + count;
                count = 1;
            }

        }
        if (word.charAt(word.length() -1) == word.charAt(word.length() -2) ) {
            newWord = newWord + word.charAt(word.length() -2) + count;
        }else {
            newWord = newWord + word.charAt(word.length() -1) + count;
        }


        System.out.println(newWord);

    }

}
