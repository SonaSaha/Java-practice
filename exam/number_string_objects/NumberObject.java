package exam.exam.number_string_objects;

public class NumberObject {

    public static void main(String[] args) {
        Integer x = 5; // boxing int to an Integer object
        x = x + 5; // unboxing the Integer to an int
        System.out.println(x);

        // number methods
        double y = x.doubleValue();
        Integer z = x.intValue();
        System.out.println(y);

        System.out.println(x.compareTo(z));

        Double d = -102.5;
        System.out.println(Math.ceil(d));

        char a = 'A';
        System.out.println(++a);
    }
}
