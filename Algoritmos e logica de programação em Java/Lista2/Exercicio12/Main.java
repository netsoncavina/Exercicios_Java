// Desenvolva um algoritmo que receba um valor numérico real, calcule e mostre o
// quadrado desse número.

package Lista2.Exercicio12;
import java.util.Scanner; // Importa a classe Scanner necessária para inputs do usuario

public class Main {
    public static void main(String[] args) {        
        // Entrada de dados
        Scanner inputNumero = new Scanner(System.in); // Cria um objeto Scanner para inputs do usuario
        System.out.println("Digite o numero que deseja calcular o quadrado ");
        int valorNumero = inputNumero.nextInt();

        Quadrado quadrado = new Quadrado(valorNumero); // Cria um objeto do tipo Quadrado

        // Saida de dados	
        System.out.println("O quadrado do numero " + valorNumero + " é " + quadrado.calcularQuadrado());

        inputNumero.close(); // Fecha o objeto Scanner para evitar erros
    }
}
