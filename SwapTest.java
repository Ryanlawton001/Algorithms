package Swap;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class SwapTest {
    private void testSwapString(){
        String[] originalString = new String[]{"Mike", "Rupert", "Charles", "Barry"};
        String[] updatedString = new String[]{"Mike", "Barry", "Charles", "Rupert"};
        assertArrayEquals(updatedString, Swap.swap(originalString, 1, 3));
    }

    @Test
    private void testSwap(){
        testSwapString();
    }

}