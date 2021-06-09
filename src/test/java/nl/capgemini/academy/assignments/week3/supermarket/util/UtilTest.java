package nl.capgemini.academy.assignments.week3.supermarket.util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UtilTest {
    private static Stream<Arguments> valuesProvider() {
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(1, 0),
                Arguments.of(2, 0),
                Arguments.of(3, 5),
                Arguments.of(4, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("valuesProvider")
    void testRound(int total, int rounded) {
        assertEquals(rounded, Util.round(total));
    }
}