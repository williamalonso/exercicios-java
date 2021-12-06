import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine(); //nextLine() lê String
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat(); //nextFloat lê float
        System.out.format("A nota de %s é %.1f \n", nome, nota);
    }
}
