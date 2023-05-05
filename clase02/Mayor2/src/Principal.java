import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese dos números: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Operador ternario
        // condicion? valor si verdadero : valor si falso
        int mayor = (a > b)? a : b;
        System.out.println("El mayor es: " + mayor);
        System.out.println("Y es el " + ((a > b)? "primero" : "segundo") + " que se ingresó");
    }
}
