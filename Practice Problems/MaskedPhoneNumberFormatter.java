import java.util.Scanner;

public class MaskedPhoneNumberFormatter {

    String maskPhoneNumber(String phone) {

        if (phone.length() != 10) {
            return "Invalid phone number";
        }

        StringBuilder result = new StringBuilder();

        result.append("XXXXXX-");
        result.append(phone.substring(6));

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        MaskedPhoneNumberFormatter obj =
                new MaskedPhoneNumberFormatter();

        System.out.println(obj.maskPhoneNumber(phone));

        sc.close();
    }
}
