import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese las coordenadas del punto");
        int x = sc.nextInt();
        int y = sc.nextInt();

        Punto a = new Punto(x,y);
        
        int cuadrante = a.cuadrante();

        switch (cuadrante) {
            case 0: System.out.println("El punto está en el origen"); break;
            case -1: System.out.println("El punto está en el eje de las ordenadas"); break;
            case -2: System.out.println("El punto está en el eje de las abcisas"); break;
            default: System.out.println("El punto está en el cuadrante " + cuadrante);
        }



        Punto b = new Punto(10,10);
        System.out.println(cuadrante);
        System.out.println(b);
        System.out.println("Su distancia al origen es: " + a.distancia());
        System.out.println("Su distancia al punto " + b + " es: " + a.distancia(b));


    }
}
