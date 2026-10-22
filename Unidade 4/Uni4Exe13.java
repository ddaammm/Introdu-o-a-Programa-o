import java.util.Scanner;

public class Uni4Exe13 {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        int n1, n2, n3, total ;

        System.out.println("Primeira carta");
        n1 = tec.nextInt();
        System.out.println("Segunda carta");
        n2 = tec.nextInt();
        System.out.println("Terceira carta");
        n3 = tec.nextInt();

        total = 0;

        if (n1 == 1 || n1 == 2 || n1 == 3) {
            total = total + 1;
            
        }
         if (n2 == 1 || n2 == 2 || n2 == 3) {
            total = total + 1;
            
        }
         if (n3 == 1 || n3 == 2 ||n3 == 3) {
            total = total + 1;
            
        }

        if (total == 1) {
            System.out.println("TRUCO");
            
        } else if (total == 2) {
            System.out.println("SEIS");
            
        } else if (total == 3) {
            System.out.println("NOVE");
            
        }

}
}
