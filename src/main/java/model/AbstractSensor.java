package model;

/**
 * This class is the abstract class to manage every sensors.
 *
 * @author Emilien
 *
 * <p> 13 december 2018 : Version 1 (Emilien)</p>
 */
public abstract class AbstractSensor {

    Boolean visibility = false;

    /**
     * Constructor for the abstract class.
     * Set the visibility at true.
     */
    public AbstractSensor() {
        setVisibility(true);
    }


    /**
     * Getter of the visibility.
     * If the sensor if visible the getter send true.
     * @return visibility
     */
    public Boolean isVisibile() {
        return visibility;
    }

    /**
     * Setter of the visibility.
     * @param visibility the boolean for the visibility.
     */
    public void setVisibility(Boolean visibility) {
        this.visibility = visibility;
    }

}
