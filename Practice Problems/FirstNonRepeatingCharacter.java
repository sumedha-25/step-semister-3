import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    char findFirstNonRepeatingChar(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        FirstNonRepeatingCharacter obj =
                new FirstNonRepeatingCharacter();

        char result = obj.findFirstNonRepeatingChar(text);

        if (result == '\0') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("First Non-Repeating Character: " + result);
        }

        sc.close();
    }
}