package exam.exam.variables;

public class VariablesExample {
    // instance variable demo
    // always have default values
    int instanceVariable = 33;
    int default_number;
    boolean default_bool;
    Integer default_object;

    // local variable demo
    // don't get default values
    public void localVariableDemo() {
        int x = 15;
        System.out.println("This is a local variable: " + x);
    }

    // static variable demo
    static public int staticVariable;

    public static void main(String[] args) {
        VariablesExample example = new VariablesExample();
        VariablesExample secondObject = new VariablesExample();
        example.localVariableDemo();
        System.out.println("This is the value of the first instance variable: " + example.instanceVariable);
        // in static methods instance variables should be called with object reference
        example.instanceVariable = 25;
        System.out.println("This is the value of the first instance variable after changing it's value: " + example.instanceVariable);
        System.out.println("This is the value of the second instance variable: " + secondObject.instanceVariable);
        System.out.println("Demo of default value of number: " + example.default_number);
        System.out.println("Demo of default value of boolean: " + example.default_bool);
        System.out.println("This is the value of object: " + example.default_object);
        System.out.println("This is a static variable: " + VariablesExample.staticVariable);

        // data types
        int v1 = 5;
        int v2 = 5;
        String s1 = "Hello";
        String s2 = s1;
    }
}
