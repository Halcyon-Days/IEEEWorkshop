package Example2_Person;

public class Person {
    String name;
    int age;
    String gender;
    String catchphrase;
    String status;
    
    public Person (String inputName, int inputAge, String inputGender, String inputCatchphrase) {
        name = inputName;
        age = inputAge;
        gender = inputGender;
        catchphrase = inputCatchphrase;
        
        status = "alive";
    }
    
    void sayCatchphrase() {
        System.out.println(name + " says \"" + catchphrase + "\"");
    }
}



