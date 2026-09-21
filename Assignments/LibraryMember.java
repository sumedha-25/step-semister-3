public class LibraryMember {

    private String membershipId;
    private String name;
    private boolean premiumMember;
    private String securityAnswer;

    public LibraryMember() {
    }

    public String getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(String id) {
        if (membershipId == null) {
            membershipId = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPremiumMember() {
        return premiumMember;
    }

    public void setPremiumMember(boolean premium) {
        premiumMember = premium;
    }

    public void setSecurityAnswer(String answer) {
        if (answer != null) {
            securityAnswer = Integer.toHexString(
                answer.hashCode()
            );
        }
    }

    public static void main(String[] args) {

        LibraryMember member = new LibraryMember();

        member.setMembershipId("LIB-100");
        member.setMembershipId("FAKE-999");

        member.setName("Rahul");
        member.setPremiumMember(true);
        member.setSecurityAnswer("blue");

        System.out.println(member.getMembershipId());
        System.out.println(member.getName());
        System.out.println(member.isPremiumMember());
    }
}