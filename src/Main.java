
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Double base, altura, area, perimetro, diagonal;

        System.out.print("Digite a base do retangulo: ");
        base = sc.nextDouble();
        System.out.print("Digite a altura: ");
        altura = sc.nextDouble();

        area = (base * altura) ; // Formula para calcular a área
        perimetro = 2 * base + 2 * altura; // ou 2 * (base + altura);
        diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0)); // Formula para Calcular a Diagonal

        System.out.println("Area: " + String.format("%.4f", area));
        System.out.println("Perimetro: " + String.format("%.4f", perimetro));
        System.out.println("Diagonal: " + String.format("%.4f", diagonal));
        sc.close();






    }
}