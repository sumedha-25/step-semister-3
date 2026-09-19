import java.util.Scanner;

public class TypingSpeedTestAccuracyChecker {

    void checkTypingAccuracy(String original, String typed) {
        int matches = 0;
        int firstMismatch = -1;

        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matches++;
            } else if (firstMismatch == -1) {
                firstMismatch = i;
            }
        }

        double accuracy = (matches * 100.0) / original.length();

        System.out.println("Matching Characters: " + matches);
        System.out.println("Accuracy: " + accuracy + "%");

        if (firstMismatch == -1) {
            System.out.println("No Mismatch Found");
        } else {
            System.out.println("First Mismatch Position: " + firstMismatch);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter original text: ");
        String original = sc.nextLine();

        System.out.print("Enter typed text: ");
        String typed = sc.nextLine();

        if (original.length() != typed.length()) {
            System.out.println("Both strings must have equal length.");
        } else {
            TypingSpeedTestAccuracyChecker obj =
                    new TypingSpeedTestAccuracyChecker();

            obj.checkTypingAccuracy(original, typed);
        }

        sc.close();
    }
}
