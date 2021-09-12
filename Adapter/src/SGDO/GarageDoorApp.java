package SGDO;

import java.util.logging.Logger;

public class GarageDoorApp {
    private Logger log = Logger.getLogger(
    		GarageDoorApp.class.getSimpleName());
    private StdGarageDoorOpener garageDoorOpener;
    public GarageDoorApp(StdGarageDoorOpener garageDoorOpener) {
    	this.garageDoorOpener = garageDoorOpener;
    }
    public void openDoor(int speedLevel) {
    	this.garageDoorOpener.openDoor(speedLevel);
    	log.info("Garage Door is Open");
    }
    public void closeDoor(int speedLevel) {
    	this.garageDoorOpener.closeDoor(speedLevel);
    	log.info("Garage Door is Closed");
    }
}
