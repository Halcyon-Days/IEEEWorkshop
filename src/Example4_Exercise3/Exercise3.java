package Example4_Exercise3;

import java.util.ArrayList;

public class Exercise3 {

    public static void main(String[] args) {
        // You can use this if you'd like

    }
    
    public static ArrayList<String> similarList(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> returnList = new ArrayList<String>();
        
        for(String s: list1) {
            if(list2.contains(s)) {
                returnList.add(s);
            }
        }
        
        return returnList;
    }

    public static ArrayList<String> nameStartsWith(ArrayList<String> list1, String c) {
        ArrayList<String> returnList = new ArrayList<String>();
        
        for(String s: list1) {
            if(s.startsWith(c)) {
                returnList.add(s);
            }
        }
        
        return returnList;
    }
}
