import java.util.Scanner;
public class Uni2Exe04 {
    
    public static void main(String[] args) {
        System.out.println(" MEU PRIMEIRO PROGRAMA EM JAVA");

        //declarar as variáveis
        float A;
        float B;
        float media;

        //criar uma variável para o teclado
        Scanner tec = new Scanner (System.in);

        //entrada dos dados
        System.out.println("Digite a sua primeira nota");
        A = tec.nextFloat();
        System.out.println("Digite a sua segunda nota");
        B = tec.nextFloat();

        //calcular a media - f indica que é float
        media = (A * 3.5f + B * 7.5f) / 11;

        //escrever a media
        System.out.println("media = " + media);  




    

    }
}

