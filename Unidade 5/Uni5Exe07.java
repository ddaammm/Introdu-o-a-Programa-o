import java.util.Scanner;
public class Uni5Exe07 {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        //inicializar o maior valor possivel
        float maior = Float.MIN_VALUE;
        //inicializar o menor valor possivel
        float menor = Float.MAX_VALUE;

        //ler a qtdade de valores
        System.out.println("Digite a qtdade de números:");
        int n = tec.nextInt();

        //para numeros faça
        for (int i = 1; i <= n; i++) {
            
            System.out.println("Digite um número decimal");
            //ler o numero 
            float numero = tec.nextFloat();

            //testar se o numero é maior
            if (numero > maior) {
                maior = numero;
                
            }

            //testar se é o menor
            if (numero < menor) {
                menor = numero;
                
            }
        }

        //escrever o resultado
        System.out.println("Maior = " + maior);
        System.out.println("Menor = " + menor);
    }

}
