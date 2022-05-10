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
        List<Integer> list=new ArrayList<Integer>();
        while (myReader.hasNextLine()){
            list.add(Integer.parseInt(myReader.nextLine()));
        }
        myReader.close();
        int counter1=0;
        for (int i=0;i<list.size()-1;i++){
            if (list.get(i+1)-list.get(i)>0){
                counter1+=1;
            }
        }
        System.out.println("part one: " + counter1);
        int counter2=0;
        for (int i=0;i<list.size()-3;i++){
            if (list.get(i+3)-list.get(i)>0){
                counter2+=1;
            }
        }
        System.out.println("part two: " + counter2);
    }
}