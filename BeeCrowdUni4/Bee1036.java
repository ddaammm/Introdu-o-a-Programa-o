import java.util.Scanner;

public class Bee1036 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        double A, B, C, delta, R1, R2;
        A = tec.nextDouble();
        B = tec.nextDouble();
        C = tec.nextDouble();

        delta = B * B - 4 * A * C;

        if (delta < 0 || A == 0) {
            System.out.println("Impossivel calcular");

        } else {
            R1 = (-B + Math.sqrt(delta)) / (2 * A);
            R2 = (-B - Math.sqrt(delta)) / (2 * A);
            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
        }

    }

}
