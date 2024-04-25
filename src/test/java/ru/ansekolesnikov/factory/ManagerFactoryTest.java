package ru.ansekolesnikov.factory;

import org.junit.jupiter.api.Test;
import ru.ansekolesnikov.model.employee.Director;
import ru.ansekolesnikov.model.employee.Manager;
import ru.ansekolesnikov.model.employee.SimpleManager;
import ru.ansekolesnikov.model.employee.VIPManager;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ManagerFactoryTest {
    private final ManagerFactory managerFactory = new ManagerFactory();

    @Test
    void testCreateSimpleManager() {
        Manager manager = managerFactory.createManager(5000);
        assertTrue(manager instanceof SimpleManager);
    }

    @Test
    void testCreateVIPManager() {
        Manager manager = managerFactory.createManager(20000);
        assertTrue(manager instanceof VIPManager);
    }

    @Test
    void testCreateDirector() {
        Manager manager = managerFactory.createManager(60000);
        assertTrue(manager instanceof Director);
    }

    @Test
    void testCreateDefaultManager() {
        Manager manager = managerFactory.createManager(100000);
        assertTrue(manager instanceof Director);
    }
}