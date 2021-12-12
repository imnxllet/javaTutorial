package basics.designPatterns.dependencyInjectionPattern;

import basics.designPatterns.dependencyInjectionPattern.controllers.ContactController;
import basics.designPatterns.dependencyInjectionPattern.controllers.EmailController;
import basics.designPatterns.dependencyInjectionPattern.services.EmailService;
import basics.designPatterns.dependencyInjectionPattern.services.impl.EmailServiceImpl;

public class App {
    public static void main(String[] args) {
        EmailService emailService = new EmailServiceImpl();

        EmailController emailController = new EmailController(emailService);
        ContactController contactController = new ContactController(emailService);
    }
}
