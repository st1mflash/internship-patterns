package ru.ansekolesnikov.model.employee;

import ru.ansekolesnikov.model.application.Application;

public interface Manager {
    public void verificationApplication(Application application);
    public void approveApplication(Application application);
    public void signingApplication(Application application);

}
