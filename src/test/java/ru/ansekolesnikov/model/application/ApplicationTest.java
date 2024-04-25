package ru.ansekolesnikov.model.application;

import ru.ansekolesnikov.factory.ManagerFactory;
import ru.ansekolesnikov.model.application.Application;

import java.util.Date;

public class ApplicationTest {
    public static void main(String[] args) {
        Application application = new Application.ApplicationBuilder(
                "Credit Application",
                "John Doe",
                new Date(),
                10000
        )
                .manager(new ManagerFactory().createManager(9000))
                .description("Additional information about the application")
                .reason("Reason for the credit application")
                .build();


        application.sendForApproval();
    }
}
