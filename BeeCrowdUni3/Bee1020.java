import java.util.Scanner;
public class Bee1020 {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        int idade_dias;
        idade_dias = tec.nextInt();

        int anos = idade_dias / 365;
        int meses = (idade_dias % 365) / 30;
        int dias = (idade_dias % 365 % 30);

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
    }

}
