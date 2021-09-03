package Lista2.Exercicio12;

public class Quadrado {
    private int numero;

    public Quadrado() {}

    public Quadrado(int numero) {
        this.numero = numero;
    }

    // Setters
    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Getters
    public int getNumero() {
        return numero;
    }

    // Calculo do quadrado
    public int calcularQuadrado() {
        return numero * numero;
    }
}
