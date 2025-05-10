
/**
 * Write a description of class Equipment here.
 *
 * @author Manal Fayyaz
 * @version 9-5-2025
 */
public class Equipment
{
    // instance variables - replace the example below with your own
    private String equipment;
    /**
     * Constructor for objects of class Equipment
     */
    public Equipment(String equipment) {
        this.equipment = equipment;
    }

    /**
     * Returns the name or description of the equipment.
     */
     public String getEquipment() {
         return equipment;
    }

    /**
     *  Updates the equipment name.
     */
    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }
    
    public String toString(){
        return equipment;
    }
}
