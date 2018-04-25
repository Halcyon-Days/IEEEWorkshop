package Example2_Person;

public class MainClass_2 {
    public static void main(String[] args) {
        
        //creating a ImprovedPerson Object
        ImprovedPerson batman = new ImprovedPerson("Batman", 26, "Male", "I'm Batman");
        
        //running a function using an object
        batman.sayCatchphrase();
        
        //accessing fields, this will not work anymore
        //System.out.println("Batman is " + batman.age + " years old and is " + batman.gender);
        
        System.out.println("Batman is " + batman.getAge() + " years old and is " + batman.getGender());
        
        //getting fields, this will not work anymore
        //batman.catchphrase = "WHERE ARE THEY?";
        
        batman.changeCatchphrase("WHERE ARE THEY?");
        batman.sayCatchphrase();

    }
}
