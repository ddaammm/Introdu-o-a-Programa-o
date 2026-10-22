import java.util.Scanner;
public class Bee1010 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int codigo_peca1 = tec.nextInt();
        int numero_peca1 = tec.nextInt();
        float valor_peca1 = tec.nextFloat();

        int codigo_peca2 = tec.nextInt();
        int numero_peca2 = tec.nextInt();
        float valor_peca2 = tec.nextFloat();

        float valor_a_pagar = (valor_peca1 * numero_peca1 + valor_peca2 * numero_peca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valor_a_pagar);
        
    }

}
