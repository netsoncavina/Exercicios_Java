// Desenvolva um algoritmo que receba três valores numérico inteiro, calcule e mostre o
// cubo da soma desses três números.
package Lista2.Exercicio16;
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
    
        Scanner inputNumero3 = new Scanner(System.in);
        System.out.println("Digite o terceiro numero ");
        int valorNumero3 = inputNumero3.nextInt();

        // Processamento de dados
        CuboSoma cubo = new CuboSoma(valorNumero1,valorNumero2,valorNumero3); // Cria um objeto do tipo CuboSoma

        // Saída de dados
        System.out.println("O cubo da soma dos numeros é: " + cubo.somaCubo());

        // Fechamento de inputs
        inputNumero1.close();
        inputNumero2.close();
        inputNumero3.close();
    }
}
