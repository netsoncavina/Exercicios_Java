// Desenvolva um algoritmo que receba a base e a altura de um retângulo, calcule e
// mostre a área desse retângulo. Fórmula da área de um retângulo: A = base * altura.


package Lista2.Exercicio2;
import java.util.Scanner; // Importa a classe Scanner necessária para inputs do usuario

public class Main {
    public static void main(String[] args){
        // Entrada de dados
        Scanner inputBase = new Scanner(System.in);
        System.out.println("Digite o valor da base do retângulo");
        float valorBase = inputBase.nextFloat(); // Atribui o valor do input do usuario à variavel da base
        

        Scanner inputAltura = new Scanner(System.in);
        System.out.println("Digite o valor da altura do retângulo");
        float valorAltura = inputAltura.nextFloat(); // Atribui o valor do input do usuario à variavel da altura
        

        
        // Criação de uma instância do retangulo utilizando o construtor vazio e os setters
        Retangulo retangulo1 = new Retangulo();
        retangulo1.setBase(valorBase);
        retangulo1.setAltura(valorAltura);
        
        // Criação de uma instância do retangulo utilizando o construtor completo
        // Retangulo retangulo2 = new Retangulo(valorBase, valorAltura);

        // Calculo da area
        System.out.println("O valor da area do retangulo é " + retangulo1.calculoArea());

        inputBase.close(); // Fechando o scanner para evitar erros
        inputAltura.close();

    }
    
    
}
