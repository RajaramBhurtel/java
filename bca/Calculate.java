package bca;
import calculatepackage.*;
import calculatepackage.multiply.*;
public class Calculate{
    public static void main(String args[]){
        Addition a = new Addition();
        Multiply m = new Multiply();
        int result = a.add(1,2);
        int ans = m.product(1,2);
        System.out.println("Result:" + result);
        System.out.println("Ans:" + ans);
    }
}