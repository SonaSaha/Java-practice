package exam.exam.exceptions;

public class BankAccount {
    private String owner;
    private int amount;

    public BankAccount(String owner, int amount) {
        if(amount < 0) {
            throw new RuntimeException("Can't create account with negative balance");
        }
        this.amount = amount;
        this.owner = owner;
    }

    public void withdraw(int amountToWithdraw) throws InsufficientFoundException {
        if(amount - amountToWithdraw < 0) {
//            throw new Exception("Not enough money");
            throw new InsufficientFoundException("You need " + -1*(amount - amountToWithdraw));
        }
        this.amount -= amountToWithdraw;
    }
}
