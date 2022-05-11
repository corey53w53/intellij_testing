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


}
