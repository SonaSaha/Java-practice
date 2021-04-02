package exam.exam.exceptions;

import java.io.IOException;

public class ExceptionPropagation {

    void m() {
        int x = 50/0;
    }

    void n() {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception ex) {
            System.out.println("Exception handled");
        }
    }

    // example which describes that checked exceptions are not propagated

    void m1() throws IOException {
        throw new java.io.IOException("device error"); // checked exception
    }

    void n1() throws IOException {
        m1();
    }

    void p1() {
        try {
            n1();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            StackTraceElement [] arr = ex.getStackTrace();
            for(int i=0; i<arr.length; ++i) {
                System.out.println(arr[i]);
            }
            System.out.println("Exceptions handled");

        }
    }
    void p2() {
        try {
            n1();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.fillInStackTrace());
            System.out.println("Exceptions handled");

        }
    }
    public static void main(String[] args) {

        ExceptionPropagation obj = new ExceptionPropagation();
//        obj.p();
//        obj.p1();
        obj.p2();
        System.out.println("Normal flow");
    }
}
