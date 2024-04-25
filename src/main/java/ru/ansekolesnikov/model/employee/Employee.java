package ru.ansekolesnikov.model.employee;

public interface Employee {
    default public boolean becomeProgrammer() {
        return true;
    }
}
