package data;

import view.ui.PanelRocket;

/**
 * @author Quentin
 */
public class LoadData {

    private static String tempMotor;

    private static String magnetic;

    private static String pressure;

    private static String altimeter;

    private static String accelerometer;

    private static String tempOgive;


    /**
     * Constructor
     */
    public LoadData() {
        super();
    }

    /**
     * Update
     *
     * @param name : name of the field
     * @param oldData : old value show on the field
     */
    public static void update(String name, String oldData) {
        PanelRocket.update(name, oldData);
    }

    /**
     * Gets pressure.
     *
     * @return Value of pressure.
     */
    public static String getPressure() {
        return pressure + " Pa";
    }

    /**
     * Gets accelerometer.
     *
     * @return Value of accelerometer.
     */
    public static String getAccelerometer() {
        return accelerometer + " m.s-2";
    }

    /**
     * Gets tempMotor.
     *
     * @return Value of tempMotor.
     */
    public static String getTempMotor() {
        return tempMotor + " °c";
    }

    /**
     * Sets new accelerometer.
     *
     * @param accelerometer2 New value of accelerometer.
     */
    public static void setAccelerometer(String accelerometer2) {
        accelerometer = accelerometer2;
    }

    /**
     * Sets new magnetic.
     *
     * @param magnetic2 New value of magnetic.
     */
    public static void setMagnetic(String magnetic2) {
        magnetic = magnetic2;
    }

    /**
     * Sets new tempOgive.
     *
     * @param tempOgive2 New value of tempOgive.
     */
    public static void setTempOgive(String tempOgive2) {
        tempOgive = tempOgive2;
    }

    /**
     * Gets magnetic.
     *
     * @return Value of magnetic.
     */
    public static String getMagnetic() {
        return magnetic;
    }

    /**
     * Sets new altimeter.
     *
     * @param altimeter2 New value of altimeter.
     */
    public static void setAltimeter(String altimeter2) {
        altimeter = altimeter2;
    }

    /**
     * Gets altimeter.
     *
     * @return Value of altimeter.
     */
    public static String getAltimeter() {
        return altimeter + " m";
    }

    /**
     * Sets new pressure.
     *
     * @param pressure2 New value of pressure.
     */
    public static void setPressure(String pressure2) {
        pressure = pressure2;
    }

    /**
     * Sets new tempMotor.
     *
     * @param tempMotor2 New value of tempMotor.
     */
    public static void setTempMotor(String tempMotor2) {
        tempMotor = tempMotor2;
    }

    /**
     * Gets tempOgive.
     *
     * @return Value of tempOgive.
     */
    public static String getTempOgive() {
        return tempOgive + " °c";
    }
}
