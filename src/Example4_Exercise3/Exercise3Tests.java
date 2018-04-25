package Example4_Exercise3;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class Exercise3Tests {

    @Test
    public void testSimilar() {
        ArrayList<String> testList1 = new ArrayList<String>(Arrays.asList("Chris", "Jerry", "Tommy", "Saltya", "Sathya"));
        ArrayList<String> testList2 = new ArrayList<String>(Arrays.asList("Christopher", "Tom", "Timmy", "Nicole", "Sathya"));
        
        ArrayList<String> testList3 = new ArrayList<String>(Arrays.asList("Danny", "Linares"));
        ArrayList<String> testList4 = new ArrayList<String>(Arrays.asList("Linares", "Tom", "Timmy", "Danny", "Saltya"));
        
        assertEquals(Exercise3.similarList(testList1, testList2), new ArrayList<String>(Arrays.asList("Sathya")));
        assertEquals(Exercise3.similarList(testList3, testList4), new ArrayList<String>(Arrays.asList("Danny", "Linares")));
        assertEquals(Exercise3.similarList(testList4, testList1), new ArrayList<String>(Arrays.asList("Saltya")));
        assertEquals(Exercise3.similarList(testList1, testList1), new ArrayList<String>(Arrays.asList("Chris", "Jerry", "Tommy", "Saltya", "Sathya"))); 
    }
    
    @Test
    public void testStartsWith() {
        ArrayList<String> testList1 = new ArrayList<String>(Arrays.asList("Chris", "Jerry", "Tommy", "Saltya", "Sathya"));
        ArrayList<String> testList2 = new ArrayList<String>(Arrays.asList("Christopher", "Tom", "Timmy", "Nicole", "Sathya"));
        
        ArrayList<String> testList3 = new ArrayList<String>(Arrays.asList("Danny", "Linares"));
        ArrayList<String> testList4 = new ArrayList<String>(Arrays.asList("Linares", "Tom", "Timmy", "Danny", "Saltya"));
        
        assertEquals(Exercise3.nameStartsWith(testList1, "C"), new ArrayList<String>(Arrays.asList("Chris")));
        assertEquals(Exercise3.nameStartsWith(testList3, "De"), new ArrayList<String>(Arrays.asList()));
        assertEquals(Exercise3.nameStartsWith(testList4, "T"), new ArrayList<String>(Arrays.asList("Tom", "Timmy")));
        assertEquals(Exercise3.nameStartsWith(testList2, "N"), new ArrayList<String>(Arrays.asList("Nicole"))); 
        assertEquals(Exercise3.nameStartsWith(testList1, "Chris"), new ArrayList<String>(Arrays.asList("Chris"))); 
    }

}
