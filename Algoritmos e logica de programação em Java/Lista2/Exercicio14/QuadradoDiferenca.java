package Lista2.Exercicio14;

public class QuadradoDiferenca {
    private int numero1, numero2;

    // Metodo construtor
    public QuadradoDiferenca() {}

    public QuadradoDiferenca(int numero1, int numero2) {
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

    // Metodo para calcular o quadrado da diferenca
    public int calcularQuadradoDiferenca() {
        return ((numero1 * numero1) - (2*numero1*numero2) + (numero2 * numero2));
    }
}
