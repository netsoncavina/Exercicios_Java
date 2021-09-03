package Lista2.Exercicio10;

public class Dinheiro {
    float quantidadeDinheiro, cotacaoDolarReal;

    public Dinheiro(){}

    // Este construtor foi criado para não ser necessário informar sempre a cotação do dolar
    public Dinheiro(float quantidadeDinheiro){
        this.quantidadeDinheiro = quantidadeDinheiro;
        this.cotacaoDolarReal = 5.18f;
    }

    // Caso a cotação esteja diferente de 5,18 , o usuário pode informar a cotação
    public Dinheiro(float quantidadeDinheiro, float cotacaoDolarReal){
        this.quantidadeDinheiro = quantidadeDinheiro;
        this.cotacaoDolarReal = cotacaoDolarReal;
    }

    // Setters
    public void setQuantidadeDinheiro(float quantidadeDinheiro){
        this.quantidadeDinheiro = quantidadeDinheiro;
    }
    public void setCotacaoDolarReal(float cotacaoDolarReal){
        this.cotacaoDolarReal = cotacaoDolarReal;
    }

    // Getters
    public float getQuantidadeDinheiro(){
        return quantidadeDinheiro;
    }
    public float getCotacaoDolarReal(){
        return cotacaoDolarReal;
    }

    // Métodos
    public float converterDolarReal(){
        return ( quantidadeDinheiro * cotacaoDolarReal);
    }

}
