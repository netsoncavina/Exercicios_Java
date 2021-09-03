// Desenvolva um algoritmo que receba o salário de um funcionário, calcule e mostre seu
// novo salário com reajuste de 15%.

package Lista2.Exercicio1;

import java.util.Scanner; // Importa a classe Scanner necessária para inputs do usuario

public class Main {
    public static void main(String[] args) {
        Salario salario = new Salario(); // Cria uma instância da classe Salario
        
        Scanner inputUsuario = new Scanner(System.in); // Cria um objeto Scanner para inputs do usuario
        System.out.println("Digite o valor do salario ");
        float valorSalario = Float.parseFloat(inputUsuario.nextLine()); // Guarda o valor do input do usuario e converte para float
        salario.setValorSalario(valorSalario); // Seta o valor do salário no objeto salário
        salario.calcularNovoSalario(); // Calcula o salário com reajuste
        
        System.out.println(salario.getValorSalario());

        inputUsuario.close(); // Fechando o scanner para evitar erros
    }
}
