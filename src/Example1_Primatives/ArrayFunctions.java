package Example1_Primatives;

public class ArrayFunctions {

    public static void main(String[] args) {
        
        //You can use this main function as you like

    }
    
    /*
     * Takes an array of length size and returns the sum of all the elements in it
     * assume size > 0
     */
    public static int sumArray(int list[], int size) {
        int sum = 0;
        
        for(int i = 0; i < size; i++) {
            sum += list[i];
        }
        
        
        return sum;
    }
    
    /*
     * Takes an array of length size , and finds the largest element in it
     * assume size > 0
     */
    public static int getLargestElement(int list[], int size) {
        int largest = list[0];
        
        for(int i = 0; i < size; i++) {
            if(largest < list[i]) {
                largest = list[i];
            }
        }
        
        return largest;
    }
    
    /*
     * Given an Array of strings and an integer num, return num number of strings from the array concatenated together in order
     * 
     * assume that num > size of s and num > 1
     * 
     * ex String s[] = { "hello" , "this" , "is" , "me"};
     * getXStrings(s, 3) = "hellothisis"
     */
    public static String getXStrings(String s[], int num) {
        String returnString = "";
        for(int i = 0; i < num; i++) {
            returnString += s[i];
        }
        
        return returnString;
    }
}
