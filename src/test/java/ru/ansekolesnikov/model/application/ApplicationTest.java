package ru.ansekolesnikov.model.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.ansekolesnikov.factory.ManagerFactory;

import java.util.Date;

class ApplicationTest {
    private Application application;

    @BeforeEach
    void setUp() {
        application = new Application.ApplicationBuilder("Test Application", "Test Client", new Date(), 10000)
                .manager(new ManagerFactory().createManager(10000))
                .description("Test Description")
                .reason("Test Reason")
                .build();
    }

    @Test
    void testGetName() {
        Assertions.assertEquals("Test Application", application.getName());
    }

    @Test
    void testGetClient() {
        Assertions.assertEquals("Test Client", application.getClient());
    }

    @Test
    void testGetCreditTerm() {
        Assertions.assertNotNull(application.getCreditTerm());
    }

    @Test
    void testGetCreditAmount() {
        Assertions.assertEquals(10000, application.getCreditAmount());
    }

    @Test
    void testGetManager() {
        Assertions.assertNotNull(application.getManager());
    }

    @Test
    void testGetDescription() {
        Assertions.assertEquals("Test Description", application.getDescription());
    }

    @Test
    void testGetReason() {
        Assertions.assertEquals("Test Reason", application.getReason());
    }
}