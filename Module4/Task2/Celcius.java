package Module4.Task1.Task2;


public class Celcius {
    private double celciusTemperature;


    Celcius(double celciusTemperature) {
        this.celciusTemperature = celciusTemperature;
    }

    public double getCelciusTemperature() {

        return celciusTemperature;
    }

    public double converCelciusToFarenheit() {
        return this.getCelciusTemperature() * 9/5 + 32;
    }
}

