import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter your age:");
//        String string_age = s.nextLine();
//        System.out.println("My type is " + string_age.getClass());
//        int age = Integer.parseInt(string_age);
//        System.out.println(Person(age));
        String test="1ab23c";
        String[] myarr=split(test);

        //yo how tf does this vvv for loop work, plz help
        for (String s : myarr) {
            System.out.println(s);
        }
        //for loop above and below are the same, whatttt
        for (int i=0;i<myarr.length;i++){
            System.out.println(myarr[i]);
        }

    }

    public static String Person(int age) {
        return "I am " + age + " years old.";
    }
    public static String[] split(String s){
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
        return new String[]{ints, chars};

    }
}