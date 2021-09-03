// Desenvolva um algoritmo que receba os valores dos catetos (C1, C2) de um
// triângulo retângulo, calcule e mostre o valor da hipotenusa (H) desse triângulo. Fórmula
// do cálculo da hipotenusa de um triângulo retângulo. H² = C1² + C2²

package Lista2.Exercicio21;
import java.util.Scanner; // Importa a classe Scanner necessária para inputs do usuario

public class Main {
    public static void main(String[] args) {        
        // Entrada de dados
        Scanner inputCateto1 = new Scanner(System.in); // Cria um objeto Scanner para inputs do usuario
        System.out.println("Digite o valor do primeiro cateto ");
        int valorCateto1 = inputCateto1.nextInt(); 

        Scanner inputCateto2 = new Scanner(System.in); // Cria um objeto Scanner para inputs do usuario
        System.out.println("Digite o valor do segundo cateto ");
        int valorCateto2 = inputCateto2.nextInt(); 

        // Processamento
        TrianguloRetangulo triangulo = new TrianguloRetangulo(valorCateto1, valorCateto2); // Cria um objeto do tipo TrianguloRetangulo
        
        // Saída de dados
        System.out.println("Em um triangulo de catetos "+ valorCateto1 +" e "+ valorCateto2 +", o valor da hipotenusa é " + triangulo.calcularHipotenusa()); // Imprime o valor da hipotenusa 
    
        // Fecha o Scanner
        inputCateto1.close();
        inputCateto2.close();
    }
}
