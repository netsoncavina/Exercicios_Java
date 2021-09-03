// Desenvolva um algoritmo que receba o nome e o sobrenome de uma pessoa e mostre o
// nome inteiro dessa pessoa.

package Lista2.Exercicio15;
import java.util.Scanner; // Importa a classe Scanner necessária para inputs do usuario

public class Main {
    public static void main(String[] args) {        
        // Entrada de dados
        Scanner inputNome = new Scanner(System.in); // Cria um objeto Scanner para inputs do usuario
        System.out.println("Digite o nome ");
        String nome = inputNome.nextLine(); // Recebe o nome e o sobrenome do usuario e armazena em um vetor

        Scanner inputSobrenome = new Scanner(System.in); 
        System.out.println("Digite o sobrenome ");
        String sobrenome = inputSobrenome.nextLine();

        // Processamento de dados
        Pessoa pessoa = new Pessoa(nome, sobrenome); // Cria um objeto Pessoa com os inputs do usuario

        // Saída de dados
        System.out.println(pessoa.concatenaNome()); // Concatena o nome e o sobrenome e mostra na tela

        // Fecha o Scanner
        inputNome.close();
        inputSobrenome.close();
    }
}
