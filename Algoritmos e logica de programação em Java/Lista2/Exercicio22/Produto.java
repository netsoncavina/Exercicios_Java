package Lista2.Exercicio22;

public class Produto {
    // Atributos
    private float valor, desconto;

    // Construtor
    public Produto(){}
    public Produto(float valor){
        this.valor = valor;
        this.desconto = 15;
    }
    
    // Construtor para casos em que o valor de desconto seja diferente de 15% 
    public Produto(float valor, float desconto){
        this.valor = valor;
        this.desconto = desconto;
    }

    // Setters
    public void setValor(float valor){
        this.valor = valor;
    }
    public void setDesconto(float desconto){
        this.desconto = desconto;
    }

    // Getters
    public float getValor(){
        return this.valor;
    }
    public float getDesconto(){
        return this.desconto;
    }

    // Métodos
    public float calcularValorComDesconto(){
        return valor - (valor * this.desconto / 100);
    }

}
