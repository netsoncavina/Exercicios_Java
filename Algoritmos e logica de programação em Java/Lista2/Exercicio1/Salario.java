package Lista2.Exercicio1;

public class Salario {
    // Declaração das variaveis da classe junto com os modificadores
    private float valorSalario;

    // Metodo construtor
    public Salario(){};

    // Metodo construtor com argumentos 
    public Salario(float valorSalario){
        this.valorSalario = valorSalario;
    }

    // Metodo set para atribuir valor a variavel
    public void setValorSalario(float valorSalario){
        this.valorSalario = valorSalario;
    }

    // Metodo get para retornar valor da variavel
    public float getValorSalario(){
        return this.valorSalario;
    }

    // Metodo para calcular o novo salario
    public float calcularNovoSalario(){
        this.valorSalario *= 1.15f; // Multiplica o valor atual do salário por 1.15 (f no final por ser float)
        return this.valorSalario; // Retorna o novo valor do salario
    }

}
