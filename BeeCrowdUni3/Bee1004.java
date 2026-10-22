import java.util.Scanner;
public class Bee1004 {

    public static void main(String[] args) {

    //definir o teclado
    Scanner tec = new Scanner(System.in);

    //entrada de dados
    int A, B, PROD;
    
    System.out.println("Digite o valor de A");
    A = tec.nextInt();
    System.out.println("Digite o valor de B");
    B = tec.nextInt();

    PROD = A * B;

    System.out.println("PROD = " + PROD);

    }
}
