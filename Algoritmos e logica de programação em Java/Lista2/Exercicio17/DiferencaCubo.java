package Lista2.Exercicio17;

public class DiferencaCubo {
    // Declaração de variáveis
    private double numero1, numero2;

    // Metodo construtor
    public DiferencaCubo(){}
    public DiferencaCubo(double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Setters
    public void setNumero1(double numero1){
        this.numero1 = numero1;
    }
    public void setNumero2(double numero2){
        this.numero2 = numero2;
    }

    // Getters
    public double getNumero1(){
        return this.numero1;
    }
    public double getNumero2(){
        return this.numero2;
    }

    // Metodo para calcular a diferença entre dois cubos
    public double calcularDiferencaCubos(){
        double diferenca = Math.pow(this.numero1, 3) - Math.pow(this.numero2, 3);
        // Condicional para retornar sempre um valor positivo
        if(diferenca < 0){
            return diferenca * -1;
        }
        else{
            return diferenca;
        }
    }
}
