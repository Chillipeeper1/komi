package com.komi.project.model;

import jakarta.persistence.*;

import java.text.DateFormat;
import java.util.UUID;

@Entity
@Table(name = "requests")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID requests_id;
    private String clientEmail;
    private DateFormat creationDate;
    private RequestState orderSate;

    @ManyToOne
    @JoinColumn(name = "commission_template_id")
    private CommissionTemplate commissionTemplate;

    public UUID getRequests_id() {
        return requests_id;
    }

    public void setRequests_id(UUID requests_id) {
        this.requests_id = requests_id;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public DateFormat getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(DateFormat creationDate) {
        this.creationDate = creationDate;
    }

    public RequestState getOrderSate() {
        return orderSate;
    }

    public void setOrderSate(RequestState orderSate) {
        this.orderSate = orderSate;
    }

    public CommissionTemplate getCommissionTemplate() {
        return commissionTemplate;
    }

    public void setCommissionTemplate(CommissionTemplate commissionTemplate) {
        this.commissionTemplate = commissionTemplate;
    }
}
