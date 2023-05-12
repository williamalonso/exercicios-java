/*
  Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.

  Entrada
  O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão (double) com duas casas decimais, representando o salário fixo do vendedor e montante total das vendas efetuadas por este vendedor, respectivamente.

  Saída
  Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.

*/

import java.util.Scanner;

public class salario_bonus {
  public static void main(String args[]) {

    String nome;
    float salario, total_vendas, comissao, total;

    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o nome: ");
    nome = entrada.nextLine();

    System.out.println("Digite o salario: ");
    salario = entrada.nextFloat();

    System.out.println("Digite o total de vendas: ");
    total_vendas = entrada.nextFloat();

    comissao = (float) (( 15.00 / 100.00 ) * total_vendas);
    total = (comissao + salario);

    System.out.format("TOTAL DE %s = R$ %.2f\n", nome, total);

    entrada.close();

  }
}