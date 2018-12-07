package data;

import view.ui.PanelRocket;

public class LoadData {

    private String tempMotor;
    private String magnetic;
    private String pressure;
    private String altimeter;
    private String accelerometer;
    private String tempOgive;

    public LoadData(){
        super();
        init();
    }

    private void init(){
        this.setAccelerometer("10");
        this.setAltimeter("20");
        this.setMagnetic("30");
        this.setPressure("40");
        this.setTempMotor("50");
        this.setTempOgive("60");
    }

    private void update(){
        PanelRocket.update();
    }

    /**
     * Gets pressure.
     *
     * @return Value of pressure.
     */
    public String getPressure() {
        return pressure + " Pa";
    }

    /**
     * Gets accelerometer.
     *
     * @return Value of accelerometer.
     */
    public String getAccelerometer() {
        return accelerometer + " m.s-2";
    }

    /**
     * Gets tempMotor.
     *
     * @return Value of tempMotor.
     */
    public String getTempMotor() {
        return tempMotor + " °c";
    }

    /**
     * Sets new accelerometer.
     *
     * @param accelerometer New value of accelerometer.
     */
    public void setAccelerometer(String accelerometer) {
        this.accelerometer = accelerometer;
    }

    /**
     * Sets new magnetic.
     *
     * @param magnetic New value of magnetic.
     */
    public void setMagnetic(String magnetic) {
        this.magnetic = magnetic;
    }

    /**
     * Sets new tempOgive.
     *
     * @param tempOgive New value of tempOgive.
     */
    public void setTempOgive(String tempOgive) {
        this.tempOgive = tempOgive;
    }

    /**
     * Gets magnetic.
     *
     * @return Value of magnetic.
     */
    public String getMagnetic() {
        return magnetic;
    }

    /**
     * Sets new altimeter.
     *
     * @param altimeter New value of altimeter.
     */
    public void setAltimeter(String altimeter) {
        this.altimeter = altimeter;
    }

    /**
     * Gets altimeter.
     *
     * @return Value of altimeter.
     */
    public String getAltimeter() {
        return altimeter + " m";
    }

    /**
     * Sets new pressure.
     *
     * @param pressure New value of pressure.
     */
    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    /**
     * Sets new tempMotor.
     *
     * @param tempMotor New value of tempMotor.
     */
    public void setTempMotor(String tempMotor) {
        this.tempMotor = tempMotor;
    }

    /**
     * Gets tempOgive.
     *
     * @return Value of tempOgive.
     */
    public String getTempOgive() {
        return tempOgive + " °c";
    }
}
