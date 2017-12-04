/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri1042;

import Uri1042.ArraySort;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArraySortTest {
    
    public ArraySortTest() {
    }

    /**
     * Test of sortArray method, of class ArraySort.
     */
    @Test
    public void testSortArray() {
        ArraySort arraySort = new ArraySort();
        int[] expResult = {-14, 7, 21};
        int[] result = arraySort.sortArray(7, 21, -14);
        assertArrayEquals(expResult, result);
    }   
    
    @Test
    public void testSortArray2() {
        ArraySort arraySort = new ArraySort();
        int[] expResult = {-14, 7, 21};
        int[] result = arraySort.sortArray(-14, 21, 7);
        assertArrayEquals(expResult, result);
    } 
}
