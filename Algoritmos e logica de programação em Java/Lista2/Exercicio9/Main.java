// Desenvolva um algoritmo que receba o valor de um depósito em poupança, calcule e mostre
// o valor após um mês de aplicação na poupança, sabendo que a poupança rende 5% ao mês.


package Lista2.Exercicio9;
import java.util.Scanner; // Importa a classe Scanner necessária para inputs do usuario

public class Main {
    public static void main(String[] args) {        
        // Entrada de dados
        Scanner inputDeposito = new Scanner(System.in); // Cria um objeto Scanner para inputs do usuario
        System.out.println("Digite o valor do deposito ");
        float valorDeposito = inputDeposito.nextFloat();

        Scanner inputRenda = new Scanner(System.in); // Cria um objeto Scanner para inputs do usuario
        System.out.println("Digite o valor da renda ");
        float valorRenda = inputRenda.nextFloat();

        Scanner inputQuantidadeMeses = new Scanner(System.in); // Cria um objeto Scanner para inputs do usuario
        System.out.println("Digite a quantidade de meses ");
        int valorQuantidadeMeses = inputQuantidadeMeses.nextInt();

        // Cria uma instância da classe Poupança
        Poupanca poupanca = new Poupanca(valorDeposito, valorRenda, valorQuantidadeMeses); 


        // Saída
        System.out.println("Um deposito de "+valorDeposito+" rendendo "+(valorRenda*100)+"% ao mês, por "+valorQuantidadeMeses+" se torna "+ poupanca.calcularRendimento());

        // Fechando os inputs para evitar erros 
        inputDeposito.close();
        inputQuantidadeMeses.close();
        inputRenda.close();
    }
}
