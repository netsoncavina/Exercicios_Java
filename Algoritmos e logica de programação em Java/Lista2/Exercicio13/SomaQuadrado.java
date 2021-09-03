package Lista2.Exercicio13;

public class SomaQuadrado {
    private int numero1, numero2;

    // Método construtor
    public SomaQuadrado() {}

    public SomaQuadrado(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Setters
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    // Getters
    public int getNumero1() {
        return numero1;
    }
    public int getNumero2() {
        return numero2;
    }

    // Método para calcular a soma dos quadrados dos números
    public int calculaSomaQuadrado() {
        System.out.println(numero1 * numero1);
        System.out.println(numero2 * numero2);
        return ((numero1 * numero1) + (numero2 * numero2));
    }

}
