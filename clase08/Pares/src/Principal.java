import java.util.ArrayList;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {

        Par<Integer> pe = new Par<>(345, 234);
        Par<String> ps1 = new Par<>("Perez", "Juan");
        Par<String> ps2 = new Par<>("Perez", "Jorge");
        Par<String> ps3 = new Par<>("Romo", "Ana");

        System.out.println(ps1);
        System.out.println(ps2);
        System.out.println(ps3);

        ArrayList<Par<String>> nombres = new ArrayList<>();
        nombres.add(ps1);
        nombres.add(ps2);
        nombres.add(ps3);

        Collections.sort(nombres);
        System.out.println(nombres);
    }
}
