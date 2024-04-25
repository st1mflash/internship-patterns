package ru.ansekolesnikov.model.employee;

import ru.ansekolesnikov.model.application.Application;

public class VIPManager implements Manager, Employee {
    @Override
    public void verificationApplication(Application application) {
        System.out.println("VIP-менеджер проверил заявку на кредит");
    }

    @Override
    public void approveApplication(Application application) {
        System.out.println("VIP-менеджер одобрил заявку на кредит");
    }

    @Override
    public void signingApplication(Application application) {
        System.out.println("VIP-менеджер подписал заявку на кредит");
    }
}
