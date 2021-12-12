package basics.designPatterns.dependencyInjectionPattern.controllers;

import basics.designPatterns.dependencyInjectionPattern.services.EmailService;

public class EmailController {
    //private EmailService emailService = new EmailServiceImpl();
    private EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    public void sendEmail() {
        emailService.sendEmail("sample email", "Chrislu0126@hotmail.com");
    }
}
