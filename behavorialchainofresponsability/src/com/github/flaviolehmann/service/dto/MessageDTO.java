package com.github.flaviolehmann.service.dto;

public class MessageDTO {

    private String content;
    private final String emitter;
    private final Long severityLevel;

    public MessageDTO(String content, String emitter, Long severityLevel) {
        this.content = content;
        this.emitter = emitter;
        this.severityLevel = severityLevel;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public String getEmitter() {
        return emitter;
    }

    public Long getSeverityLevel() {
        return severityLevel;
    }
}
