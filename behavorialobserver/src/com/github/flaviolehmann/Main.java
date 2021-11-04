package com.github.flaviolehmann;

import com.github.flaviolehmann.model.CookingProduct;
import com.github.flaviolehmann.model.DressingProduct;
import com.github.flaviolehmann.model.Product;
import com.github.flaviolehmann.service.observer.publisher.ProductsPublisher;
import com.github.flaviolehmann.service.observer.publisher.Publisher;
import com.github.flaviolehmann.service.observer.subscriber.CookingProductSubscriber;
import com.github.flaviolehmann.service.observer.subscriber.DressingProductSubscriber;

public class Main {

    public static Publisher<Product> publisher = new ProductsPublisher();

    public static void main(String ...args) {
        publisher.addSubscriber(new DressingProductSubscriber());

        // Notice how it will be printed out only the dressing products, since we don't have an subscriber
        // for the cooking products yet
        publisher.updateValue(new DressingProduct(1L, "Shirt"));
        publisher.updateValue(new DressingProduct(2L, "Dress"));
        publisher.updateValue(new CookingProduct(3L, "Spoon"));
        publisher.updateValue(new CookingProduct(4L, "Fork"));

        // Now we do!
        publisher.addSubscriber(new CookingProductSubscriber());

        // And only 'Knife' will be printed out
        publisher.updateValue(new CookingProduct(5L, "Knife"));

        // We can also create a runtime subscriber!
        publisher.addSubscriber(product -> System.out.println("New runtime subscriber says: " + product));
        publisher.updateValue(new Product() {
            @Override
            public String toString() {
                return "Just a new product";
            }
        });
    }
}
