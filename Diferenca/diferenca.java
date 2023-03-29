/*
    Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

    Entrada
    O arquivo de entrada contém 4 valores inteiros.

    Saída
    Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.
*/

import java.util.Scanner;

public class diferenca {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        int A = entrada.nextInt();
        System.out.println("Digite o valor de B: ");
        int B = entrada.nextInt();
        System.out.println("Digite o valor de C: ");
        int C = entrada.nextInt();
        System.out.println("Digite o valor de D: ");
        int D = entrada.nextInt();
        int diferenca = ( (A * B) - (C * D) );
        System.out.println("DIFERENCA = " + diferenca);
        entrada.close();
    }
}