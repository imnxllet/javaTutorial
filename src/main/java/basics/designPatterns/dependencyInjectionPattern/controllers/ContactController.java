package basics.designPatterns.dependencyInjectionPattern.controllers;

import basics.designPatterns.dependencyInjectionPattern.services.EmailService;

public class ContactController {
    //private EmailService emailService = new EmailServiceImpl();
    private EmailService emailService;

    public ContactController(EmailService emailService) {
        this.emailService = emailService;
    }

    public void sendEmail() {
        emailService.sendEmail("sample email", "Chrislu0126@hotmail.com");
    }
}
