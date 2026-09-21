public class EmployeeStaticDemo {

    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    EmployeeStaticDemo(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees created: " + employeeCount);
    }

    public static void main(String[] args) {

        EmployeeStaticDemo e1 =
                new EmployeeStaticDemo("Ravi", 50000);

        EmployeeStaticDemo e2 =
                new EmployeeStaticDemo("Priya", 60000);

        EmployeeStaticDemo e3 =
                new EmployeeStaticDemo("Arjun", 55000);

        EmployeeStaticDemo.printCompanyInfo();
    }
}