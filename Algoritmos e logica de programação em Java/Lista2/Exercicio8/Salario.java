package Lista2.Exercicio8;

public class Salario {
    // Declaração das variaveis da classe junto com os modificadores
    private float valorSalarioBruto;

    // Metodo construtor
    public Salario(){};

    // Metodo construtor com argumentos 
    public Salario(float valorSalarioBruto){
        this.valorSalarioBruto = valorSalarioBruto;
    }

    // Metodo set para atribuir valor a variavel
    public void setValorSalarioBruto(float valorSalarioBruto){
        this.valorSalarioBruto = valorSalarioBruto;
    }

    // Metodo get para retornar valor da variavel
    public float getValorSalarioBruto(){
        return this.valorSalarioBruto;
    }

    // Metodo para calcular o novo salario
    public float calcularNovoSalario(){
        this.valorSalarioBruto *= 1.1 ; // Aumento bonificação
        this.valorSalarioBruto -= (this.valorSalarioBruto*0.2);  // Redução impostos 
        return this.valorSalarioBruto; // Retorna o novo valor do salario
    }

}
