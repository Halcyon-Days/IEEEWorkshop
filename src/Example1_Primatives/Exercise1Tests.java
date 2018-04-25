package Example1_Primatives;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise1Tests {

    @Test
    public void testSumArray() {
        int testArray1[] = {1,2,3,4,5};
        int testArray2[] = {5,4,3,2,1};
        int testArray3[] = {11,22,33,44,55};
        int testArray4[] = {10, 15, 25, 50, 60};
        int testArray5[] = {2, 4, -8, 22, -99};
        
        assertEquals(ArrayFunctions.sumArray(testArray1, 5), 15 );
        assertEquals(ArrayFunctions.sumArray(testArray2, 5), 15 );
        assertEquals(ArrayFunctions.sumArray(testArray3, 5), 165 );
        assertEquals(ArrayFunctions.sumArray(testArray4, 5), 160 );
        assertEquals(ArrayFunctions.sumArray(testArray5, 5), -79 );     
    }
    
    @Test
    public void testGetLargest() {
        int testArray1[] = {1,2,3,4,5};
        int testArray2[] = {5,4,3,2,1};
        int testArray3[] = {11,22,33,44,55};
        int testArray4[] = {10, 60, 25, 50, 15};
        int testArray5[] = {2, 4, -8, 22, -99};
        
        assertEquals(ArrayFunctions.getLargestElement(testArray1, 5), 5 );
        assertEquals(ArrayFunctions.getLargestElement(testArray2, 5), 5 );
        assertEquals(ArrayFunctions.getLargestElement(testArray3, 5), 55 );
        assertEquals(ArrayFunctions.getLargestElement(testArray4, 5), 60 );
        assertEquals(ArrayFunctions.getLargestElement(testArray5, 5), 22 );     
    }
    
    @Test
    public void testGetXStrings() {
        String testArray1[] = {"1","2","3","4","5"};
        String testArray2[] = {"a", "b", "c", "d", "e"};
        
        assertEquals(ArrayFunctions.getXStrings(testArray1, 5), "12345" );
        assertEquals(ArrayFunctions.getXStrings(testArray1, 2), "12" );
        assertEquals(ArrayFunctions.getXStrings(testArray2, 1), "a" );
        assertEquals(ArrayFunctions.getXStrings(testArray2, 4), "abcd" );
        assertEquals(ArrayFunctions.getXStrings(testArray2, 5), "abcde" );     
    }

}
