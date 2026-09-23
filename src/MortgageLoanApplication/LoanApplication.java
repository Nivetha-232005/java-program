package MortgageLoanApplication;

import java.time.LocalDate;

abstract class LoanApplication {

    private final int applicationId;
    private final LocalDate applicationDate;



    public LoanApplication(int applicationId, LocalDate applicationDate) {
        this.applicationId = applicationId;
        this.applicationDate = applicationDate;
    }


    public int getApplicationId() {
        return applicationId;
    }

    public LocalDate getApplicationDate() {
        return applicationDate;
    }

    // Abstract method
    abstract void application();

    // Concrete method
    void displayApplicationDate() {
        System.out.println("Application Date : " + getApplicationDate());
    }
}

