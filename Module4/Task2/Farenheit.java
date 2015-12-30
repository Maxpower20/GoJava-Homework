package Module4.Task1.Task2;

/**
 * Created by Максим on 30.12.2015.
 */
public class Farenheit {
    private double farenheitTemperature;


    Farenheit(double farenheitTemperature) {
        this.farenheitTemperature = farenheitTemperature;
    }

    public double getFarenheitTemperature() {
        return farenheitTemperature;
    }

    public double converFarenheitToCelcius(){
        return (getFarenheitTemperature() - 32) * 5/9;
    }
}
