package p1;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Juan Carlos
 */
public class Circulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double r, area, circunferencia;
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca el radio: ");
        r = leer.nextDouble();

        circunferencia = circunferencia(r);
        area = area(r);
        System.out.println("Circulo con radio " + r + ",");
        System.out.println(" la circunferencia es " + circunferencia);
        System.out.println(" y el area es " + area + ".");
        leer.close();
    }

    public static double circunferencia(double r) {
        if (r > 0) {
            return 2 * Math.PI * r;
        } else {
            return -1.0;
        }
    }

    public static double area(double r) {
        if (r > 0) {
            return Math.PI * Math.pow(r, 2);
        } else {
            return -1.0;
        }
    }
}
