/*
  Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

  Entrada
  Leia três valores de ponto flutuante (double) A, B e C.

  Saída
  Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem.
 */

 import java.util.Scanner;

 public class Bhaskara {

  public static void main(String args[]) {
    Scanner entrada = new Scanner(System.in);
    float A, B, C, X1, X2, Raiz;
  
    System.out.println("Digite o valor A: ");
    A = entrada.nextFloat();

    System.out.println("Digite o valor B: ");
    B = entrada.nextFloat();

    System.out.println("Digite o valor C: ");
    C = entrada.nextFloat();

    if(A == 0.0) {
      System.out.println("Impossivel calcular");
      entrada.close();
      return;
    }

    Raiz = (float)((B*B) - (4*A*C));

    if(Raiz < 0) {
      System.out.println("Impossivel calcular");
      entrada.close();
      return;
    } else {
      X1 = ( ( (-B) + (float)(Math.sqrt( Raiz )) ) / (2*A) );
      X2 = ( ( (-B) - (float)(Math.sqrt( Raiz )) ) / (2*A) );

      System.out.format("R1 = %.5f\n", X1);
      System.out.format("R2 = %.5f\n", X2);
    }


    entrada.close();
  }
 }