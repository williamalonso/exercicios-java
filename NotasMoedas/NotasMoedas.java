/*
  Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

  Entrada
  O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

  Saída
  Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

  Obs: Utilize ponto (.) para separar a parte decimal.
*/

import java.util.Scanner;

public class NotasMoedas {
  public static void main(String args[]) {

    float valor_entrada;

    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Digite o valor de entrada: ");
    valor_entrada = entrada.nextFloat();
    
    valor_entrada = Math.round(valor_entrada * 100); // coloca a entrada em unidades de Centavos

    int notas_100 = (int) (valor_entrada / 10000);
    int novo_valor = (10000 * notas_100);
    int notas_50 = (int) ( ( valor_entrada - novo_valor ) / 5000);
    novo_valor += (5000 * notas_50);
    int notas_20 = (int) ( (valor_entrada - novo_valor) / 2000);
    novo_valor += (2000 * notas_20);
    int notas_10 = (int) ( (valor_entrada - novo_valor) / 1000);
    novo_valor += (1000 * notas_10);
    int notas_5 = (int) ( (valor_entrada - novo_valor) / 500);
    novo_valor += (500 * notas_5);
    int notas_2 = (int) ( (valor_entrada - novo_valor) / 200);
    novo_valor += (200 * notas_2);
    int moeda_1 = (int) ( (valor_entrada - novo_valor) / 100);
    novo_valor += (100 * moeda_1);
    int moeda_05 = (int) ( (valor_entrada - novo_valor) / 50);
    novo_valor += (50 * moeda_05);
    int moeda_25 = (int) ( (valor_entrada - novo_valor) / 25);
    novo_valor += (25 * moeda_25);
    int moeda_10 = (int) ( (valor_entrada - novo_valor) / 10);
    novo_valor += (10 * moeda_10);
    int moeda_005 = (int) ( (valor_entrada - novo_valor) / 5);
    novo_valor += (5 * moeda_005);
    int moeda_001 = (int) ( (valor_entrada - novo_valor) / 1);
    novo_valor += (1 * moeda_001);

    System.out.println("NOTAS:\n");
    System.out.format("%d nota(s) de R$ 100.00\n", notas_100);
    System.out.format("%d nota(s) de R$ 50.00\n", notas_50);
    System.out.format("%d nota(s) de R$ 20.00\n", notas_20);
    System.out.format("%d nota(s) de R$ 10.00\n", notas_10);
    System.out.format("%d nota(s) de R$ 5.00\n", notas_5);
    System.out.format("%d nota(s) de R$ 2.00\n", notas_2);
    System.out.println("MOEDAS:\n");
    System.out.format("%d moeda(s) de R$ 1.00\n", moeda_1);
    System.out.format("%d moeda(s) de R$ 0.50\n", moeda_05);
    System.out.format("%d moeda(s) de R$ 0.25\n", moeda_25);
    System.out.format("%d moeda(s) de R$ 0.10\n", moeda_10);
    System.out.format("%d moeda(s) de R$ 0.05\n", moeda_005);
    System.out.format("%d moeda(s) de R$ 0.01\n", moeda_001);

    entrada.close();
  }
}
