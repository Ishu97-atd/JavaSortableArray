package test.java;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

import com.example.SortArray;

public class SortArrayTest {
    @Test
    public void testSortIntegers() {
        int[] input = {3, 2, 4, 1, 5, 9};
        int[] expectedOutput = {1, 2, 3, 4, 5, 9};
        assertArrayEquals(expectedOutput, SortArray.integersSort(input));
    }
   
}
