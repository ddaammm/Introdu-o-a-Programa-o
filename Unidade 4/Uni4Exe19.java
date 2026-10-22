import java.util.Scanner;

public class Uni4Exe19 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int X, Y;
        System.out.println("Informe a cordenada do eixo X");
        X = tec.nextInt();
        System.out.println("Informe a cordenada do eixo Y");
        Y = tec.nextInt();

        if (X == 0 && Y == 00) {
            System.out.println("Está no quadrante 0");

        } else if (X > 0 && Y > 0) {
            System.out.println("Está no quadrante 1");

        } else if (X < 0 && Y > 0) {
            System.out.println("Está no quadrante 2");

        } else if (X < 0 && Y < 0) {
            System.out.println("Está no quadrante 3");

        } else if (X > 0 && Y < 0) {
            System.out.println("Está no quadrante 4");

        } else if (X == 0 && Y > 0 || Y < 0) {
            System.out.println("Quadrante indefinido");

        } else if (X > 0 || X < 0 && Y == 0) {
            System.out.println("Quadrante indefinido");

        }
    }

}
