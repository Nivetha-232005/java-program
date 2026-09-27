package PayrollProcessingSystem;

import java.util.List;

public class PayrollReport {
    public void displayReport(List<Employee> employees) {

        System.out.println("========== PAYROLL REPORT ==========");

        for (Employee employee : employees) {

            System.out.println("Employee ID    : " + employee.getEmployeeId());
            System.out.println("Employee Name  : " + employee.getEmployeeName());
            System.out.println("Employee Type  : " + employee.getClass().getSimpleName());
            System.out.println("Gross Salary   : " + employee.calculateGrossSalary());
            System.out.println("Deduction      : " + employee.calculateDeduction());
            System.out.println("Net Salary     : " +employee.calculateNetSalary());
            System.out.println("------------------------------------");
        }
    }
}
