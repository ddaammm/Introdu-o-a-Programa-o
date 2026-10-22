import java.util.Scanner;
public class Uni5Exe06 {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        double soma = 0;

        for(int i = 1; i <= 20; i++) {
            System.out.println("Digite a altura:");
            double altura = tec.nextFloat();

            soma += altura;

        }
        
        double media = soma / 20;
        System.out.printf("A média de altura é %.2f%n", media );
    }

}
