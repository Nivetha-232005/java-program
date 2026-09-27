package PayrollProcessingSystem;

abstract class Employee {
  private final int  employeeId;
  private final String employeeName;
  private final double basicSalary;

    public Employee(String employeeName, double basicSalary, int employeeId) {
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }
   void displayEmployeeDetails(){
       System.out.println("=======Employee details==========");
       System.out.println("Employee Id   :"+getEmployeeId());
       System.out.println("Employee Name :"+getEmployeeName());
       System.out.println("Basice Salary :"+getBasicSalary());

   }
     abstract double calculateGrossSalary();

    abstract double calculateDeduction();

   abstract double calculateNetSalary();

}
class  PermanentEmployee extends Employee{
   private int houseAllowance;
   private int transportAllowance;
   private double  grossSalary;
   private double deduction;
   private double netSalary;

    public PermanentEmployee(String employeeName, int basicSalary, int employeeId, int houseAllowance, int transportAllowance) {
        super(employeeName, basicSalary, employeeId);
        this.houseAllowance = houseAllowance;
        this.transportAllowance = transportAllowance;
    }

    public int getHouseAllowance() {
        return houseAllowance;
    }

    public int getTransportAllowance() {
        return transportAllowance;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public double getDeduction() {
        return deduction;
    }

    public double getNetSalary() {
        return netSalary;
    }

    @Override
    double calculateGrossSalary() {
        grossSalary = getBasicSalary() + getHouseAllowance() + getTransportAllowance();
        return grossSalary;
    }

    @Override
    double calculateDeduction() {
           deduction = calculateGrossSalary()* 0.10;
        return deduction;
    }

    @Override
    double calculateNetSalary() {
        netSalary = calculateGrossSalary()- calculateDeduction();
        return netSalary;
    }
}
class  ContractEmployee extends Employee{
    int contractBonus;
    double  grossSalary;
    double deduction;
    double netSalary;

    public ContractEmployee(String employeeName, double basicSalary, int employeeId, int contractBonus) {
        super(employeeName, basicSalary, employeeId);
        this.contractBonus = contractBonus;

    }

    @Override
    double calculateGrossSalary() {
        grossSalary = getBasicSalary() +  contractBonus;
        return grossSalary;
    }

    @Override
    double calculateDeduction() {
        deduction = calculateGrossSalary() * 0.05;

        return deduction;
    }

    @Override
    double calculateNetSalary() {
        netSalary = calculateGrossSalary()- calculateDeduction();

        return netSalary;
    }

}
class Manager extends PermanentEmployee {

    private final int performanceBonus;
    double  grossSalary;
    double deduction;
    double netSalary;

    public Manager(String employeeName, int basicSalary, int employeeId,
                   int houseAllowance, int transportAllowance,
                   int performanceBonus) {

        super(employeeName, basicSalary, employeeId,
                houseAllowance, transportAllowance);

        this.performanceBonus = performanceBonus;
    }

    public int getPerformanceBonus() {
        return performanceBonus;
    }

    @Override
    double calculateGrossSalary() {
        grossSalary = getBasicSalary()
                + getHouseAllowance()
                + getTransportAllowance()
                + getPerformanceBonus();

        return grossSalary;
    }

    @Override
    double calculateDeduction() {
        deduction = calculateGrossSalary() * 0.10;
        return deduction;
    }

    @Override
    double calculateNetSalary() {
        netSalary = calculateGrossSalary() - calculateDeduction();
        return netSalary;
    }
}