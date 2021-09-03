package Lista2.Exercicio2;

public class Retangulo {
    // Declaração das variaveis da classe
    private float base, altura;
    
    // Metodo construtor vazio
    public Retangulo(){}

    // Metodo construtor completo
    public Retangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    // Setters
    public void setBase(float base){
        this.base = base;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    public void setMedidas(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    // Getters
    public float getBase(){
        return this.base;
    }
    public float getAltura(){
        return this.altura;
    }

    // Função/Metodo que calcula a area
    public float calculoArea(){
        return (this.base*this.altura);
    }

}
