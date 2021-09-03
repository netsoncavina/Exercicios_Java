// Desenvolva um algoritmo que receba dois valores inteiros para as variáveis x e y,
// efetue a troca dos valores, ou seja, x passa a ter o valor de y e y passa a ter o valor de
// x e mostre os valores trocados.

package Lista2.Exercicio5;
import java.util.Scanner; // Importa a classe Scanner necessária para inputs do usuario

public class Main {
    public static void main(String[] args){
        Scanner inputX = new Scanner(System.in);
        System.out.println("Digite o valor de X ");
        float valorX = inputX.nextFloat(); // Atribui o valor do input do usuario à variavel X

        Scanner inputY = new Scanner(System.in);
        System.out.println("Digite o valor de Y ");
        float valorY = inputY.nextFloat(); // Atribui o valor do input do usuario à variavel Y

        // Criação de uma instância da classe utilizando o construtor vazio
        TrocaValores valores1 = new TrocaValores();
        valores1.setX(valorX);
        valores1.setY(valorY);

        // Criação de uma instância da classe utilizando o construtor completo
        // TrocaValores valores2 = new TrocaValores(valorX, valorY);

        // Troca de valores
        System.out.println("Antes: ");
        valores1.mostraValores();

        valores1.trocaValores();
        System.out.println("\nDepois: ");
        valores1.mostraValores();

        inputX.close(); // Fechando o scanner para evitar erros
        inputY.close();



    }
}
