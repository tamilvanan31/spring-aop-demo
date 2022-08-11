package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout(String message) {
        System.out.println("Item purchased");
    }

    public int quantity() {
        return 2;
    }
}
