package Lista2.Exercicio16;

public class CuboSoma {
    private int numero1, numero2, numero3;

    // Construtores
    public CuboSoma() {}
    public CuboSoma(int numero1, int numero2, int numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }

    // Setters
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    public void setNumero3(int numero3) {
        this.numero3 = numero3;
    }

    // Getters
    public int getNumero1() {
        return numero1;
    }
    public int getNumero2() {
        return numero2;
    }
    public int getNumero3() {
        return numero3;
    }

    // Métodos
    public int somaCubo() {
        return ((int) Math.pow(numero1,3) + (int) Math.pow(numero2,3) + (int) Math.pow(numero3,3));
    }
}
