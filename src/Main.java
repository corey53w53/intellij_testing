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

        //Start part two below
        int len=list.get(0).length();
        List<String> mc_list = new ArrayList<>(list);
        List<String> lc_list = new ArrayList<>(list);
        int final_mc=0;
        int final_lc=0;

        for (int i=0;i<len;i++){
            char mc;
            int mc_zeroes=0;
            int mc_ones=0;
            for(String s:mc_list){
                if (s.charAt(i)=='0'){
                    mc_zeroes+=1;
                } else {
                    mc_ones+=1;
                }
            }
            if (mc_zeroes>mc_ones){
                mc = '0';
            } else {
                mc = '1';
            }
            char lc;
            int lc_zeroes=0;
            int lc_ones=0;
            for(String s:lc_list){
                if (s.charAt(i)=='0'){
                    lc_zeroes+=1;
                } else {
                    lc_ones+=1;
                }
            }
            if (lc_zeroes>lc_ones){
                lc='1';
            } else {
                lc = '0';
            }

            for (int j=0;j<mc_list.size();j++) {
                if (mc_list.get(j).charAt(i) != mc) {
                    mc_list.remove(new String(mc_list.get(j)));
                    j--;
                }
            }
            for (int j=0;j<lc_list.size();j++) {
                if (lc_list.get(j).charAt(i) != lc) {
                    lc_list.remove(new String(lc_list.get(j)));
                    j--;
                }
            }
            if (mc_list.size()==1){
                final_mc=to_base_ten(mc_list.get(0));
            }
            if (lc_list.size()==1){
                final_lc=to_base_ten(lc_list.get(0));
            }
        }
        System.out.println("Part two: " + final_mc*final_lc);
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