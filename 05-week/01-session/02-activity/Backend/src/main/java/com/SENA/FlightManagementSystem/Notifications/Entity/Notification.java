package com.SENA.FlightManagementSystem.Notifications.Entity;

import com.SENA.FlightManagementSystem.Security.Entity.Person;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name ="message_template", schema = "notification")
public class Notification extends ANotificationBaseEntity {

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false )
    private Person person;

    @Column(name = "channel", nullable = false)
    private String channel;

    @Column(name = "subject", nullable = false)
    private String subject;

    @Column(name = "message", nullable = false)
    private String message;

    @Column(name = "sent_at", nullable = false)
    private LocalDateTime sentAt;

    @Column(name = "status", nullable = false)
    private String status;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getSentAt() {
        return sentAt;
    }

    public void setSentAt(LocalDateTime sentAt) {
        this.sentAt = sentAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
