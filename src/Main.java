import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        Fraction a = new Fraction();
        a.num=3;
        a.den=9;
        System.out.println("Before simplifying: " + a);
        Fraction.simplify(a);
        System.out.println("After simplifying: " + a);
    }
}