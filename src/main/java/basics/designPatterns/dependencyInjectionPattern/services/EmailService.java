package basics.designPatterns.dependencyInjectionPattern.services;

public interface EmailService {
    void sendEmail(String message, String receiver);
}
