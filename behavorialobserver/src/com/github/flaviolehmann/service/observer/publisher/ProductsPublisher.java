package com.github.flaviolehmann.service.observer.publisher;

import com.github.flaviolehmann.model.Product;
import com.github.flaviolehmann.service.observer.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class ProductsPublisher implements Publisher<Product> {

    List<Subscriber<Product>> subscribers = new ArrayList<>();

    @Override
    public void updateValue(Product newValue) {
        subscribers.forEach(subscriber -> subscriber.update(newValue));
    }

    @Override
    public void addSubscriber(Subscriber<Product> subscriber) {
        subscribers.add(subscriber);
    }
}
