// Desenvolva um algoritmo que receba o salário bruto de um funcionário, calcule e mostre
// o salário líquido desse funcionário, sabendo que ele recebe 10% de gratificação calculados
// sobre o salário bruto, mas paga 20% de imposto de renda também calculados sobre o
// salário bruto.

package Lista2.Exercicio8;

import java.util.Scanner; // Importa a classe Scanner necessária para inputs do usuario

public class Main {
    public static void main(String[] args) {
        Salario salario = new Salario(); // Cria uma instância da classe Salario
        
        Scanner inputUsuario = new Scanner(System.in); // Cria um objeto Scanner para inputs do usuario
        System.out.println("Digite o valor do salario ");
        float valorSalarioBruto = inputUsuario.nextFloat();
        salario.setValorSalarioBruto(valorSalarioBruto); // Seta o valor do salário no objeto salário
        salario.calcularNovoSalario(); // Calcula o salário com reajuste
        
        System.out.println(salario.getValorSalarioBruto());

        inputUsuario.close(); // Fechando o scanner para evitar erros
    }
}
