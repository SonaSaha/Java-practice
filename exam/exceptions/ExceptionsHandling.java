package exam.exam.exceptions;

public class ExceptionsHandling {

    public static void example1() {
        try {
            int x = 100/0;
        } catch(ArithmeticException e) {
            System.out.println(e);
        }
    }

    public static void example2() {
        int [] nums = new int[5];
        try {
            System.out.println("In try 1");
            nums[10] = 10;
//            nums[3] = 5;
            System.out.println("In try 2");
        } catch (Exception ex) {
            System.out.println(ex);
            System.out.println("In catch");
        }
        System.out.println("Rest of program");
    }

    public static void errorMethod() {
        int [] nums = new int[5];
        nums[10] = 10;
    }

    public static void multipleCatchBlocks() {
        int [] nums = new int[5];
        try {
            System.out.println("In try 1");
            nums[10] = 10;
            System.out.println("In try 2");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("In catch 1");
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println("In catch 2");
            System.out.println(ex);
        }
        System.out.println("Rest of program");
    }

    public static void example3() {

        int [] numer = {8, 10, 5, 23};
        int [] denom = {4, 2, 0, 2};

        for(int i=0; i<numer.length; ++i) {
            try {
                System.out.println(numer[i] / denom[i]);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }

    public static void manuallyThrowExceptionDemo() {
        try {
            System.out.println("Before throw");
            throw new ArithmeticException();
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    public static void finallyBlockDemo() {
        int [] nums = new int[5];
        try {
            System.out.println("In try 1");
            nums[10] = 10;
            System.out.println("In try 2");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("In catch");
//            ex.printStackTrace();
            System.out.println(ex.getStackTrace());
            return;
        } finally {
            System.out.println("In finally");
        }
        System.out.println("Rest of program");
    }
    public static void main(String[] args) {

//        example1();
//        example2();

//        try {
//            System.out.println("In try 1");
//            errorMethod();
//            System.out.println("In try 2");
//        } catch (Exception ex) {
//            System.out.println("In catch");
//        }
//        System.out.println("Rest of program");

//        multipleCatchBlocks();

//        example3();

//        manuallyThrowExceptionDemo();

        finallyBlockDemo();
    }
}
