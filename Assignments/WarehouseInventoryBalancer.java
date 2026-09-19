import java.util.Scanner;

public class WarehouseInventoryBalancer {

    void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0;
        int totalB = 0;

        int highestValue = sectionA[0];
        int highestSection = 1;
        int highestIndex = 0;

        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];
            totalB += sectionB[i];

            if (sectionA[i] > highestValue) {
                highestValue = sectionA[i];
                highestSection = 1;
                highestIndex = i;
            }

            if (sectionB[i] > highestValue) {
                highestValue = sectionB[i];
                highestSection = 2;
                highestIndex = i;
            }
        }

        System.out.println("Total of Section A: " + totalA);
        System.out.println("Total of Section B: " + totalB);

        if (totalA == totalB) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }

        System.out.println("Highest Value: " + highestValue);
        System.out.println("Section: " + highestSection);
        System.out.println("Index: " + highestIndex);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of sections: ");
        int n = sc.nextInt();

        int[] sectionA = new int[n];
        int[] sectionB = new int[n];

        System.out.println("Enter values for Section A:");
        for (int i = 0; i < n; i++) {
            sectionA[i] = sc.nextInt();
        }

        System.out.println("Enter values for Section B:");
        for (int i = 0; i < n; i++) {
            sectionB[i] = sc.nextInt();
        }

        WarehouseInventoryBalancer obj =
                new WarehouseInventoryBalancer();

        obj.analyzeInventory(sectionA, sectionB);

        sc.close();
    }
}