package ru.ansekolesnikov.model.application;

import ru.ansekolesnikov.factory.ManagerFactory;
import ru.ansekolesnikov.model.employee.Manager;

public class Application {
    private final int amount;
    private final Manager manager;
    public Application(int amount) {
        this.amount = amount;
        this.manager = new ManagerFactory().createManager(amount);
    }
    public void sendForApproval() {
        manager.verificationApplication(this);
        manager.approveApplication(this);
        manager.signingApplication(this);
    }
}
