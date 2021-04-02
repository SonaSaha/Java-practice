package exam.exam.exceptions;

public class CustomExceptions {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Jone", 100);
//        BankAccount account2 = new BankAccount("Anna", -1);

        try {
            account1.withdraw(120);
        } catch (InsufficientFoundException e) {
            e.printStackTrace();
        }

    }
}
