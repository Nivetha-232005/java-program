interface Work {

    void doWork();
}

class Employee {

    // Access modifiers
    private int salary = 50000;
    int employeeId = 101;                 // default
    protected String department = "IT";
    public String name = "Arun";

    // final variable
    final String companyName = "ABC Company";

    // Parent constructor
    Employee() {
        System.out.println("Employee Constructor");
    }

    // Parent method
    void displayEmployee() {

        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : " + salary);
        System.out.println("Company     : " + companyName);
    }

    // final method
    final void companyPolicy() {

        System.out.println("Working Hours: 9 AM to 6 PM");
    }
}

// Inheritance using extends
// Interface using implements
class Manager extends Employee implements Work {

    String name = "Manager Arun";

    Manager() {

        // Calls parent constructor
        super();

        System.out.println("Manager Constructor");
    }

    void displayManager() {

        // Child variable
        System.out.println("Child Name  : " + name);

        // Parent variable
        System.out.println("Parent Name : " + super.name);

        // Calling parent method
        super.displayEmployee();
    }

    // Implementing interface method
    public void doWork() {

        System.out.println("Manager is managing the team");
    }

    // Cannot override final method
    // void companyPolicy() { }
}

public class ExampleProgram{

    public static void main(String[] args) {

        Manager manager = new Manager();

        System.out.println("\n===== EMPLOYEE DETAILS =====");

        manager.displayManager();

        System.out.println("\n===== COMPANY POLICY =====");

        manager.companyPolicy();

        System.out.println("\n===== WORK =====");

        manager.doWork();
    }
}
