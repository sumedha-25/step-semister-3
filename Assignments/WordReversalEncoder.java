import java.util.Scanner;

public class WordReversalEncoder {

    String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversed = new StringBuilder(word);
            reversed.reverse();

            result.append(reversed).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        WordReversalEncoder obj = new WordReversalEncoder();
        System.out.println(obj.reverseEachWord(sentence));

        sc.close();
    }
}
