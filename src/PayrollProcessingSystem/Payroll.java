package PayrollProcessingSystem;

public class Payroll {
     double grossSalary;
    double deduction;
    double netSalary;

    private Employee employee;

    public Payroll(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }
     void processPayroll() {

         grossSalary = getEmployee().calculateGrossSalary();
        deduction = getEmployee().calculateDeduction();
         netSalary = getEmployee().calculateNetSalary();

    }
     void generatePayslip(){
        employee.displayEmployeeDetails();
         System.out.println("grossSalary:"+grossSalary);
         System.out.println(" deduction:"+deduction);
         System.out.println("netSalary:"+netSalary);

     }
}
