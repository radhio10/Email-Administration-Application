package dev.radhio;

import java.util.Arrays;

public class EmailApp {
    public static void main(String[] args) {
        Email email = new Email("Radhio","Hoque");
        email.setAlternativeEmailAddress("abc@company.com");
        email.setMailBoxCapacity(100);
        System.out.println("Mail Box Capacity: " + email.getMailBoxCapacity());
        email.setPassword("abc-1234");
        System.out.printf(email.showInfo());
    }
}
