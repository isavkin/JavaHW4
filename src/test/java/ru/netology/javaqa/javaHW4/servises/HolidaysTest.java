package ru.netology.javaqa.javaHW4.servises;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HolidaysTest {
    @Test
    public void Test1() {
        Holidays service = new Holidays();

        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int countMonth = 3;
        int rezalt = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(countMonth, rezalt);
    }

    @Test
    public void Test2() {
        Holidays service = new Holidays();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int countMonth = 2;
        int rezalt = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(countMonth, rezalt);
    }


}
