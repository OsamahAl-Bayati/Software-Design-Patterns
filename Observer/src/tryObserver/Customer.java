package tryObserver;

public class Customer extends Observer  {

    Store store;

    private String name;

    private static int observerIDTracker = 0;

    private int observerID;

    public Customer (Store newstore, String name) {

        store = newstore;

        this.name = name;

        this.observerID = ++observerIDTracker;

        System.out.println("New Observer " + this.observerID);

    }

    @Override
    public void update(float discount) {
        printUpdateOut(name, discount);
        
    }

    public void printUpdateOut(String name, float discount) {
        this.name = name;
        System.out.println("Customer: " + name + " Has Discount: " + discount);

    }

    public void register(Observer o) {
        store.register(o);
    }
    
}