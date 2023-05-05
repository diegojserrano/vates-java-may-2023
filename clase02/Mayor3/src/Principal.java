import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese tres números:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int mayor;

        if (a > b && a > c) mayor = a;
        else if (b > c)     mayor = b;
        else                mayor = c;

        System.out.println("El mayor es: " + mayor);

        int mayor2;
        if (a > b) mayor2 = a;
        else       mayor2 = b;

        if (c > mayor2) mayor2 = c;

        System.out.println("El mayor es: " + mayor2);


    }
}
