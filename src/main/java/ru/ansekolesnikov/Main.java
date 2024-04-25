package ru.ansekolesnikov;

import ru.ansekolesnikov.model.application.Application;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму кредита: ");
        Application application = new Application(scanner.nextInt());
        scanner.close();

        application.sendForApproval();

        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_YEAR, 2);

        new Application.ApplicationBuilder(
                "Java",
                "developer",
                calendar.getTime(),
                15000
        );
    }
}