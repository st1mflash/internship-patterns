package ru.ansekolesnikov.model.employee;

import ru.ansekolesnikov.model.application.Application;

public class SimpleManager implements Manager, Employee {
    @Override
    public void verificationApplication(Application application) {
        System.out.println("Обычный менеджер проверил заявку на кредит");
    }

    @Override
    public void approveApplication(Application application) {
        System.out.println("Обычный менеджер одобрил заявку на кредит");
    }

    @Override
    public void signingApplication(Application application) {
        System.out.println("Обычный менеджер подписал заявку на кредит");
    }
}
