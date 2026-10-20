
package BankingTransactionManagementSystem;

public class InvalidAmountException extends Exception {

    public InvalidAmountException(String message) {
        super(message);
    }

    public static void validateAmount(double amount) throws InvalidAmountException {

        if (amount == 0) {
            throw new InvalidAmountException("Amount must be greater than zero.");
        }
        if (amount< 0) {
            throw new InvalidAmountException("Amount must be positive number.");
        }

    }
}