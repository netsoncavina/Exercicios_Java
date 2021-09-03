// Desenvolva um algoritmo que receba os coeficientes a, b e c de uma equação de segundo
// grau (ax2 + bx + c), calcule e mostre as raízes reais dessa equação, considerando uma
// equação que possui duas raízes reais.


package Lista2.Exercicio6;
import java.util.Scanner; // Importa a classe Scanner necessária para inputs do usuario

public class Main {
    public static void main(String[] args){
        // Entrada de dados
        Scanner inputA = new Scanner(System.in);
        System.out.println("Digite o valor de a ");
        float valorA = inputA.nextFloat(); // Atribui o valor do input do usuario à variavel a

        Scanner inputB = new Scanner(System.in);
        System.out.println("Digite o valor de b ");
        float valorB = inputB.nextFloat(); // Atribui o valor do input do usuario à variavel b

        Scanner inputC = new Scanner(System.in);
        System.out.println("Digite o valor de c ");
        float valorC = inputC.nextFloat(); // Atribui o valor do input do usuario à variavel c

        // Criação de uma instância da classe
        Bhaskara equacao = new Bhaskara(valorA, valorB, valorC);
        
        // Resultado
        System.out.println("As raizes da equação são "+equacao.calculaRaizes()[0]+" e "+equacao.calculaRaizes()[1]);

        // Fechando scanners para evitar erros
        inputA.close();
        inputB.close();
        inputC.close();
    }
}
