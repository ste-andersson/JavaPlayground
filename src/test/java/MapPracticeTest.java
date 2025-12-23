import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;

class MapPracticeTest {

    @Test
    void countWords() {
        ArrayList<String> inputWords = new ArrayList<>(List.of("Adam", "Bertil", "Calle", "Bertil", "Bertil"));
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("Adam", 1);
        expected.put("Bertil", 3);
        expected.put("Calle", 1);

        HashMap<String, Integer> actual = MapPractice.countWords(inputWords);

        assertEquals(expected, actual);
    }
}