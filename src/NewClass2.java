
public class NewClass2 {

    /*
     * This is the main function, which is roughly equivalent to the main in C, 
     */
    public static void main(String[] args) {
        String a = "This is a String";
        System.out.println(a);
        
        //you can call static functions similarly to C like this
        String s = getString();
        System.out.println(s);
        
        //Strings can be concatenated like this
        
        String b = a + s;
        
        System.out.println(b);
    }

    public static String getString() {
        return "This is also a String";
    }
}
