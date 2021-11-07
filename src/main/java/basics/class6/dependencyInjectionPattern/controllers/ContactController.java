package basics.class6.dependencyInjectionPattern.controllers;

import basics.class6.dependencyInjectionPattern.services.EmailService;
import basics.class6.dependencyInjectionPattern.services.impl.EmailServiceImpl;

public class ContactController {
    //private EmailService emailService = new EmailServiceImpl();
    private EmailService emailService;

    public ContactController(EmailServiceImpl emailService) {
        this.emailService = emailService;
    }

    public void sendEmail() {
        emailService.sendEmail("sample email", "Chrislu0126@hotmail.com");
    }
}
