import java.util.Scanner;

public class Uni4Exe26 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        float b, h, l, r, pi, area;
        char T, Q, R, C;

        System.out.println("Digite uma opção (T, Q, R ou C)");
        char opcao = tec.next().charAt(0);

        switch (opcao) {
            case 'T':
                System.out.println("Digite o valor da base");
                b = tec.nextFloat();
                System.out.println("Digite o valor da altura");
                h = tec.nextFloat();
                area = (b * h) / 2;
                System.out.println(area);

                break;

            case 'Q':
                System.out.println("Digite o valor do lado");
                l = tec.nextFloat();
                area = l * l;
                System.out.println(area);

                break;

            case 'R':
                System.out.println("Digite o valor da base");
                b = tec.nextFloat();
                System.out.println("Digite o valor da altura");
                h = tec.nextFloat();
                area = b * h;
                System.out.println(area);

                break;

            case 'C':
                System.out.println("Digite o valor do raio");
                r = tec.nextFloat();
                pi = 3.14f;
                area = pi * r * r;
                System.out.println(area);

                break;

            default:
                System.out.println("Opção inválida");

                break;
        }

    }

}
