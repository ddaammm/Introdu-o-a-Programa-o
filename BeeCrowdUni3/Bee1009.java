
import java.util.Scanner;
public class Bee1009 {
 
    public static void main(String[] args) {
 
       Scanner tec = new Scanner(System.in);

        String nome;
        double salario_fixo, vendas_mes;

        nome = tec.next();
        salario_fixo = tec.nextDouble();
        vendas_mes = tec.nextDouble();

        double TOTAL = salario_fixo + (vendas_mes * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n", TOTAL);
 
    }
 
}
    


