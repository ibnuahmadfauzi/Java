package prak2operatorlogika;

public class Main {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        
        boolean isAnd = a && b;
        boolean isOr = a || b;
        boolean isNotA = !a;
        boolean isNotB = !b;
        
        System.out.println(a+" AND "+b+" = "+isAnd);
        System.out.println(a+" OR "+b+" = "+isOr);
        System.out.println("not a "+b+" = "+isNotA);
        System.out.println("not b "+b+" = "+isNotB);
    }
    
}
