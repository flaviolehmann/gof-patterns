package com.github.flaviolehmann.service;

import com.github.flaviolehmann.service.dto.EmailDTO;
import com.github.flaviolehmann.service.visitor.EmailExporterVisitor;

public class DefaultEmailExporterVisitor implements EmailExporterVisitor {

    @Override
    public void doForCustomerEmailDTO(EmailDTO emailDTO) {
        System.out.println("Sending a customer email: " + emailDTO.getTitle());
    }

    @Override
    public void doForBusinessPartnerEmailDTO(EmailDTO emailDTO) {
        System.out.println("[IMPORTANT] Sending a business partner email: " + emailDTO.getTitle());
    }
}
