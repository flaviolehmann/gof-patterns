package com.github.flaviolehmann.service.dto;

import com.github.flaviolehmann.service.visitor.EmailExporterVisitor;

public interface EmailDTO {

    String getTitle();
    String getBody();
    void accept(EmailExporterVisitor emailExporterVisitor);
}
