/*
    Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
    Entrada
    O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).
    Saída
    Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 1 dígito após o ponto decimal e com um espaço em branco antes e depois da igualdade. Assim como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
*/

import java.util.Scanner;

public class media2 {
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in); // variável para ler entrada de dados

        System.out.println("Digite a primeira nota: ");
        float nota_A = entrada.nextFloat(); // nextFloat() lê uma entrada do tipo Float

        System.out.println("Digite a segunda nota: ");
        float nota_B = entrada.nextFloat();

        System.out.println("Digite a terceira nota: ");
        float nota_C = entrada.nextFloat();

        double media = ( (nota_A*2) + (nota_B*3) + (nota_C*5) ) / 10;

        System.out.format("MEDIA = %.1f\n", media);

        entrada.close();
    }
}