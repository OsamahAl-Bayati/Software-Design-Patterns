package SGDO;

import java.util.logging.Logger;

public class BasicGarageDoor implements StdGarageDoorOpener {
    private Logger log = Logger.getLogger(
    		BasicGarageDoor.class.getSimpleName());
    
	@Override
	public void openDoor(int speedLevel) {
    	log.info("Garage Door is Opening");

	}

	@Override
	public void closeDoor(int speedLevel) {
    	log.info("Garage Door is Closing");

	}

}
