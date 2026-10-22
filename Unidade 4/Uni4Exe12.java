import java.util.Scanner;

public class Uni4Exe12 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int lado1, lado2, lado3;

        System.out.println("Digite o tamanho do lado 1");
        lado1 = tec.nextInt();
        System.out.println("Digite o tamanho do lado 2");
        lado2 = tec.nextInt();
        System.out.println("Digite o tamanho do lado 3");
        lado3 = tec.nextInt();

        if ((lado1 + lado2) > lado3 && (lado1 + lado3) > lado2 && (lado2 + lado3) > lado1) {
            if (lado1 == lado2 && lado2 == lado3 && lado1 == lado3) {
                System.out.println("O triângulo é equilátero");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("O triânulo é isósceles");
            } else {
                System.out.println("O triângulo é escaleno");
            }
        } else {
            System.out.println("Não é um triângulo");
        }

    }

}
