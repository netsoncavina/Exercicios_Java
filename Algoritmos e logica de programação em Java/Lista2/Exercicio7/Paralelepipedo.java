package Lista2.Exercicio7;

public class Paralelepipedo {
    // Declaração de variaveis
    private float altura, largura, comprimento;
    
    // Metodos construtores
    public Paralelepipedo(){}

    public Paralelepipedo(float altura, float largura, float comprimento){
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    // Metodos setters
    public void setAltura(float altura){
        this.altura = altura;
    }
    public void setLargura(float largura){
        this.largura = largura;
    }
    public void setComprimento(float comprimento){
        this.comprimento = comprimento;
    }

    // Metodos getters
    public float getAltura(){
        return altura;
    }
    public float getLargura(){
        return largura;
    }
    public float getComprimento(){
        return comprimento;
    }

    public float calculaVolume(){
        return altura*comprimento*largura;
    }

}
