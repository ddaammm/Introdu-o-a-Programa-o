import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        char letra = 'A';

        int opcao, n1, n2;
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Soma de dois números");
        System.out.println("2 - Diferença entre dois números");
        System.out.println("3 - Produto entre dois números");
        System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero)");
        opcao = tec.nextInt();

        switch (opcao) {
            case 1: 
                System.out.println("Digite o primeiro número:");
                n1 = tec.nextInt();
                System.out.println("Digite o segundo número:");
                n2 = tec.nextInt();
                
                int soma = n1 + n2;

                System.out.println("A soma é: " + soma);
                
                break;

            case 2:
                System.out.println("Digite o primeiro número:");
                n1 = tec.nextInt();
                System.out.println("Digite o segundo número:");
                n2 = tec.nextInt();

                int diferenca = n1 - n2;

                System.out.println("A diferença é: " + diferenca);

                break;
        
            case 3:
                System.out.println("Digite o primeiro número:");
                n1 = tec.nextInt();
                System.out.println("Digite o segundo número:");
                n2 = tec.nextInt();

                int produto = n1 * n2;

                System.out.println("O produto é: " + produto);

                break;

            case 4:
                System.out.println("Digite o primeiro número:");
                n1 = tec.nextInt();
                System.out.println("Digite o segundo número:");
                n2 = tec.nextInt();

                if (n2 == 0) {
                    System.out.println("Não será possível realizar a divisão.");

                } else {
                    int divisao = n1 / n2;
                    System.out.println("A divisão é: " + divisao);

                }

                break;

            default:
                System.out.println("Opção inválida.");

                break;
        }
    }

}
