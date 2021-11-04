package com.github.flaviolehmann.service.observer.subscriber;

import com.github.flaviolehmann.model.DressingProduct;
import com.github.flaviolehmann.model.Product;

public class DressingProductSubscriber implements Subscriber<Product> {

    @Override
    public void update(Product product) {
        if (product instanceof DressingProduct) {
            System.out.println("Dressing product subscriber says: " + product.toString());
        }
    }
}
