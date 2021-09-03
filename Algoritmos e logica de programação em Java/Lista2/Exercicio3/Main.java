// Desenvolva um algoritmo que receba uma temperatura em graus Celsius (C), calcule e
// mostre a temperatura convertida para graus Fahrenheit (F).
// Fórmula de conversão: F = (9.C + 160) / 5.


package Lista2.Exercicio3;
import java.util.Scanner; // Importa a classe Scanner necessária para inputs do usuario

public class Main {
    public static void main(String[] args){
        Scanner inputTemperatura = new Scanner(System.in);
        System.out.println("Digite a temperatura a ser convertida ");
        float valorTemperatura = inputTemperatura.nextFloat(); // Atribui o valor do input do usuario à variavel da temperatura

        // Criação de uma instância da temperatura utilizando o construtor vazio e os setters
        Temperatura temperatura1 = new Temperatura();
        temperatura1.setTemperatura(valorTemperatura);

        // Criação de uma instância da temperatura utilizando o construtor completo
        // Temperatura temperatura2 = new Temperatura(valorTemperatura);

        // Conversão do valor da temperatura
        System.out.println("A temperatura " + valorTemperatura + "ºC em Farenheit é " + temperatura1.converteCelsiusFahrenheit());

        inputTemperatura.close();
    }

}
