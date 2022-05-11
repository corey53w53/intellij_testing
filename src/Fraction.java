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

    public static Fraction plus_one(Fraction a){
        Fraction b = new Fraction();
        b.num=a.num+1;
        b.den=a.den+1;
        return b;
    }
    public static void mult_two(Fraction a){
        a.num*=2;
        a.den*=2;
    }
    public static void simplify(Fraction a){
        List<Integer> num_l = find_multiples(a.num);
        List<Integer> den_l = find_multiples(a.den);
        for (int i = num_l.size()-1; i>=0; i--){
            if (den_l.contains(num_l.get(i))){
                int gcf=num_l.get(i);
                a.num/=gcf;
                a.den/=gcf;

            }
        }


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
