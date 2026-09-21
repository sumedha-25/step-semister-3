class FeeAccount {
}

class HostelFeeAccount extends FeeAccount {
}

public class AccountBatchPayments {

    int hostelCount = 0;
    int dayScholarCount = 0;

    void processPayment(FeeAccount account, double amount) {

        if (account instanceof HostelFeeAccount) {
            System.out.println(
                "Paid in two installments (hostel account)"
            );
            hostelCount++;
        } else {
            System.out.println(
                "Paid in one go (day-scholar account)"
            );
            dayScholarCount++;
        }
    }

    public static void main(String[] args) {

        FeeAccount[] accounts = {
            new HostelFeeAccount(),
            new HostelFeeAccount(),
            new FeeAccount(),
            new FeeAccount()
        };

        AccountBatchPayments processor =
            new AccountBatchPayments();

        for (FeeAccount account : accounts) {
            processor.processPayment(account, 60000);
        }

        System.out.println("Hostel accounts: "
                + processor.hostelCount);

        System.out.println("Day-scholar accounts: "
                + processor.dayScholarCount);
    }
}
