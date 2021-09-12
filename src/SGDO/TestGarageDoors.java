package SGDO;

public class TestGarageDoors {

    public static void main(String[] args) {
    BasicGarageDoor testBasic = new BasicGarageDoor();
    PremiumGarageDoorOpener testPremium = new PremiumGarageDoorOpener();

    new GarageDoorAdapter(testPremium);

    testPremium.openDoor(10);
    testPremium.closeDoor(9);
    testBasic.closeDoor(1);
    testBasic.openDoor(1);


    }

}
