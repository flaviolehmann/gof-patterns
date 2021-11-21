package com.github.flaviolehmann.service.visitor;

import com.github.flaviolehmann.service.dto.EmailDTO;

public interface EmailExporterVisitor {

    void doForCustomerEmailDTO(EmailDTO emailDTO);
    void doForBusinessPartnerEmailDTO(EmailDTO emailDTO);
}
