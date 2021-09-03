// Desenvolva um algoritmo que receba dois valores numérico inteiro, calcule e mostre a soma
// do quadrado desses dois números.

package Lista2.Exercicio13;
import java.util.Scanner; // Importa a classe Scanner necessária para inputs do usuario

public class Main {
    public static void main(String[] args) {        
        // Entrada de dados
        Scanner inputNumero1 = new Scanner(System.in); // Cria um objeto Scanner para inputs do usuario
        System.out.println("Digite o primeiro numero ");
        int valorNumero1 = inputNumero1.nextInt();

        Scanner inputNumero2 = new Scanner(System.in); 
        System.out.println("Digite o segundo numero ");
        int valorNumero2 = inputNumero2.nextInt();

        SomaQuadrado somaQuadrado = new SomaQuadrado(valorNumero1, valorNumero2); // Cria um objeto do tipo Quadrado

        // Saida de dados	
        System.out.println("A soma dos quadrados dos numeros " + valorNumero1 + " e "+ valorNumero2 + " é " + somaQuadrado.calculaSomaQuadrado());

        inputNumero1.close(); // Fecha o objeto Scanner para evitar erros
        inputNumero2.close();
    }
}
