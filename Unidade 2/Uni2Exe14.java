import java.util.Scanner;
public class Uni2Exe14 {
    public static void main(String[] args) {
        
        //declarar as variáveis
        int nota100, nota50, nota20, nota10, nota5, nota2, nota1;

        //definir o teclado
        Scanner tec = new Scanner(System.in);

        //qtdade de notas mínimas
        System.out.println("Digite o valor em reais");
        int valor = tec.nextInt();

        nota100 = valor / 100;
        nota50 = (valor % 100) /50;
        nota20 = (valor % 100 % 50) / 20;
        nota10 = (valor % 100 % 50 % 20) / 10;
        nota5 = (valor % 100 % 50 % 20 % 10) / 5;
        nota2 = (valor % 100 % 50 % 20 % 10 % 5) / 2;
        nota1 = (valor % 100 % 50 % 20 % 10 % 5 % 2) / 1;

        //escrever o resultado
        System.out.println("notas de R$ 100: " + nota100);
        System.out.println("notas de R$ 50: " + nota50);
        System.out.println("notas de R$ 20: " + nota20);
        System.out.println("notas de R$ 10: " + nota10);
        System.out.println("notas de R$ 5: " + nota5);
        System.out.println("notas de R$ 2: " + nota2);
        System.out.println("notas de R$ 1: " + nota1);

    }
}

