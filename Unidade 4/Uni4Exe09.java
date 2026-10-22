import java.util.Scanner;
public class Uni4Exe09 {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        int X;
        int Y;

        System.out.println("Digite o valor de X");
        X = tec.nextInt();
        System.out.println("Digite o valor de Y");
        Y = tec.nextInt();

        if (X % Y == 0 || Y % X == 0) {
            System.out.println("É múltiplo");

            
        } else {
            System.out.println("Não é múltiplo");
        } 
    }

}
