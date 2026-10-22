import java.util.Scanner;
public class Uni4Exe24 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int maior, menor, meio;

        System.out.println("Digite o valor 1");
        int a = tec.nextInt();
        System.out.println("Digite o valor 2");
        int b = tec.nextInt();
        System.out.println("Digite o valor 3");
        int c = tec.nextInt();
        System.out.println("Escolha entre as opções 1, 2 ou 3");
        int opcao = tec.nextInt();

        if (a > b && a > c) {
            maior = a;

        } else {
            if (b > c) {
                maior = b;

            } else {
                maior = c;
            }
        }

        if (a < b && a < c) {
            menor = a;

        } else {
            if (b < c) {
                menor = b;

            } else {
                menor = c;
            }
        }
        meio = a + b + c - maior - menor;
        System.out.println("A ordem é: " + maior + " " + meio + " " + menor);

    }

}
