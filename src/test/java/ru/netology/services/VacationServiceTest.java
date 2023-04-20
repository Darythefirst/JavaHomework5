package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
//import ru.netology.services.VacationService;

public class VacationServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/VacationData.csv")
    public void shouldCalcVacation(int income, int expenses, int threshold, int expected) {
        VacationService service = new VacationService();
        int actual = service.MonthCalc(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
