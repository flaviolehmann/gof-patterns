package com.github.flaviolehmann;

import com.github.flaviolehmann.service.DefaultEmailExporterVisitor;
import com.github.flaviolehmann.service.dto.BusinessPartnerEmailDTO;
import com.github.flaviolehmann.service.dto.CustomerEmailDTO;
import com.github.flaviolehmann.service.dto.EmailDTO;
import com.github.flaviolehmann.service.visitor.EmailExporterVisitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private final EmailExporterVisitor emailExporterVisitor;

    public Main(EmailExporterVisitor emailExporterVisitor) {
        this.emailExporterVisitor = emailExporterVisitor;
    }

    public static void main(String ...args) {
        new Main(new DefaultEmailExporterVisitor()).main();
    }

    public void main() {
        List<EmailDTO> toBeSentEmails = loadEmails();
        toBeSentEmails.forEach(emailDTO -> emailDTO.accept(emailExporterVisitor));
    }

    private List<EmailDTO> loadEmails() {
        return new ArrayList<>(Arrays.asList(
                new CustomerEmailDTO("New product!", "...", 12L),
                new CustomerEmailDTO("Another new product!", "...", 114L),
                new BusinessPartnerEmailDTO("NEW PRODUCT.", "...", 99992L),
                new CustomerEmailDTO("Even another new product", "...", 7L)
        ));
    }
}
