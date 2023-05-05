import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("numeros.txt"));

        sc.useDelimiter(";");

        System.out.println("Ingrese dos números:");
        int num1 = sc.nextInt();  // Ctrl+D: duplica la linea actual o las seleccionadas
        int num2 = sc.nextInt();

        int suma = num1 + num2;
        int diferencia = num1 - num2;
        int producto = num1 * num2;
        double cociente = (double)num1 / num2;

        System.out.println("Entre " + num1 + " y " + num2);
        System.out.println("La suma es: " + suma);
        System.out.println("La diferencia es: " + diferencia);
        System.out.println("El producto es: " + producto);
        System.out.println("El cociente es: " + cociente);
    }


}
