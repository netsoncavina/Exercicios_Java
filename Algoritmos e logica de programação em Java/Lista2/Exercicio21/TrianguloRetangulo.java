package Lista2.Exercicio21;

public class TrianguloRetangulo {
    // Atributos
    private int cateto1, cateto2;

    // Construtor
    public TrianguloRetangulo(){}
    public TrianguloRetangulo(int cateto1, int cateto2){
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }

    // Setters
    public void setCateto1(int cateto1){
        this.cateto1 = cateto1;
    }
    public void setCateto2(int cateto2){
        this.cateto2 = cateto2;
    }

    // Getters
    public int getCateto1(){
        return this.cateto1;
    }
    public int getCateto2(){
        return this.cateto2;
    }

    // Métodos
    public double calcularHipotenusa(){
        // H² = C1² + C2²
        // H = sqrt(C1² + C2²)
        double hipotenusa = Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2));
        return hipotenusa;
    }
}
