// Use of Object and Classes in Java
import java.io.*;

class Numbers {
    // Properties
    private int a;
    private int b;

    // Methods
    public void sum() { System.out.println(a + b); }

    public void sub() { System.out.println(a - b); }

    public static void main(String[] args)
    {
        // Creating Instance of Class
        // Object
        Numbers obj = new Numbers();

        // Assigning Values to the Properties
        obj.a = 1;
        obj.b = 2;

        // Using the Methods
        obj.sum();
        obj.sub();
    }
}