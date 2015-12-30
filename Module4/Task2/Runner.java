package Module4.Task1.Task2;

/**
 * Created by Максим on 30.12.2015.
 */
public class Runner {
    public static void main(String[] args) {
        Celcius celciusTemperature = new Celcius(15.5);
        Farenheit farenheitTemperature = new Farenheit(150);

        System.out.println(celciusTemperature.getCelciusTemperature() + " degrees in Celcius will be " + celciusTemperature.converCelciusToFarenheit() + " degrees in Farenheit");

        System.out.println(farenheitTemperature.getFarenheitTemperature() + " degrees in Farenheit will be " + farenheitTemperature.converFarenheitToCelcius() + " degrees in Celcius");
    }


}
