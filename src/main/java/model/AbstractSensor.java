package model;

/**
 * @author Emilien
 */
public abstract class AbstractSensor {

    Boolean visibility = false;

    /**
     * Constructeur
     */
    public AbstractSensor() {
        setVisibility(true);
    }


    /**
     * Getter
     * @return capteur visible ?
     */
    public Boolean isVisibile() {

        return visibility;
    }

    /**
     * Setter
     * @param visibility la visibilité du capteur
     */
    public void setVisibility(Boolean visibility) {
        this.visibility = visibility;
    }

}
