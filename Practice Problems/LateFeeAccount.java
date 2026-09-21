public class LateFeeAccount {

    String regNo;
    double totalFees;

    LateFeeAccount(String regNo, double totalFees) {
        this.regNo = regNo;
        this.totalFees = totalFees;
    }

    final double calculateLateFee(int daysLate) {
        return totalFees * daysLate / 100.0;
    }

    final void printSummary(int daysLate) {

        if (daysLate <= 0) {
            System.out.println(regNo + " | Skipped - No late fee");
        } else {
            double lateFee = calculateLateFee(daysLate);

            System.out.println(regNo
                    + " | Late Fee: " + lateFee);
        }
    }

    public static void main(String[] args) {

        LateFeeAccount[] accounts = {
            new LateFeeAccount("RA001", 200000),
            new LateFeeAccount("RA002", 150000),
            new LateFeeAccount("RA003", 180000),
            new LateFeeAccount("RA004", 220000)
        };

        int[] daysLate = {10, 0, -2, 5};

        for (int i = 0; i < accounts.length; i++) {
            accounts[i].printSummary(daysLate[i]);
        }
    }
}
