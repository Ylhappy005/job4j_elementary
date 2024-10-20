package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }
    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    @Test
    void whenMan180Then92() {
        short input = 180;
        double expected = 92;
        double output = Fit.manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
    @Test
    void whenWoman170Then69()
        short input = 170;
        double expected = 69;
        double output = Fit.manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));

    }
}