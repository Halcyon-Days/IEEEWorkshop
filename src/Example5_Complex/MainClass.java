package Example5_Complex;

public class MainClass {

    public static void main(String[] args) {
        Complex complexNum1 = new Complex(5, 6);
        
        System.out.println(complexNum1);

        Complex complexNum2 = new Complex(7, 7);
        
        System.out.println(complexNum2);
        
        System.out.println(complexNum1.add(complexNum2));
        
        System.out.println(complexNum1.divide(complexNum2));
        
        System.out.println(complexNum1.multiply(complexNum2));
    }

}
