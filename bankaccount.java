package itjava.example;

public class BankAccount {

    double balance = 10000;

    void withdraw(double amount) throws InsufficientBalanceException {

        if (balance < amount) {
            throw new InsufficientBalanceException("Less balance");
        }

        balance = balance - amount;

        System.out.println(amount + " withdraw successful");
        //System.out.println("Remaining Balance: " + balance);
    }
}
------------------------------------------------------------------------------------------------------------------------------------------------------------
  package itjava.example;

public class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String msg) {
        super(msg);
    }

}
-------------------------------------------------------------------------------------------------------------------------------------------------------------
  package itjava.example;

public class Mainclass {

	public static void main(String[] args) throws InsufficientBalanceException {
		BankAccount acc = new BankAccount();
		acc.withdraw(7000);

	}

}
