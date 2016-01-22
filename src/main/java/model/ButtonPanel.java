package model;

import java.util.Map;
import java.util.Objects;

public class ButtonPanel {
    public Boolean openDoor;
    public Boolean closeDoor;
    public Map<Integer, Boolean> floorButtons;

    public ButtonPanel(Map<Integer, Boolean> floorButtons) {
        this.floorButtons = floorButtons;
    }

    public Boolean getOpenDoor() {
        return openDoor;
    }

    public void setOpenDoor(Boolean openDoor) {
        this.openDoor = openDoor;
    }

    public Boolean getCloseDoor() {
        return closeDoor;
    }

    public void setCloseDoor(Boolean closeDoor) {
        this.closeDoor = closeDoor;
    }

    public Map<Integer, Boolean> getFloorButtons() {
        return floorButtons;
    }

    public void setFloorButtons(Map<Integer, Boolean> floorButtons) {
        this.floorButtons = floorButtons;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.openDoor);
        hash = 59 * hash + Objects.hashCode(this.closeDoor);
        hash = 59 * hash + Objects.hashCode(this.floorButtons);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ButtonPanel other = (ButtonPanel) obj;
        if (!Objects.equals(this.openDoor, other.openDoor)) {
            return false;
        }
        if (!Objects.equals(this.closeDoor, other.closeDoor)) {
            return false;
        }
        if (!Objects.equals(this.floorButtons, other.floorButtons)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ButtonPanel{" + "openDoor=" + openDoor + ", closeDoor=" + closeDoor + ", floorButtons=" + floorButtons + '}';
    }
}
