import java.util.Scanner;
public class Uni2Exe10 {
    public static void main(String[] args) {
        //declaração de variáveis
        int duracao, horas, minutos, segundos;

        //definir o teclado
        Scanner tec = new Scanner(System.in);

        //ler a duração
        System.out.println("Digite a duração (em segundos):");
        duracao = tec.nextInt();

        //calcular as horas, minutos e segundos
        horas = duracao / 3600;
        minutos = (duracao % 3600) / 60;
        segundos = duracao % 60;

        //exibir o resultado
        System.out.println("Duração: " + horas + ":" + minutos + ":" + segundos);

    }
}
        
        
    
