package Example2_Person;

public class MainClass_1 {

    public static void main(String[] args) {
    
        //creating a person Object
        Person batman = new Person("Batman", 26, "Male", "I'm Batman");
        
        //running a function using an object
        batman.sayCatchphrase();
        
        //accessing fields
        System.out.println("Batman is " + batman.age + " years old and is " + batman.gender);
        
        //changing a field
        batman.catchphrase = "WHERE ARE THEY?";
        
        batman.sayCatchphrase();

        
        //create new Person object, now there are 2 Person Objects in this program
        Person hulk = new Person("Hulk", 29, "Male", "I'm always angry");
        
        hulk.sayCatchphrase();
    }

}
