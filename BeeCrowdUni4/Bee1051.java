import java.util.Scanner;

public class Bee1051 {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        
        double imposto = 0;
        double salario = tec.nextDouble();

        if (salario >= 0 && salario <= 2000) {
            imposto = 0;
            System.out.println("Isento");

        } else if (salario > 2000 && salario <= 3000) {
            imposto = (salario - 2000) * 0.08;
            System.out.printf("R$ %.2f%n" , imposto);
            
        } else if (salario > 3000 && salario <= 4500) {
             imposto = (1000 * 0.08) + (salario - 3000) * 0.18;
            System.out.printf("R$ %.2f%n" , imposto);
            
        } else if (salario > 4500) {
             imposto = (1000 * 0.08) + (1500 * 0.18) + (salario - 4500) * 0.28;
            System.out.printf("R$ %.2f%n" , imposto);
            
        }

    }

}
