package ru.ansekolesnikov.model.application;

import ru.ansekolesnikov.factory.ManagerFactory;
import ru.ansekolesnikov.model.employee.Manager;

import java.util.Date;

public class Application {
    private String name;
    private String client;
    private Date creditTerm;
    private int creditAmount;
    private Manager manager;
    private String description = "";
    private String reason = "";

    public Application(int creditAmount) {
        this.creditAmount = creditAmount;
        this.manager = new ManagerFactory().createManager(creditAmount);
    }

    private Application(ApplicationBuilder applicationBuilder) {
        this.name = applicationBuilder.name;
        this.client = applicationBuilder.client;
        this.creditTerm = applicationBuilder.creditTerm;
        this.creditAmount = applicationBuilder.creditAmount;
        this.manager = applicationBuilder.manager;
        this.description = applicationBuilder.description;
        this.reason = applicationBuilder.reason;
    }

    public void sendForApproval() {
        manager.verificationApplication(this);
        manager.approveApplication(this);
        manager.signingApplication(this);
    }

    public ApplicationBuilder builder() {
        return null;
    }

    public static class ApplicationBuilder {
        private String name;
        private String client;
        private Date creditTerm;
        private int creditAmount;
        private Manager manager = null;
        private String description = "";
        private String reason = "";

        public ApplicationBuilder(
                String name,
                String client,
                Date creditTerm,
                int creditAmount
        ) {
            this.name = name;
            this.client = client;
            this.creditTerm = creditTerm;
            this.creditAmount = creditAmount;
        }

        public ApplicationBuilder name(String val) {
            this.name = val;
            return this;
        }

        public ApplicationBuilder client(String val) {
            this.client = val;
            return this;
        }

        public ApplicationBuilder creditTerm(Date val) {
            this.creditTerm = val;
            return this;
        }

        public ApplicationBuilder creditAmount(int val) {
            this.creditAmount = val;
            return this;
        }

        public ApplicationBuilder manager(Manager val) {
            this.manager = val;
            return this;
        }

        public ApplicationBuilder description(String val) {
            this.description = val;
            return this;
        }

        public ApplicationBuilder reason(String val) {
            this.reason = val;
            return this;
        }

        public Application build() {
            return new Application(this);
        }
    }
}
