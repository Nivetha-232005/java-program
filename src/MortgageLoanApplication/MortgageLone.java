package MortgageLoanApplication;

import java.time.LocalDate;

public class MortgageLone extends LoanApplication {


        private double interestRate;
        private int loanTerm;
        private double downPayment;
        private String loanStatus;
        private double loanAmount;
        private String loanPurpose;



        // HAS-A relationship
        private EmploymentDetails employmentDetails;

    public MortgageLone(int applicationId, LocalDate applicationDate, double interestRate, int loanTerm, double downPayment, String loanStatus, double loanAmount,String loanPurpose, EmploymentDetails employmentDetails) {
        super(applicationId, applicationDate);
        this.interestRate = interestRate;
        this.loanTerm = loanTerm;
        this.downPayment = downPayment;
        this.loanStatus = loanStatus;
        this.loanAmount = loanAmount;
        this.loanPurpose=loanPurpose;
        this.employmentDetails = employmentDetails;
    }

    public String getLoanPurpose() {
        return loanPurpose;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }

    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
    }

    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
    }

    public void setEmploymentDetails(EmploymentDetails employmentDetails) {
        this.employmentDetails = employmentDetails;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public double getInterestRate() {
            return interestRate;
        }

        public int getLoanTerm() {
            return loanTerm;
        }

        public double getDownPayment() {
            return downPayment;
        }

        public String getLoanStatus() {
            return loanStatus;
        }

        public EmploymentDetails getEmploymentDetails() {
            return employmentDetails;
        }

    @Override
    void application() {
        System.out.println("============ Mortgage Loan Application ============");
        System.out.println("Application Id   : " + getApplicationId());
        System.out.println("Application Date : " + getApplicationDate());
        System.out.println("Loan Amount      : ₹" + loanAmount);
        System.out.println("Loan Purpose     :"+getLoanPurpose());
    }


}



