package assingmentDS.person;

import assingmentDS.Log;

/***
 * Created by pv42 on 24.04.2017.
 */
public class Besucher extends Person {

    public Besucher(String name) {
        super(name);
        Log.write("Besucher " + name + " erstellt");
    }

    @Override
    public String toString() {
        return "Besucher{" +
                "name='" + getName() + '\'' +
                ", enclosure=" + getEnclosure().getName() +
                '}';
    }
}