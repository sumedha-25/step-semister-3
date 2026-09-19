import java.util.Scanner;

public class MovieReviewWordLengthProfiler {

    void classifyWordLengths(String review) {
        String[] words = review.split("\\s+");

        int shortWords = 0;
        int mediumWords = 0;
        int longWords = 0;

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "");

            if (word.length() >= 1 && word.length() <= 4) {
                shortWords++;
            } else if (word.length() <= 8) {
                mediumWords++;
            } else {
                longWords++;
            }
        }

        System.out.println("Short Words: " + shortWords);
        System.out.println("Medium Words: " + mediumWords);
        System.out.println("Long Words: " + longWords);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter movie review: ");
        String review = sc.nextLine();

        MovieReviewWordLengthProfiler obj =
                new MovieReviewWordLengthProfiler();

        obj.classifyWordLengths(review);

        sc.close();
    }
}
