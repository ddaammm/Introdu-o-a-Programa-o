import java.util.Scanner;

public class Uni4Exe26pratica {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);


        System.out.println("Qual área você deseja calcular? (T, Q, R ou C)");
        char opcao = tec.next().charAt(0);

        switch (opcao) {
            case 'T':
                System.out.println("Qual o tamanho da base?");
                int b = tec.nextInt();
                System.out.println("Qual o tamanho da altura?");
                int h = tec.nextInt();

                int area = (b * h) / 2;
                System.out.println("A área do triângulo é igual a " + area);
                
                break;

            case 'Q': 
                System.out.println("Qual o tamanho do lado?");
                int l = tec.nextInt();

                area = l * l;
                System.out.println("A área do quadrado é igual a " + area);

                break;

            case 'R':
                System.out.println("Qual o tamanho da base?");
                b = tec.nextInt();
                System.out.println("Qual o tamanho da altura?");
                h = tec.nextInt();

                area = b * h;
                System.out.println("A área do retângulo é igual a " + area);

                break;

            case 'C':
                System.out.println("Qual o tamanho do raio?");
                int r = tec.nextInt();
                double pi = 3.14;

                double areac = r * r * pi;
                System.out.println("A área do círculo é igual a " + areac);

                break;
        
            default:
                System.out.println("Opção inválida");

                break;
        }
    }

}
