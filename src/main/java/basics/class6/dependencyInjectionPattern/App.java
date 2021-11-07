package basics.class6.dependencyInjectionPattern;

import basics.class6.dependencyInjectionPattern.controllers.ContactController;
import basics.class6.dependencyInjectionPattern.controllers.EmailController;
import basics.class6.dependencyInjectionPattern.services.EmailService;
import basics.class6.dependencyInjectionPattern.services.impl.EmailServiceImpl;

public class App {
    public static void main(String[] args) {
        EmailService emailService = new EmailServiceImpl();

        EmailController emailController = new EmailController(emailService);
        ContactController contactController = new ContactController(emailService);
    }
}
