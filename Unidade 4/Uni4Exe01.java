import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) {
        
        // declarar as variáveis:
        // horas_trabalhadas - total de horas trabalhadas no mês
        // valor_hora      - valor pago por hora
        // horas_extras    - horas acima de 160 (somente usadas se houver)
        // salario         - valor final a receber
        float horas_trabalhadas, valor_hora, horas_extras, salario;

        // definir o teclado para leitura de entrada do usuário
        Scanner tec = new Scanner(System.in);

        // pedir e ler a quantidade de horas trabalhadas
        System.out.println("Quantas horas você trabalhou?");
        horas_trabalhadas = tec.nextFloat();

        // pedir e ler o valor pago por hora
        System.out.println("Qual o valor pago por hora de trabalho?");
        valor_hora = tec.nextFloat();

        // se trabalhou até 160 horas, paga-se todas as horas ao valor normal
        if (horas_trabalhadas <= 160) {
            salario = horas_trabalhadas * valor_hora;
        }
        // se passou de 160 horas, calcular horas extras com adicional de 50%
        else {
            // calcular somente o excedente
            horas_extras = horas_trabalhadas - 160;

            // CORREÇÃO: pagar 160h ao valor normal e só aplicar o adicional sobre as horas excedentes
            // evita dupla contagem das horas extras
            salario = 160 * valor_hora + horas_extras * valor_hora * 1.5f;
        }

        // escrever o resultado formatado na tela
        System.out.println("Você irá receber de salário R$" + salario);

    
    }

}


    


