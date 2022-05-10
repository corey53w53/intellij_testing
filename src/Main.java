import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File myObj = new File("input.txt");
        Scanner myReader = new Scanner(myObj);
        String input="";
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            input=input+data+"\n";
        }
        myReader.close();
        System.out.println(input);
    }
}