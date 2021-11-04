package com.github.flaviolehmann.service.observer.subscriber;

public interface Subscriber<T> {

    void update(T t);
}
