package TesteMesa.CalculoMedia;
import java.util.Scanner;

public class CalculoMedia {

    public static double calcularMedia(double p1, double e1, double e2, double api, double sub, double x) {
        // Cálculo da nota base
        double notaBase = (p1 * 0.5) + (e1 * 0.2) + (e2 * 0.3) + x + (sub * 0.15);

        // Se a nota base for maior que 5.9, a média final inclui a nota API
        if (notaBase > 5.9) {
            return (notaBase * 0.5) + (api * 0.5);
        } else {
            // Caso contrário, a média final é apenas a nota base
            return notaBase;
        }
    }
}