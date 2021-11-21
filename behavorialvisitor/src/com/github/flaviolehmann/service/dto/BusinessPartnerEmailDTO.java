package com.github.flaviolehmann.service.dto;

import com.github.flaviolehmann.service.visitor.EmailExporterVisitor;

public class BusinessPartnerEmailDTO implements EmailDTO {

    private String title;
    private String body;
    private Long salesCount;

    public BusinessPartnerEmailDTO(String title, String body, Long salesCount) {
        this.title = title;
        this.body = body;
        this.salesCount = salesCount;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getBody() {
        return body;
    }

    public Long getSalesCount() {
        return salesCount;
    }

    @Override
    public void accept(EmailExporterVisitor emailExporterVisitor) {
        emailExporterVisitor.doForBusinessPartnerEmailDTO(this);
    }
}
