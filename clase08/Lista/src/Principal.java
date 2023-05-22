import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Parametrizada<Integer> a = new Parametrizada<>(34);
        Parametrizada<String> b = new Parametrizada<>("dfasdf");
        Parametrizada<Articulo> c = new Parametrizada<>(new Articulo(1234,"Plancha", 7000));

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }

}
