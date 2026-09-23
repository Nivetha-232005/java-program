package MortgageLoanApplication;

public class CreditReport {

    private int creditScore;
    private String creditStatus;
    private String creditVerified;

    public CreditReport(int creditScore, String creditStatus,String creditVerified) {
        this.creditScore = creditScore;
        this.creditStatus = creditStatus;
        this.creditVerified = creditVerified;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public String getCreditStatus() {
        return creditStatus;
    }

    public String CreditVerified() {
        return creditVerified;
    }

    public void displayCreditReport() {

        System.out.println("==========Credit Report==========");
        System.out.println("Credit Score    : " + getCreditScore());

        if (getCreditScore() >= 700) {
            creditStatus = "Good";
        }else {
            creditStatus="Bad";
        }

        System.out.println("Credit Status   : " + getCreditStatus());
        System.out.println("Credit Verified : " + CreditVerified());
    }
}