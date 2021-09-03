package Lista2.Exercicio11;

public class Dinheiro {
    float quantidadeDinheiro, cotacaoEuroReal;

    public Dinheiro(){}

    // Este construtor foi criado para não ser necessário informar sempre a cotação do Euro
    public Dinheiro(float quantidadeDinheiro){
        this.quantidadeDinheiro = quantidadeDinheiro;
        this.cotacaoEuroReal = 6.16f;
    }

    // Caso a cotação esteja diferente de 6,16 , o usuário pode informar a cotação
    public Dinheiro(float quantidadeDinheiro, float cotacaoEuroReal){
        this.quantidadeDinheiro = quantidadeDinheiro;
        this.cotacaoEuroReal = cotacaoEuroReal;
    }

    // Setters
    public void setQuantidadeDinheiro(float quantidadeDinheiro){
        this.quantidadeDinheiro = quantidadeDinheiro;
    }
    public void setCotacaoEuroReal(float cotacaoEuroReal){
        this.cotacaoEuroReal = cotacaoEuroReal;
    }

    // Getters
    public float getQuantidadeDinheiro(){
        return quantidadeDinheiro;
    }
    public float getCotacaoEuroReal(){
        return cotacaoEuroReal;
    }

    // Métodos
    public float converterEuroReal(){
        return ( quantidadeDinheiro * cotacaoEuroReal);
    }

}
