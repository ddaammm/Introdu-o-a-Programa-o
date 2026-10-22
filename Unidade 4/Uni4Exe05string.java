import java.util.Scanner;
public class Uni4Exe05string {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        System.out.println("A cor é azul? Sim/Não");
        String resposta = tec.next();

        //testar resposta
        if (resposta.equalsIgnoreCase("Sim")) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
    }

}
