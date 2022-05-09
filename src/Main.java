import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age:");
        String string_age = s.nextLine();
        System.out.println("My type is " + string_age.getClass());
        int age = Integer.parseInt(string_age);
        Person(age);
    }

    public static void Person(int age) {
        System.out.println("I am " + age + " years old.");
    }
}