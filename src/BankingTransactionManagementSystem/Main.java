
package BankingTransactionManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CustomerDetails customerDetails =
                new CustomerDetails(101, "Nivetha", 9);

        try {
            AccountNotFoundException.validateAmount();
        } catch (AccountNotFoundException e) {
            System.out.println(e.getMessage());
            sc.close();
            return;
        }
            System.out.println("\n--- Banking Transaction Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdrawal");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();

                    try {
                        InvalidAmountException.validateAmount(deposit);

                        double total =
                                CustomerDetails.getAvailableBalance() + deposit;

                        customerDetails.setAvailableBalance(total);

                        System.out.println("Deposit Amount: " + deposit);
                        System.out.println("Total Balance: "
                                + CustomerDetails.getAvailableBalance());

                    } catch (InvalidAmountException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawal = sc.nextDouble();

                    try {
                        InvalidAmountException.validateAmount(withdrawal);

                        double balance = CustomerDetails.getAvailableBalance();
                        try{
                            InsufficientBalanceException.validateAmount(withdrawal);

                        }catch (InsufficientBalanceException e){
                            System.out.println("insufficient balance");
                            System.out.println("AvailableBalance:"+CustomerDetails.getAvailableBalance());
                            break;
                        }
                        double total = balance - withdrawal;

                        customerDetails.setAvailableBalance(total);

                        System.out.println("Withdrawal Amount: " + withdrawal);
                        System.out.println("Total Balance: " + CustomerDetails.getAvailableBalance());

                    } catch (InvalidAmountException e) {
                        System.out.println(e.getMessage());
                    }


                case 3:
                    System.out.println("Thank you for using our banking system!");
                    return;

                default:
                    System.out.println("Thank you for using our banking system!");
            }
        }
    }

