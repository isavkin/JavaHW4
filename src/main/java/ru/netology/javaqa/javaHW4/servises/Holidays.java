package ru.netology.javaqa.javaHW4.servises;

public class Holidays {
    public int calculate(int income, int expenses, int treshold) {
        int count = 0; // счётчик кол-ва месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 1; month <= 12; month++) {
            if (money >= treshold) { // отдых
                int newTreshold = money - (money - expenses) / 3 - expenses;
                System.out.println("Месяц " + month + ". Денег " + money + ". Буду отдыхать. Потратил -" + expenses + ", затем еще -" + newTreshold);
                money = (money - expenses) / 3;
                count++; // увеличиваем счётчик кол-ва месяцев отдыха
            } else { //работа
                System.out.println("Месяц " + month + ". Денег " + money + ". Придется работать. Заработал +" + income + ", потратил -" + expenses);
                money = money + income - expenses;
            }

        }
        System.out.println("Отдохнуть удасться " + count + " месяца(ев) в году.");
        return count;
    }
}
