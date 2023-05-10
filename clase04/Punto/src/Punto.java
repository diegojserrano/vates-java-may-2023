public class Punto {

    private double x;
    private double y;

    public Punto() {
        x = y = 0;
    }
    
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Punto (" + x + "," + y + ")";
    }

    public void setY(double y) {
        this.y = y;
    }

    // Dos métodos con el mismo nombre pero distintos parámetros se llama SOBRECARGA

    public double distancia() {
        return Math.sqrt(x*x + y*y);
    }

    public double distancia(Punto otro) {
        double dx = this.x - otro.getX();
        double dy = this.y - otro.getY();

        return Math.sqrt(dx*dx + dy*dy);
    }

    public int cuadrante() {
        int cuad = 0;

        if (x != 0 && y != 0) {
            if (x > 0) {
                if (y > 0)  cuad = 1;
                else        cuad = 4;
            } else {
                if (y > 0)  cuad = 2;
                else        cuad = 3;
            }
        } else if (x != 0)  cuad = -2;
        else if (y != 0)    cuad = -1;


        return cuad;
    }

}
