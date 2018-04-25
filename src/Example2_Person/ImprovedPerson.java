package Example2_Person;

public class ImprovedPerson {

        private String name;
        private int age;
        private String gender;
        private String catchphrase;
        
        public ImprovedPerson (String inputName, int inputAge, String inputGender, String inputCatchPhrase) {
            name = inputName;
            age = inputAge;
            gender = inputGender;
            catchphrase = inputCatchPhrase;
        }
        
        
        public void sayCatchphrase() {
            System.out.println(name + " says " + catchphrase);
        }

        //Setter functions for parameters 
        public void changeName(String newName) {
            name = newName;
        }
        
        public void changeGender(String newGender) {
            gender = newGender;
        }
        
        public void changeAge(int newAge) {
            age = newAge;
        }
        
        public void changeCatchphrase(String newCatchphrase) {
            catchphrase = newCatchphrase;
        }
        
        /*
         * Getter functions for parameters
         */
        public String getName() {
            return name;
        }
        
        public String getGender() {
            return gender;
        }
        
        public int getAge() {
            return age;
        }
        
        public String getCatchphrase() {
            return catchphrase;
        }

}
