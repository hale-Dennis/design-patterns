package lii.store;

import java.util.*;

public class EventManager {
    private Map<String, List<Customer>> listeners = new HashMap<>();

    public void subscribe(String eventType, Customer customer) {
        listeners.computeIfAbsent(eventType, k -> new ArrayList<>()).add(customer);
    }

    public void unsubscribe(String eventType, Customer customer) {
        List<Customer> customers = listeners.get(eventType);
        if (customers != null) customers.remove(customer);
    }

    public void notify(String eventType, String message) {
        List<Customer> customers = listeners.get(eventType);
        if (customers != null) {
            for (Customer customer : customers) {
                customer.update(eventType, message);
            }
        }
    }
}
