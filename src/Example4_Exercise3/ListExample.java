package Example4_Exercise3;

import java.util.ArrayList;

public class ListExample {
    
    public static void main(String[] args) {
        ArrayList<Integer> list_a = new ArrayList<Integer>();

        list_a.add(1);
        list_a.add(2);
        list_a.add(3);
        System.out.println(list_a);
        
        System.out.println(sumArray(list_a));
        System.out.println(getLargestElement(list_a));
    }
    
    /*
     * Takes an array of size length and returns the sum of all the elements in it
     */
    public static int sumArray(ArrayList<Integer> list) {
        int sum = 0;
        
        for(int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        
       /*  
        // Equivalent to the for loop above
        for(int i : list) {
            sum += i;
        }
         */
       
        return sum;
    }
    
    /*
     * Takes an array of size length, and finds the largest element in it
     */
    public static int getLargestElement(ArrayList<Integer> list) {
        int largest = list.get(0);
        
        for(int i = 0; i < list.size(); i++) {
            if(largest < list.get(i)) {
                largest = list.get(i);
            }
        }
        
        return largest;
    }
}
