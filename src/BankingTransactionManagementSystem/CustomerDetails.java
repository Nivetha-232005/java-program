package BankingTransactionManagementSystem;

public class CustomerDetails {
    private static int accountNumber;
    private static String customerName;
    private static double availableBalance;

    public CustomerDetails(int accountNumber, String customerName, double availableBalance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.availableBalance = availableBalance;
    }

    public static int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public static String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public static double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    static void display(){
        System.out.println("AccountNumber     :"+getAccountNumber());
        System.out.println("CustomerName      :"+getCustomerName());
        System.out.println("AvailableBalance  :"+getAvailableBalance());
    }
}
