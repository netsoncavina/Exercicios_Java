// Desenvolva um algoritmo que receba dois valores numérico real, calcule e mostre a
// diferença do cubo desses dois números.

package Lista2.Exercicio17;
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

        // Processamento de dados
        DiferencaCubo diferencaCubo = new DiferencaCubo(); // Cria um objeto do tipo DiferencaCubo
        diferencaCubo.setNumero1(valorNumero1); // Seta o valor do primeiro numero
        diferencaCubo.setNumero2(valorNumero2); // Seta o valor do segundo numero

        // Saída de dados
        System.out.println("A diferença do cubo dos dois números é: " + diferencaCubo.calcularDiferencaCubos());

        // Fecha o Scanner
        inputNumero1.close();
        inputNumero2.close();
    
    }
}
