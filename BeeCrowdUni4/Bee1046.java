import java.util.Scanner;

public class Bee1046 {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        int inicio, fim, duracao;
        inicio = tec.nextInt();
        fim = tec.nextInt();

        if (inicio == fim) {
            duracao = 24;
            
        } else if (fim > inicio) {
            duracao = fim - inicio;
            
        } else {
            duracao = 24 - (inicio - fim);
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        
    }

}
