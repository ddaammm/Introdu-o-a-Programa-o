import java.util.Scanner;
public class Uni2Exe02 {
    public static void main(String[] args) {
        
        //declarar as variáveis
        int A, B, total;
        
        //definir o teclado
        Scanner tec = new Scanner(System.in);

        //entrada dos dados
        System.out.println("Digite o primeiro número");
        A = tec.nextInt();
        System.out.println("Digite o segundo número");
        B = tec.nextInt();

        //realizar a multiplicação
        total = A * B;

        //escrever o resultado
        System.out.println("O total da multiplicação entre esses dois números é " + total);

    

    }

}
