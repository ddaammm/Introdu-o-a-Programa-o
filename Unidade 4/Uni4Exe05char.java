import java.util.Scanner;
public class Uni4Exe05char {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        System.out.println("A cor é azul? S/N");
        char resposta = tec.next().charAt(0); //ler um caracter

        //testar a respota - como a variável resposta é lógica
        //não precisa de comparação
        if (resposta == 'S') {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
    }

}
