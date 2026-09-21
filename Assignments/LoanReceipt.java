public class LoanReceipt {

    private final String memberId;
    private final String[] bookIds;

    public LoanReceipt(String memberId, String[] bookIds) {
        this.memberId = memberId;
        this.bookIds = bookIds.clone();
    }

    public String[] getBookIds() {
        return bookIds.clone();
    }

    public LoanReceipt withCorrectedBookId(
            int index, String newId) {

        String[] corrected = bookIds.clone();

        if (index >= 0 && index < corrected.length) {
            corrected[index] = newId;
        }

        return new LoanReceipt(memberId, corrected);
    }

    public static class ReferenceOnlyLoanReceipt
            extends LoanReceipt {

        private final String roomNumber;

        public ReferenceOnlyLoanReceipt(
                String memberId,
                String[] bookIds,
                String roomNumber) {

            super(memberId, bookIds);
            this.roomNumber = roomNumber;
        }

        public String getRoomNumber() {
            return roomNumber;
        }
    }

    public static String processNightlyCirculation(
            LoanReceipt[] receipts) {

        int processed = 0;
        int nullSkipped = 0;
        int referenceOnly = 0;
        int regular = 0;

        for (LoanReceipt receipt : receipts) {

            if (receipt == null) {
                nullSkipped++;
                continue;
            }

            processed++;

            if (receipt instanceof ReferenceOnlyLoanReceipt) {
                referenceOnly++;
            } else {
                regular++;
            }
        }

        return processed + " processed | "
                + nullSkipped + " null skipped | "
                + referenceOnly + " reference-only | "
                + regular + " regular";
    }

    public static void main(String[] args) {

        String[] books = {"BK-100", "BK-101"};

        LoanReceipt original =
            new LoanReceipt("M-101", books);

        String[] returnedBooks = original.getBookIds();
        returnedBooks[0] = "CHANGED";

        System.out.println(original.getBookIds()[0]);

        LoanReceipt corrected =
            original.withCorrectedBookId(1, "BK-102");

        System.out.println(
            original.getBookIds()[0] + ","
            + original.getBookIds()[1]
        );

        System.out.println(
            corrected.getBookIds()[0] + ","
            + corrected.getBookIds()[1]
        );

        LoanReceipt[] receipts = {
            original,
            corrected,
            new ReferenceOnlyLoanReceipt(
                "M-102",
                new String[]{"BK-200"},
                "R-10"
            ),
            null
        };

        System.out.println(
            processNightlyCirculation(receipts)
        );
    }
}