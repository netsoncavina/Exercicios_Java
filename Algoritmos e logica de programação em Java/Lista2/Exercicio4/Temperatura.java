package Lista2.Exercicio4;

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
    // C = K – 273.
    public float converteKelvinCelsius(){
        return this.temperatura - 273;
    }
}
