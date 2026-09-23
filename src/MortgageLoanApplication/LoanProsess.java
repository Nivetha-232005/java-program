package MortgageLoanApplication;

class LoanProcess {


        EmploymentDetails employmentDetails;
        MortgageLone mortgageLone;
        CreditReport creditReport;

        LoanProcess(EmploymentDetails employmentDetails,
                      MortgageLone mortgageLone,
                      CreditReport creditReport) {

            this.employmentDetails = employmentDetails;
            this.mortgageLone = mortgageLone;
            this.creditReport = creditReport;
        }

        void processLoan() {

            double monthlyIncome = employmentDetails.getMonthlyIncome();

            if (monthlyIncome > 40000 && creditReport.getCreditScore() >= 700) {

                mortgageLone.setLoanStatus("Approved");

                System.out.println();
                System.out.println("========== LOAN PROCESS ==========");
                System.out.println("Income Check   : PASSED");
                System.out.println("Credit Check   : PASSED");
                System.out.println("Loan Status    : " + mortgageLone.getLoanStatus());

            } else {

                mortgageLone.setLoanStatus("Not Approved");

                System.out.println();
                System.out.println("========== LOAN PROCESS ==========");
                System.out.println("Income Check   : " +
                        (monthlyIncome > 40000 ? "PASSED" : "FAILED"));

                System.out.println("Credit Check   : " +
                        (creditReport.getCreditScore() >= 700 ? "PASSED" : "FAILED"));

                System.out.println("Loan Status    : " + mortgageLone.getLoanStatus());
            }
        }
    }

