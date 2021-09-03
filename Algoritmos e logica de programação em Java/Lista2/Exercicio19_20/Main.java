// 19. Desenvolva um algoritmo que receba o raio (R) de uma circunferência, calcule e
// mostre o comprimento dessa circunferência. Fórmula do comprimento da circunferência: C = 2 * pi * R
// Desenvolva um algoritmo que receba o raio (R) de uma circunferência, calcule e mostre
// a área dessa circunferência. Fórmula da área: A = pi * R²

package Lista2.Exercicio19_20;
import java.util.Scanner; // Importa a classe Scanner necessária para inputs do usuario

public class Main {
    public static void main(String[] args) {        
        // Entrada de dados
        Scanner inputRaio = new Scanner(System.in); // Cria um objeto Scanner para inputs do usuario
        System.out.println("Digite o raio da circunferência ");
        Float valorRaio = inputRaio.nextFloat();

        // Processamento de dados
        Circunferencia circunferencia = new Circunferencia(valorRaio); // Cria um objeto Circunferencia com o valor do raio
        double comprimento = circunferencia.calcularComprimento(); // Calcula o comprimento da circunferência
        double area = circunferencia.calcularArea(); // Calcula a área da circunferência

        // Saída de dados
        System.out.println("O comprimento da circunferência é: " + comprimento);
        System.out.println("A área da circunferência é: " + area);

        inputRaio.close(); // Fecha o Scanner

    }
}
