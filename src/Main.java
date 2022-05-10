import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File myObj = new File("input.txt");
        Scanner myReader = new Scanner(myObj);
        String input="";
        List<String> list=new ArrayList<String>();
        while (myReader.hasNextLine()){
            String i = myReader.nextLine();
            list.add(i);
        }
        myReader.close();
        String most_common="";
        String least_common="";
        for (int i=0;i<list.get(0).length();i++){
            int zeroes=0;
            int ones=0;
            for(String s:list){
                if (s.charAt(i)=='0'){
                    zeroes+=1;
                } else {
                    ones+=1;
                }
            }
            if (zeroes>ones){
                most_common+="0";
                least_common+="1";
            } else {
                most_common+="1";
                least_common+="0";
            }
        }
        int gamma = to_base_ten(most_common);
        int epsilon = to_base_ten(least_common);
        System.out.println("Part one: " + gamma*epsilon);
        System.out.println(list);
    }
    public static int to_base_ten(String s){
        int multiplier = 1;
        int total=0;
        for (int i = s.length()-1; i>=0;i--){
            int c = Character.getNumericValue(s.charAt(i));
            total+=c*multiplier;
            multiplier*=2;
        }
        return total;
    }
}