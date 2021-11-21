package com.github.flaviolehmann.service.dto;

import com.github.flaviolehmann.service.visitor.EmailExporterVisitor;

public class CustomerEmailDTO implements EmailDTO {

    private String title;
    private String body;
    private Long purchaseCount;

    public CustomerEmailDTO(String title, String body, Long purchaseCount) {
        this.title = title;
        this.body = body;
        this.purchaseCount = purchaseCount;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getBody() {
        return body;
    }

    public Long getPurchaseCount() {
        return purchaseCount;
    }

    @Override
    public void accept(EmailExporterVisitor emailExporterVisitor) {
        emailExporterVisitor.doForCustomerEmailDTO(this);
    }
}
