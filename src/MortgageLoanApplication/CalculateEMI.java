package MortgageLoanApplication;

class CalculateEMI implements Eligible {

    EmploymentDetails employmentDetails;
    MortgageLone mortgageLone;

    CalculateEMI(EmploymentDetails employment, MortgageLone mortgageLone) {
        this.employmentDetails = employment;
        this.mortgageLone = mortgageLone;
    }
    public void eligibilityCheck() {
        System.out.println("Checking mortgage loan eligibility...");
    }

    void displayCalculateEmi() {

        double monthlyIncome = employmentDetails.getMonthlyIncome();

        if (monthlyIncome > 40000) {

            mortgageLone.setLoanStatus("Eligible");

            System.out.printf("Monthly Income : ₹%,.2f%n", monthlyIncome);
            System.out.println("Income Check   : PASSED");
            System.out.println("Loan Status    : " + mortgageLone.getLoanStatus());

            double interestRate = mortgageLone.getInterestRate();
            int loanTerm = mortgageLone.getLoanTerm();
            double loanAmount = mortgageLone.getLoanAmount();

            double monthlyRate = interestRate / 12 / 100;
            int months = loanTerm * 12;

            double monthlyEMI = (loanAmount * monthlyRate *
                    Math.pow(1 + monthlyRate, months))
                    / (Math.pow(1 + monthlyRate, months) - 1);

            System.out.printf("Loan Amount    : ₹%,.2f%n", loanAmount);
            System.out.printf("Interest Rate  : %.2f%%%n", interestRate);
            System.out.println("Loan Term      : " + loanTerm + " years");
            System.out.printf("Monthly EMI    : ₹%,.2f%n", monthlyEMI);

        } else {

            mortgageLone.setLoanStatus("Not Eligible");

            System.out.println("Monthly Income : ₹.2f%n" + monthlyIncome);
            System.out.println("Income Check   : FAILED");
            System.out.println("Loan Status    : " + mortgageLone.getLoanStatus());

            System.out.println("EMI Calculation: Not Required");
        }
    }
}