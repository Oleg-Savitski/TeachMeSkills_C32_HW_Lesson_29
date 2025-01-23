package example_dip.service;

import example_dip.utils.Notifiable;

public class EmailNotificationService implements Notifiable {
    @Override
    public void sendNotification(String message) {
        System.out.println("Email Sent -> " + message);
    }
}