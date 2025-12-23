import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CollectionsPracticeTest {

    @Test
    void filterOddNumbers() {
        ArrayList<Integer> unfilteredList = new ArrayList<>();
        unfilteredList.add(10);
        unfilteredList.add(13);
        unfilteredList.add(16);
        unfilteredList.add(19);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(13);
        expected.add(19);

        ArrayList<Integer> actual = new ArrayList<>(CollectionsPractice.filterOddNumbers(unfilteredList));

        assertEquals(expected, actual);

    }
}