import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    int[] array;
    @Test
    void binarySearch() {
        int position = -1;
        array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assertions.assertEquals( position, Main.binarySearch(array, 0, array.length-1, 0));
    }
    @Test
    void binarySearch1() {
        int position = 2;
        array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assertions.assertEquals( position, Main.binarySearch(array, 0, array.length-1, 2));
    }
}