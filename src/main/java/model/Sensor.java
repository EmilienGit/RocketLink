package model;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import org.jfree.data.general.DefaultPieDataset;

public abstract class Sensor {
    Boolean visibility = false;

    public Sensor() {
        setVisibility(true);
    }


    public Boolean isVisibile() {

        return visibility;
    }

    public void setVisibility(Boolean visibility) {
        this.visibility = visibility;
    }

}
