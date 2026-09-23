package MortgageLoanApplication;
import java.time.LocalDate;

public class Main {

   public static void main(String[] args) {
        CustomerDetails customerDetails=new CustomerDetails("s12","Nivetha","9843267812","nivetha@123gamail.com");
        customerDetails.displayCustomerDetails();
        EmploymentDetails employmentDetails=new EmploymentDetails("tcs","Software Engineer",500000.00,2,"Full-time");
        employmentDetails.displayEmployeeDetails();
        CreditReport creditReport=new CreditReport(780," ","Verified");
        creditReport.displayCreditReport();
       LoanApplication loanApplication = new MortgageLone(121, LocalDate.now(), 7.5, 20, 100000.00, " ",400000.0,"Home Loan",employmentDetails);
       MortgageLone mortgageLone =new MortgageLone(121, LocalDate.now(), 7.5, 20, 100000.00, " ",400000.0,"Home Loan",employmentDetails);
       loanApplication.application();
       CalculateEMI calculateEMI=new CalculateEMI(employmentDetails,mortgageLone);
       calculateEMI. eligibilityCheck();
       calculateEMI.displayCalculateEmi();
       LoanProcess loanProcess = new LoanProcess(employmentDetails, mortgageLone, creditReport);
       loanProcess.processLoan();


    }
}
