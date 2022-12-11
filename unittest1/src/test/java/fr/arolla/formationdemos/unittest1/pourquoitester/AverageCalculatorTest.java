package fr.arolla.formationdemos.unittest1.pourquoitester;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Collections.emptyList;
import static org.junit.jupiter.api.Assertions.*;

class AverageCalculatorTest {
    @Test
    void compute_average_of_list() {
        // Arrange
        List<Integer> input = List.of(1, 2, 3);

        // Act
        double actualResult = AverageCalculator.calculate(input);

        // Assert
        assertEquals(2, actualResult);
    }

    @Test
    void average_of_empty_list_is_0() {
        List<Integer> input = emptyList();

        double actualResult = AverageCalculator.calculate(input);

        assertEquals(0, actualResult);
    }
}