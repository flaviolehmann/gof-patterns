package com.github.flaviolehmann.service.observer.subscriber;

import com.github.flaviolehmann.model.CookingProduct;
import com.github.flaviolehmann.model.Product;

public class CookingProductSubscriber implements Subscriber<Product> {

    @Override
    public void update(Product product) {
        if (product instanceof CookingProduct) {
            System.out.println("Cooking product subscriber says: " + product.toString());
        }
    }
}
