package lii.store;

public class Store {
    private EventManager events;

    public Store() {
        this.events = new EventManager();
    }

    public void subscribeCustomer(String eventType, Customer customer) {
        events.subscribe(eventType, customer);
    }

    public void unSubscribeCustomer(String eventType, Customer customer) {
        events.unsubscribe(eventType, customer);
    }


    public void addNewProduct(String productName) {
        System.out.println("Store: New product added: " + productName);
        events.notify("newProduct", "Check out our new product: " + productName + "!");
    }

    public void startSale(String product, int discount) {
        System.out.println("Store: Sale started on " + product);
        events.notify("sale", "Hurry! " + product + " is now " + discount + "% off!");
    }
}

