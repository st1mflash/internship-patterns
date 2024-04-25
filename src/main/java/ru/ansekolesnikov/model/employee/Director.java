package ru.ansekolesnikov.model.employee;

import ru.ansekolesnikov.model.application.Application;

public class Director implements Manager, Employee {
    @Override
    public void verificationApplication(Application application) {
        System.out.println("Директор проверил заявку на кредит");
    }

    @Override
    public void approveApplication(Application application) {
        System.out.println("Директор одобрил заявку на кредит");
    }

    @Override
    public void signingApplication(Application application) {
        System.out.println("Директор подписал заявку на кредит");
    }
}
