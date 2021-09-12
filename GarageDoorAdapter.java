package SGDO;

public class GarageDoorAdapter implements StdGarageDoorOpener {

    PremiumGarageDoorOpener premiumGarageDoorOpener;

    public GarageDoorAdapter(PremiumGarageDoorOpener newPremiumGarageDoorOpener) {
        premiumGarageDoorOpener = newPremiumGarageDoorOpener; 
    }

    @Override
    public void openDoor(int speedLevel) {
        premiumGarageDoorOpener.openDoor(speedLevel);
    }

    @Override
    public void closeDoor(int speedLevel) {
        premiumGarageDoorOpener.closeDoor(speedLevel);
    }


}
