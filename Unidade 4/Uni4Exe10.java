import java.util.Scanner;
public class Uni4Exe10 {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        int idadeM;
        int idadeZ;
        int idadeL;

        System.out.println("Digite a idade do Marquinhos");
        idadeM = tec.nextInt();
        System.out.println("Digite a idade do Zezinho");
        idadeZ = tec.nextInt();
        System.out.println("Digite a idade da Luluzinha");
        idadeL = tec.nextInt();
        
        if (idadeM < idadeZ && idadeM < idadeL) {
            System.out.println("Marquinhos é o caçula");

        } else if (idadeZ < idadeM && idadeZ < idadeL) {
            System.out.println("Zezinho é o caçula");
            
        }else if (idadeL < idadeM && idadeL < idadeZ) {
            System.out.println("Luluzinha é a caçula");
            
        } else {
            System.out.println("As idades são iguais");
            
        }
    }
}
