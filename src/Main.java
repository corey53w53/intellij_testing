import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
public class Main {
    public static void main(String[] args) {
        Fraction a = new Fraction();
        a.num=3;
        a.den=4;
        System.out.println(a);
        Fraction b=Fraction.plus_one(a);
        System.out.println(b);
        Fraction.mult_two(b);
        System.out.println(b);
    }
}