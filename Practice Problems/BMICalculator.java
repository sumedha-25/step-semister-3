import java.util.Scanner;

public class BMICalculator {

    String getBmiStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    void printWellnessReport(double[] heights, double[] weights) {
        for (int i = 0; i < heights.length; i++) {
            double bmi = weights[i] / (heights[i] * heights[i]);

            System.out.println("Person " + (i + 1));
            System.out.printf("BMI: %.2f%n", bmi);
            System.out.println("Status: " + getBmiStatus(bmi));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();

        double[] heights = new double[n];
        double[] weights = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter height in meters for person "
                    + (i + 1) + ": ");
            heights[i] = sc.nextDouble();

            System.out.print("Enter weight in kg for person "
                    + (i + 1) + ": ");
            weights[i] = sc.nextDouble();
        }

        BMICalculator obj = new BMICalculator();
        obj.printWellnessReport(heights, weights);

        sc.close();
    }
}