package Lista2.Exercicio3;

public class Temperatura {
    private float temperatura;

    // Metodo construtor vazio
    public Temperatura(){}

    // Metodo construtor completo
    public Temperatura(float valorTemperatura){
        this.temperatura = valorTemperatura;
    }

    // Setters
    public void setTemperatura(float valorTemperatura){
        this.temperatura = valorTemperatura;
    }

    // Getters
    public float getTemperatura(){
        return this.temperatura;
    }

    // Conversão de temperatura
    // F = (9.C + 160) / 5.
    public float converteCelsiusFahrenheit(){
        return ((9*this.temperatura + 160) / 5);
    }
}
