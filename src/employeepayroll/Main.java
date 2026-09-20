package employeepayroll;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee1 = new Developer();
        Employee employee2 = new SeniorDeveloper();
        Employee employee3 = new TeamLead();
        System.out.print("Enter ID: ");
        employee1.setId(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter Name: ");
        employee1.setName(sc.nextLine());
        System.out.print("Enter Role: ");
        String role = sc.nextLine();
        if (role.equalsIgnoreCase("developer")) {
            System.out.print("Enter BasicSalary: ");
            employee1.setBasicsalary(sc.nextInt());
            sc.nextLine();
            System.out.println("Employee ID: " + employee1.getId());
            System.out.println("Employee Name: " + employee1.getName());
            System.out.println("Employee Role: Developer");
            System.out.println("BasicSalary:" + employee1.getBasicSalary());
            employee1.salaryCalculator();

        } else if (role.equalsIgnoreCase("Senior Developer")) {
            System.out.println("Employee ID  : " + employee2.getId());
            System.out.println("Employee Name: " + employee2.getName());
            System.out.println("Employee Role: SeniorDeveloper");
            System.out.println("BasicSalary   :" + employee2.getBasicSalary());
            employee2.salaryCalculator();

        } else if (role.equalsIgnoreCase("team lead")) {
            System.out.println(" Employee ID : " + employee3.getId());
            System.out.println("Employee Name: " + employee3.getName());
            System.out.println("Employee Role:Team Lead ");
            System.out.println("BasicSalary  :" + employee3.getBasicSalary());
            employee3.salaryCalculator();

        } else {
            System.out.println("invalid");
        }


//        System.out.println("1. Developer");
//        System.out.println("2. Senior Developer");
//        System.out.println("3. Tester");
//
//        System.out.print("Enter your choice: ");
//        int choice = sc.nextInt();
//        sc.nextLine();
//
//
//
//        if (choice == 1)
//        {
//            Employee employee1 = new Developer();
//            System.out.print("Enter ID: ");
//            employee1.setId(sc.nextInt());
//            sc.nextLine();
//            System.out.print("Enter Name: ");
//            employee1.setName(sc.nextLine());
//            System.out.print("Enter BasicSalary: ");
//            employee1.setBasicsalary(sc.nextInt());
//            System.out.println(" Employee ID: " + employee1.getId());
//            System.out.println("Employee Name: " + employee1.getName());
//            System.out.println("BasicSalary"+employee1.getBasicSalary());
//            employee1.salaryCalculator();
//
//        } else if (choice == 2) {
//            Employee employee2 = new SeniorDeveloper();
//            System.out.println("senior developer");
//            System.out.print("Enter ID: ");
//            employee2.setId(sc.nextInt());
//            sc.nextLine();
//            System.out.print("Enter Name: ");
//            employee2.setName(sc.nextLine());
//
//            System.out.println(" Employee ID: " + employee2.getId());
//            System.out.println("Employee Name: " + employee2.getName());
//            System.out.println("Employee role :Senior developer ");
//            employee2.salaryCalculator();
//
//        } else if (choice == 3) {
//              Employee employee3 = new TeamLead();
//            System.out.println("tester");
//            System.out.println("senior developer");
//            System.out.print("Enter ID: ");
//            employee3.setId(sc.nextInt());
//            sc.nextLine();
//            System.out.print("Enter Name: ");
//            employee3.setName(sc.nextLine());
//
//            System.out.println(" Employee ID: " + employee3.getId());
//            System.out.println("Employee Name: " + employee3.getName());
//            System.out.println("Employee role :Tester ");
//
//            employee3.salaryCalculator();
//        }
//        else {
//            System.out.println("Invalid choice");
//        }
//

    }
}

