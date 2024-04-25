package ru.ansekolesnikov.factory;

import ru.ansekolesnikov.model.employee.Director;
import ru.ansekolesnikov.model.employee.Manager;
import ru.ansekolesnikov.model.employee.SimpleManager;
import ru.ansekolesnikov.model.employee.VIPManager;

public class ManagerFactory {
    public Manager createManager(int amountCredit){
        if (amountCredit < 10000) {
            return new SimpleManager();
        } else if (amountCredit < 50000) {
            return new VIPManager();
        } else {
            return new Director();
        }
    }
}
