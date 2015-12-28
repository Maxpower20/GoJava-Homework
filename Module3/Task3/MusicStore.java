import Module3.Task1.Task1.Task3.Guitar;
import Module3.Task1.Task1.Task3.Instrument;
import Module3.Task1.Task1.Task3.Piano;
import Module3.Task1.Task1.Task3.Trumpet;

import java.util.ArrayList;

/**
 * Created by Максим on 28.12.2015.
 */
public class MusicStore {
    public static void main(String[] args) {
        ArrayList<Instrument> filesList = new ArrayList<Instrument>();

        filesList.add(new Piano());
        filesList.add(new Guitar());
        filesList.add(new Trumpet());
    }
}
