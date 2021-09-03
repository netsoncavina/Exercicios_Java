package Lista2.Exercicio11;
import java.util.Scanner; // Importa a classe Scanner necessária para inputs do usuario

public class Main {
    public static void main(String[] args) {        
        // Entrada de dados
        Scanner inputQuantidadeDinheiro = new Scanner(System.in); // Cria um objeto Scanner para inputs do usuario
        System.out.println("Digite a quantidade de dinheiro a ser convertida ");
        float valorQuantidadeDinheiro = inputQuantidadeDinheiro.nextFloat();

        Dinheiro dinheiro = new Dinheiro(valorQuantidadeDinheiro);

        // Saída
        System.out.println("O valor em de "+ valorQuantidadeDinheiro+ " reais em euros é: " + dinheiro.converterEuroReal());


        // Fechando os inputs para evitar erros
        inputQuantidadeDinheiro.close();
    }
}
