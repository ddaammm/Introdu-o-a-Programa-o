import java.util.Scanner;
public class Uni2Exe01 {
    public static void main(String[] args) {

        //declarar as variáveis
        int valorA, valorB, total;

        //definir o teclado
        Scanner tec = new Scanner (System.in);

        //entrada dos dados
        System.out.println("Digite o primeiro número inteiro" );
        valorA = tec.nextInt();
        System.out.println("Digite o segundo número inteiro");
        valorB = tec.nextInt();

        //calcular a soma
        total = valorA + valorB;

        //escrever o resultado
        System.out.println("A soma desses dois números inteiros é igual a " + total);

        


    }

}
