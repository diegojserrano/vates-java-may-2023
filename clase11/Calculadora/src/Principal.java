import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x;


        // operaciones es un vector de funciones
        ArrayList<DoubleBinaryOperator> operaciones = new ArrayList<>();
        operaciones.add(null);
        operaciones.add((op1, op2) -> op1 + op2);
        operaciones.add((op1, op2) -> op1 - op2);
        operaciones.add((op1, op2) -> op1 * op2);
        operaciones.add((op1, op2) -> op1 / op2);
        operaciones.add((base, exp) -> Math.pow(base, exp));

        System.out.println("Ingrese dos números: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Ingrese la operación: ");
        System.out.println("1- Sumar");
        System.out.println("2- Restar");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");
        System.out.println("5- Potencia");

        System.out.println("0- Salir");

        int op = sc.nextInt();
        while (op != 0) {
            double resultado = operaciones.get(op).applyAsDouble(a, b);
            System.out.println(resultado);
            op = sc.nextInt();
        }

    }


}
