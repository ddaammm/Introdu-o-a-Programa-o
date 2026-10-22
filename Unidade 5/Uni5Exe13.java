import java.util.Scanner;

public class Uni5Exe13 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.println("Número total de reabastecimentos:");
        int n = tec.nextInt();

        double somaKm = 0;
        double somaLitros = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Parada " + i + ": Quilometragem:");
            double km = tec.nextDouble();
            System.out.println("Parada " + i + ": Combustível (litros):");
            double litros = tec.nextDouble();

            double kmPorLitro = km / litros;
            System.out.printf("Parada " + i + ": " + kmPorLitro + "km por litro");

            somaKm += km;
            somaLitros += litros;
        }

        double media = somaKm / somaLitros;
        System.out.printf("Quilometragem média obtida por litro: %.2f%n", media);

    }

}