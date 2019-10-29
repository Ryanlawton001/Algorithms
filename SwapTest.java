package Swap;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class SwapTest {
    private void testSwapString(){
        String[] originalString = new String[]{"Mike", "Rupert", "Charles", "Barry"};
        String[] updatedString = new String[]{"Mike", "Barry", "Charles", "Rupert"};
        assertArrayEquals(updatedString, Swap.swap(originalString, 1, 3));

    }

    private void testSwap(Array array, int index , int index2){
        Array[] test = new Array[5];
        Swap swap = new Swap();
        assertArrayEquals();

    }

}