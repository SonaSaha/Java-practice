package exam.exam.operators;

public class Operators {

    public static void main(String[] args) {

        // conditional operator
        int a = (1>2) ? 5: 23;
        System.out.println("The value of a: " + a);

        // instance of operator
        String name = "Sona";
        boolean result = name instanceof String;
        System.out.println("The value of f: " + result);
    }
}
