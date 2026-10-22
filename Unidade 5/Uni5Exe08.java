import java.util.Scanner;
public class Uni5Exe08 {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe a qtdade de números:");
        int n = tec.nextInt();
        int menor = Integer.MAX_VALUE;
        int media;
        int soma = 0;
        int contP = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número:");
            int numero = tec.nextInt();

            if (numero < menor && numero < 0) {
                menor = numero;
                
            }
            
            if (numero > 0) {
                contP++;
                soma += numero;
                
                
            }

        } 
        media = soma / contP;
        System.out.println("O menor negativo é: " + menor);
        System.out.println("A média dos postivos é: " + media);
        

    }

}
