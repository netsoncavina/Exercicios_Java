package Lista2.Exercicio6;
import java.lang.Math; // Necessário para facilitar as operações matematicas (quadrado e raiz) 


public class Bhaskara {
    private double a,b,c,delta;
    double[] raizes = new double[2]; // Vetor para armazenar valores das raizes

    // Metodo construtor vazio
    public Bhaskara(){}

    // Metodo construtor completo
    public Bhaskara(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Setters
    public void setA(double a){
        this.a = a;
    }
    public void setB(double b){
        this.b = b;
    }
    public void setC(double c){
        this.c = c;
    }

    // Getters
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }

    // Metodo para calcular as raizes
    public double[] calculaRaizes(){
        delta = (Math.pow(this.b, 2) - (4*this.a*this.c));
        raizes[0] = ((-b + (Math.sqrt(delta))) / (2*a));
        raizes[1] = ((-b - (Math.sqrt(delta))) / (2*a));
        return raizes;
    }

}
