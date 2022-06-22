package ttsw.filo.microservicesspring.bean;

/**
 * Created by T. Filo Zegarlicki on 14.06.2022
 **/


public class LimitConfiguration {

    private int min;
    private int max;

    public LimitConfiguration() {
    }

    public LimitConfiguration(int min, int max) {
        super();
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
