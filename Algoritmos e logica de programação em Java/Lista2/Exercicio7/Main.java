// Desenvolva um algoritmo que receba os valores do comprimento (C), da largura (L) e da
// altura (H) de um paralelepípedo, calcule e mostre o volume desse paralelepípedo. Fórmula do
// volume de um paralelepípedo: V = C . L . H.

package Lista2.Exercicio7;
import java.util.Scanner; // Importa a classe Scanner necessária para inputs do usuario

public class Main {
    public static void main(String[] args){
        // Entrada de dados
        Scanner inputAltura = new Scanner(System.in);
        System.out.println("Digite o valor da altura do paralelepipedo");
        float valorAltura = inputAltura.nextFloat(); // Atribui o valor do input do usuario à variavel altura

        Scanner inputLargura = new Scanner(System.in);
        System.out.println("Digite o valor da largura do paralelepipedo");
        float valorLargura = inputLargura.nextFloat(); // Atribui o valor do input do usuario à variavel largura

        Scanner inputComprimento = new Scanner(System.in);
        System.out.println("Digite o valor do comprimento do paralelepipedo ");
        float valorComprimento = inputComprimento.nextFloat(); // Atribui o valor do input do usuario à variavel comprimento

        // Criação de uma instancia da classe
        Paralelepipedo paralelepipedo = new Paralelepipedo(valorAltura,valorLargura,valorComprimento);

        // Resultado
        System.out.println("O volume do paralelepipedo de lados "+valorAltura+" "+valorLargura+" e "+valorComprimento+" é "+paralelepipedo.calculaVolume());
    
        // Fechando os inputs para evitar erros
        inputAltura.close();
        inputLargura.close();
        inputComprimento.close();
    }
    
}
