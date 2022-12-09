package arrays;

import java.util.ArrayList;

public class Ort {
    public String name;

    public ArrayList<Ort> orte = new ArrayList<Ort>();

    public Ort(String name) {
        this.name = name;
    }

    public void addNachbar(Ort o) {
        orte.add(o);
    }

    public boolean hasCircle(Ort o) {
        for (Ort nachbar : orte) {
            if (nachbar != o) {
                    hasCircle(nachbar);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
    public boolean countHops(Ort o, Ort d) {
        int count = 0;
        for (Ort nachbar : orte) {
            if (nachbar != o) {
                hasCircle(nachbar);
                count++;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }


}
