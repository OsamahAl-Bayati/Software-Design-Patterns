package tryObserver;

public class Customer extends Observer  {

    private float discount;

    private String name;

    private static int observerIDTracker = 0;

    private int observerID;

    private Subject store;

    public Customer (Subject store, String name) {

        this.store = store;
        this.name = name;

        this.observerID = ++observerIDTracker;

        System.out.println("New Observer " + this.observerID);

        store.register(this);

    }

    @Override
    public void update(float discount) {
        this.discount = discount;

        printUpdateOut(name, discount);
        
    }

    public void printUpdateOut(String name, float discount) {
        this.name = name;

        System.out.println("Customer: " + name + " Has Discount: " + discount);

    
    }
    
}
