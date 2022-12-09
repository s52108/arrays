package arrays;

public class DemoOrte {
    public static void main(String[] args) {
        Ort graz = new Ort("graz");
        Ort wien = new Ort("wien");
        Ort marburg = new Ort("marburg");
        Ort linz = new Ort("linz");

        graz.addNachbar(marburg);
        graz.addNachbar(wien);
        wien.addNachbar(linz);
        linz.addNachbar(graz);
        marburg.addNachbar(graz);
        wien.addNachbar(graz);
        linz.addNachbar(wien);


        System.out.println(graz.hasCircle(graz));
        System.out.println(graz.countHops(graz,wien));

    }
}
