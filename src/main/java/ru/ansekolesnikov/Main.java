package ru.ansekolesnikov;

import ru.ansekolesnikov.model.application.Application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму кредита: ");
        Application application = new Application(scanner.nextInt());
        scanner.close();

        application.sendForApproval();
    }
}