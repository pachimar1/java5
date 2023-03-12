package ru.netology.javaqa.javaqamvnhw.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class VacationServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/initial.scv")
    void shouldCalculateVacationMonth(int expected, int income, int expenses, int threshold) {
        VacationService service = new VacationService();

        int count = service.calcVacation(income, expenses, threshold);

        Assertions.assertEquals(expected, count);
    }
}

