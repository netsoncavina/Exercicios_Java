package Lista2.Exercicio19_20;

public class Circunferencia {
    // Atributos
    private final double PI = 3.14159; // Final para não ser alterado 
    private double raio;

    // Construtor
    public Circunferencia(){}
    public Circunferencia(double raio){
        this.raio = raio;
    }

    // Setters
    public void setRaio(double raio){
        this.raio = raio;
    }

    // Getters
    public double getRaio(){
        return this.raio;
    }

    // Métodos
    public double calcularArea(){
        return PI * Math.pow(this.raio, 2);
    }

    public double calcularComprimento(){
        return 2 * PI * this.raio;
    }
}
