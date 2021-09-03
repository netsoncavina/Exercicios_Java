// Desenvolva um algoritmo que receba o valor de um produto, calcule e mostre o valor desse produto após um desconto de 15%.

package Lista2.Exercicio22;
import java.util.Scanner; // Importa a classe Scanner necessária para inputs do usuario

public class Main {
    public static void main(String[] args) {        
        // Entrada de dados
        Scanner inputValorProduto = new Scanner(System.in); // Cria um objeto Scanner para inputs do usuario
        System.out.println("Digite o preço do produto ");
        Float valorProduto = inputValorProduto.nextFloat(); 

        // Processamento de dados
        Produto produto = new Produto(valorProduto); // Cria um objeto Produto com o valor do produto
        
        // Saída de dados
        System.out.println("O valor do produto com desconto de 15% é: R$" + produto.calcularValorComDesconto());



        // Fecha Scanner
        inputValorProduto.close();
    }
}
