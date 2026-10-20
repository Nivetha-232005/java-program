package BankingTransactionManagementSystem;

public class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message) {
        super(message);
    }
    public static void validateAmount(double withdrawal) throws InsufficientBalanceException{

        if (withdrawal >=CustomerDetails.getAvailableBalance() ) {
            throw new InsufficientBalanceException("InsufficientBalanceException");

        }


    }
}

