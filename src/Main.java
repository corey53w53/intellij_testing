import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Person());
//        split("1ab23c");

        System.out.println(is_palindrome("hellolleh"));
        System.out.println(is_palindrome("12321"));
        System.out.println(is_palindrome("1"));
        System.out.println(is_palindrome("12"));
        System.out.println(is_palindrome("123"));
    }
    public static boolean is_palindrome(String s){
        for (int i=0;i<s.length()/2;i++){
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {return false;}
        }
        return true;
    }
    public static String Person() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age:");
        String string_age = s.nextLine();
        int age = Integer.parseInt(string_age);
        return "I am " + age + " years old.";
    }
    public static void split(String s){
        String ints="";
        String chars="";
        for (int i=0;i<s.length();i++){
            String current_char="";
            try{
                Integer.parseInt(Character.toString(s.charAt(i)));
                ints=ints.concat(Character.toString(s.charAt(i)));
            }
            catch(Exception e){
                chars=chars.concat(Character.toString(s.charAt(i)));
            }
        }
        String[] r= {ints,chars};
        //yo how tf does this vvv for loop work, plz help
        for (String i : r) {
            System.out.println(i);
        }
        //for loop above and below are the same, whatttt
//        for (int i=0;i<myarr.length;i++){
//            System.out.println(myarr[i]);
//        }

    }
}