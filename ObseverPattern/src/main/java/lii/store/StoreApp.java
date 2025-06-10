package lii.store;

public class StoreApp {
    public static void main(String[] args) {
        Store store = new Store();

        Customer alice = new RegularCustomer("Kwame");
        Customer bob = new RegularCustomer("David");


        store.subscribeCustomer("newProduct", alice);
        store.subscribeCustomer("sale", bob);
        store.subscribeCustomer("sale", alice);


        store.addNewProduct("Wireless Earbuds");
        store.startSale("Smartphone", 30);
    }
}

