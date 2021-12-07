import java.util.Scanner; // para ler dado de entrada
import java.time.*; // para usar LocalDate

public class CalcularIdade {

    public static void main(String args[]) {

    	int idade, ler;
    	Scanner ano = new Scanner(System.in); // variável p/ ler dado de entrada

        System.out.println("Digite seu ano de nascimento: ");
        ler = ano.nextInt(); // recebe o dado de entrada

        LocalDate dataSistema = LocalDate.now(); // pega a data
        idade = dataSistema.getYear() - ler;

		System.out.printf("A idade é: " + idade );


    }
}
