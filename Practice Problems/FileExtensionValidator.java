import java.util.Scanner;

public class FileExtensionValidator {

    String validateFileExtension(String filename) {

        int dotIndex = filename.lastIndexOf('.');

        if (dotIndex == -1) {
            return "Rejected — invalid file type";
        }

        String extension = filename.substring(dotIndex + 1).toLowerCase();

        if (extension.equals("pdf")
                || extension.equals("docx")
                || extension.equals("zip")) {
            return "Accepted";
        }

        return "Rejected — invalid file type";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter filename: ");
        String filename = sc.nextLine();

        FileExtensionValidator obj = new FileExtensionValidator();

        System.out.println(obj.validateFileExtension(filename));

        sc.close();
    }
}