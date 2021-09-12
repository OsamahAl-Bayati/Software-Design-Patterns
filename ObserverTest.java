package tryObserver;

public class ObserverTest {
    
    public static void main(String[] args) {

        Store store1 = new Store("Store 1", 0);
        Store store2 = new Store("Store 2", 0);
        Store store3 = new Store("Store 3", 0);
        Customer customer1 = new Customer(store1, "John Doe");
        Customer customer2 = new Customer(store2, "Rebecca Silvers");
        Customer customer3 = new Customer(store3, "Abram Charon");

        store1.register(customer1);
        store2.register(customer2);
        store3.register(customer3);

        store1.unregister(customer1);
        store2.unregister(customer2);
        store3.unregister(customer3);

        store1.setDiscount("New Years", 90);
        store2.setDiscount("New Years", 25);
        store3.setDiscount("New Years", 1);

    }

}
