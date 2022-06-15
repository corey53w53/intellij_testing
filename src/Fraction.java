import java.util.*;

public class Fraction {
    int num;
    int den;
    public void display()
    {
        System.out.println("Top " + num);
        System.out.println("Bottom " + den);
    }
    public String toString() {
        return this.num + "/" + this.den;
    }
    public static int gcf(int a, int b){
        if (a==0){
            return 0;
        }
        if (b==0){
            return 0;
        }
        if (a == b){
            return a;
        }
        if (a > b) {
            return gcf(a - b, b);
        }
        return gcf(a,b-a);
    }
    public static void simplify(Fraction a){
        int gcf=gcf(a.num,a.den);
        a.num/=gcf;
        a.den/=gcf;
    }
    public static List<Integer> find_multiples(int a){
        Set<Integer> ts = new TreeSet<>();

        for (int i = 1; i<=a/2; i++){
            if(a%i==0){
                ts.add(i);
                ts.add(a/i);
            }
        }
        return new ArrayList<>(ts);
    }
}
