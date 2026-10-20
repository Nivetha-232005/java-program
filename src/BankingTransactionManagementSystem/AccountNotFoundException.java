
package BankingTransactionManagementSystem;

public class AccountNotFoundException extends Exception {

    public AccountNotFoundException(String message) {
        super(message);
    }

    public static void validateAmount() throws AccountNotFoundException {

        if (CustomerDetails.getAccountNumber() != 101) {
            throw new AccountNotFoundException("Transaction failed: Account " + CustomerDetails.getAccountNumber() + " was not found.");
        }else {

            CustomerDetails.display();
        }

    }
}