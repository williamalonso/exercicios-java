/*
    Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

    Entrada
    O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais, representando o número, quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada, respectivamente.

    Saída
    Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um espaço em branco antes e depois da igualdade. No caso do salário, também deve haver um espaço em branco após o $.
  
*/

import java.util.Scanner;

public class salario {
    public static void main(String args[]) {

        float numero_funcionario;
        int horas_trabalhadas;
        float valor_hora;
        float salario;
        Scanner entrada = new Scanner(System.in); // variável para ler entrada de dados
        
        System.out.println("Digite o número do funcionário: ");
        numero_funcionario = entrada.nextFloat(); // nextFloat() lê uma entrada do tipo Float

        System.out.println("Digite as horas trabalhadas: ");
        horas_trabalhadas = entrada.nextInt(); // nextInt() lê uma entrada do tipo Int

        System.out.println("Digite o valor hora: ");
        valor_hora = entrada.nextFloat();

        salario = horas_trabalhadas * valor_hora;

        System.out.format("NUMBER = %.0f\n", numero_funcionario);
        System.out.format("SALARY = U$ %.2f\n", salario);

    }
}