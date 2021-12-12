package basics.designPatterns.dependencyInjectionPattern.services.impl;

import basics.designPatterns.dependencyInjectionPattern.services.EmailService;

public class EmailServiceImpl implements EmailService {
    @Override
    public void sendEmail(String message, String receiver){
        //logic to send email
        System.out.println("Email sent to "+receiver+ " with Message="+message);
    }
}
