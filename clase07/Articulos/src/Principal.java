import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {

        Articulo[] precios = {
                new Articulo(12, "Lapiz", 100),
                new Articulo(56, "Goma", 40),
                new Articulo(18, "Cuaderno", 400),
                new Articulo(22, "Lapicera", 140)};

        Arrays.sort(precios);
        for (Articulo a : precios)
            System.out.println(a);
    }
}
