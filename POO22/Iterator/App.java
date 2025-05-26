package POO22.Iterator;

import java.util.*;

public class App {

    public static void main(String[] args) {
        Set<String> carros = new LinkedHashSet<>();

        carros.add("HRV");
        carros.add("Polo");
        carros.add("Golf");
        carros.add("City");
        carros.add("Cruze");
        carros.add("Argo");
        carros.add("Ka");
        carros.add("City");

        System.out.println(carros);

        Iterator<String> it = carros.iterator();

        while (it.hasNext()) {
            String a = it.next();
            if (a.equals("Polo")) {
                it.remove();
            }
        }

        System.out.println(carros);
    }
}
