package com.github.flaviolehmann.service.handler;

public interface Handler<T> {

    void setNext(Handler<T> handler);
    void handle(T request);
}
