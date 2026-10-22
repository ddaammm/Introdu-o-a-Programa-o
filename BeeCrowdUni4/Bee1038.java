import java.util.Scanner;

public class Bee1038 {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        int codigo, quantidade;
        double total, preco;

        codigo = tec.nextInt();
        quantidade = tec.nextInt();

        if (codigo == 1) {
            preco = 4.00;
            
        } else if (codigo == 2) {
            preco = 4.50;
            
        } else if (codigo == 3) {
            preco = 5.00;
            
        } else if (codigo == 4) {
            preco = 2.00;
            
        } else {
            preco = 1.50;
        }

        total = preco * quantidade;

        System.out.printf("Total: R$ %.2f%n", total);

    }

}