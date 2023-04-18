package ru.netology.services;

public class VacationService {

    public int MonthCalc(int income, int expenses, int threshold) {
        int count = 0; //счетчик месяцев
        int money = 0; //кол-ко денег  на счету
        for (int month = 1; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money = money - expenses;
                money = money / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return count;

    }
}
