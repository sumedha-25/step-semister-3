public class CollegeStudent {

    static String collegeName;
    static String academicYear;

    String studentName;

    static {
        collegeName = "ABC College";
        academicYear = "2026-27";
        System.out.println("College info loaded");
    }

    CollegeStudent(String studentName) {
        this.studentName = studentName;
    }

    void printStudent() {
        System.out.println(studentName + " | "
                + collegeName + " | " + academicYear);
    }

    public static void main(String[] args) {

        String[] names = {
            "Ravi", "Meera", "Karthik", "Divya", "Anitha"
        };

        for (String name : names) {
            CollegeStudent student = new CollegeStudent(name);
            student.printStudent();
        }
    }
}