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
        int forward1=0;
        int depth1=0;
        int forward2 = 0;
        int depth2 = 0;
        int aim2=0;
        while (myReader.hasNextLine()){
            String[] l = myReader.nextLine().split(" ");
            int num = Integer.parseInt(l[1]);
            switch (l[0]) {
                case "forward":
                    forward1+=num;
                    forward2+=num;
                    depth2+=(num*aim2);
                    break;
                case "up":
                    depth1-=num;
                    aim2-=num;
                    break;
                case "down":
                    depth1+=num;
                    aim2+=num;
                    break;
            }
        }
        myReader.close();
        System.out.println("Part 1: " + forward1*depth1);
        System.out.println("Part 2: " + forward2*depth2);
    }
}