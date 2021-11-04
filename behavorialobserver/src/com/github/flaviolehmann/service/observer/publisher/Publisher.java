package com.github.flaviolehmann.service.observer.publisher;

import com.github.flaviolehmann.service.observer.subscriber.Subscriber;

public interface Publisher<T> {

    void updateValue(T newValue);

    void addSubscriber(Subscriber<T> subscriber);
}
