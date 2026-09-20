package employeepayroll;

abstract class Employee {
    private String name;
    private int id;
    private int basicSalary;

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setId(int id) {

        this.id = id;
    }

    public int getId() {

        return id;
    }

    public void setBasicsalary(int basicSalary) {

        this.basicSalary= basicSalary;
    }

    public int  getBasicSalary() {

        return basicSalary;
    }


    abstract  void salaryCalculator();

}


class Developer extends Employee {

      int developerAllowance = 5000;

        @Override
        void salaryCalculator() {
            int total = getBasicSalary() + developerAllowance;
            System.out.println("Allowance    : " + developerAllowance);
            System.out.println("Total Salary : " + total);

        }
}

class SeniorDeveloper extends Developer {

    int SeniorDeveloperAllowance = 8000;

    @Override
    void salaryCalculator() {
        int  total = getBasicSalary() +SeniorDeveloperAllowance;
        System.out.println("Allowance    : " + SeniorDeveloperAllowance);
        System.out.println("Total Salary : " + total);

    }
}

class TeamLead extends SeniorDeveloper {

    int teamLeadAllowance = 8000;

    @Override
    void salaryCalculator() {
        int total = getBasicSalary() +teamLeadAllowance;
        System.out.println("Allowance    : " + teamLeadAllowance);
        System.out.println("Total Salary : " + total);

    }
    }



