package ru.job4j.condition;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Vector {
    public static String addVectors(int x1, int y1, int x2, int y2) {
        int xResult = x1 + x2;
        int yResult = y1 + y2;
        return String.format("(%d, %d)", xResult, yResult);
    }

    public static void main(String[] args) {
        String result = addVectors(1, 2, 3, 4);
        System.out.println("result (1, 2) + (3, 4) = " + result);
    }
}

class VectorTest {
    @Test
    void whenVectors12And34ThenResult45() {
        int x1 = 1, y1 = 2, x2 = 3, y2 = 4;
        String expected = "(4, 6)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenVectorsMinus12And34ThenResult22() {
        int x1 = -1, y1 = -2, x2 = 3, y2 = 4;
        String expected = "(2, 2)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenVectorsMinus12AndMinus34ThenResultMinus46() {
        int x1 = -1, y1 = -2, x2 = -3, y2 = -4;
        String expected = "(-4, -6)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }
}
