package PayrollProcessingSystem;


import java.util.ArrayList;
import java.util.List;

public class Main {
           public static void main(String[] args) {
               List<Employee> employees = new ArrayList<>();
               Employee employee = new PermanentEmployee("Arun", 3000, 101, 500, 200);
               Employee employee1 = new ContractEmployee("Priya", 3000, 102, 400);
               PermanentEmployee permanentEmployee = new Manager("Dharshini", 5000, 103, 800, 300, 1000);
               Payroll payroll = new Payroll(employee);
               payroll.processPayroll();
               payroll.generatePayslip();
               Payroll payroll1 = new Payroll(employee1);
               payroll1.processPayroll();
               payroll1.generatePayslip();
               Payroll payroll2= new Payroll(permanentEmployee);
               payroll2.processPayroll();
               payroll2.generatePayslip();

                   employees.add(employee);
                   employees.add(employee1);
                   employees.add(permanentEmployee);

                   PayrollService payrollService = new PayrollService();
                   payrollService.processPayroll(employees);

                   PayrollReport payrollReport = new PayrollReport();
                   payrollReport.displayReport(employees);
               }
           }


