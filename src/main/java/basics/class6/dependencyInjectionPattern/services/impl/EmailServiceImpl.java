package basics.class6.dependencyInjectionPattern.services.impl;

import basics.class6.dependencyInjectionPattern.services.EmailService;

public class EmailServiceImpl implements EmailService {
    @Override
    public void sendEmail(String message, String receiver){
        //logic to send email
        System.out.println("Email sent to "+receiver+ " with Message="+message);
    }
}
