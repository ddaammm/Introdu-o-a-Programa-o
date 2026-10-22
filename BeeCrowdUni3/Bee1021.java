import java.util.Scanner;
public class Bee1021 {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        double valor;
        int notas100, notas50, notas20, notas10, notas5, notas2, moedas1, moedas050, moedas025, moedas010, moedas005, moedas001;
        valor = tec.nextDouble();

        notas100 = (int) (valor / 100);
        notas50 = (int) ((valor % 100) / 50);
        notas20 = (int) ((valor % 100 % 50) / 20);
        notas10 = (int) ((valor % 100 % 50 % 20) / 10);
        notas5 = (int) ((valor % 100 % 50 % 20 % 10) / 5);
        notas2 = (int) ((valor % 100 % 50 % 20 % 10 % 5) / 2);
        moedas1 = (int) ((valor % 100 % 50 % 20 % 10 % 5 % 2) / 1);
        moedas050 = (int) ((valor % 100 % 50 % 20 % 10 % 5 % 2 % 1) / 0.50);
        moedas025 = (int) ((valor % 100 % 50 % 20 % 10 % 5 % 2 % 1 % 0.50) / 0.25);
        moedas010 = (int) ((valor % 100 % 50 % 20 % 10 % 5 % 2 % 1 % 0.50 % 0.25) / 0.10);
        moedas005 = (int) ((valor % 100 % 50 % 20 % 10 % 5 % 2 % 1 % 0.50 % 0.25 % 0.10) / 0.05);
        moedas001 = (int) ((valor % 100 % 50 % 20 % 10 % 5 % 2 % 1 % 0.50 % 0.25 % 0.10 % 0.05) / 0.01);

        System.out.println("NOTAS:");
        System.out.println(notas100 + " nota(s) de R$ 100.00");
        System.out.println(notas50 + " nota(s) de R$ 50.00");
        System.out.println(notas20 + " nota(s) de R$ 20.00");
        System.out.println(notas10 + " nota(s) de R$ 10.00");
        System.out.println(notas5 + " nota(s) de R$ 5.00");
        System.out.println(notas2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moedas1 + " moeda(s) de R$ 1.00");
        System.out.println(moedas050 + " moeda(s) de R$ 0.50");
        System.out.println(moedas025 + " moeda(s) de R$ 0.25");
        System.out.println(moedas010 + " moeda(s) de R$ 0.10");
        System.out.println(moedas005 + " moeda(s) de R$ 0.05");
        System.out.println(moedas001 + " moeda(s) de R$ 0.01");

    }

}
