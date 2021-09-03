// Desenvolva um algoritmo que receba o nome, a idade e o sexo de uma pessoa e
// mostre essas informações na tela.

package Lista2.Exercicio18;
import java.util.Scanner; // Importa a classe Scanner necessária para inputs do usuario

public class Main {
    public static void main(String[] args) {        
        // Entrada de dados
        Scanner inputNome = new Scanner(System.in); // Cria um objeto Scanner para inputs do usuario
        System.out.println("Digite o primeiro nome ");
        String valorNome = inputNome.nextLine();

        Scanner inputIdade = new Scanner(System.in); 
        System.out.println("Digite a idade ");
        int valorIdade = inputIdade.nextInt();

        Scanner inputSexo = new Scanner(System.in); 
        System.out.println("Digite o sexo ");
        String valorSexo = inputSexo.nextLine();

        // Processamento de dados
        Pessoa pessoa = new Pessoa(valorNome, valorSexo, valorIdade); // Cria um objeto Pessoa com os dados recebidos

        // Saída de dados
        pessoa.imprimeDados(); // Imprime os dados da pessoa

        // Fecha o Scanner
        inputNome.close();
        inputIdade.close();
        inputSexo.close();

    }
}
