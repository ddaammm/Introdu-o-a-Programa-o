import java.util.Scanner;

public class Uni4ExeIdade {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int idade;
        
        System.out.println("Qual a sua idade?");
        idade = tec.nextInt();

        if (idade <= 2) {
            System.out.println("Você é um bebê e um jovem");

        } else if (idade >= 3 && idade <= 12) {
            System.out.println("Você é uma criança e um jovem.");    
            
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Você é um adolescente e um jovem.");   
            
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("Você é um adulto.");   
            
        } else if (idade >= 60 && idade <= 122  ) {
            System.out.println("Você é um idoso.");   
            
        } else {
            System.out.println("Você não existe ou está morto...");
        }
            
        
        
    }

}
