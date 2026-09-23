package MortgageLoanApplication;

public class EmploymentDetails {
    private final String companyName;
    private final String jobTitle;
    private final double monthlyIncome;
    private final int yearsOfExperience;
    private final String employmentType;

    public EmploymentDetails(String companyName, String jobTitle, double monthlyIncome, int yearsOfExperience, String employmentType) {
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.monthlyIncome = monthlyIncome;
        this.yearsOfExperience = yearsOfExperience;
        this.employmentType = employmentType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    void displayEmployeeDetails() {
        System.out.println("============Employee Details==========");
        System.out.println("company Name     :" + getCompanyName());
        System.out.println("job Title        :" + getJobTitle());
        System.out.println("monthly Income   :" + getMonthlyIncome());
        System.out.println("yearsOfExperience:" + getYearsOfExperience());

    }

}

