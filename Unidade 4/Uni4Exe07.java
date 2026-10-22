import java.util.Scanner;
public class Uni4Exe07 {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        
        int peso;
        double aPagar;

        System.out.println("Digite o peso da carta");
        peso = tec.nextInt();

        if (peso <= 50) {
            aPagar = 0.45;
        } else {
            //verificar quantas vezes a carta excedeu
            aPagar = 0.45 + (peso - 50) / 20 * 0.45;
            //verificar se tem resto de excedente
            if ((peso-50) % 20 > 0) {
                aPagar = aPagar + 0.45;
                
            }
        
        }
        System.out.printf("Valor a pagar = %5.2f\n", aPagar);
        

    }

}
