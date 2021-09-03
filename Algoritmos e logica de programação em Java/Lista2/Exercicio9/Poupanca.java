package Lista2.Exercicio9;

public class Poupanca {
    private float deposito, renda;
    private int  quantidadeMeses;
    
    public Poupanca(){};

    public Poupanca(float deposito, float renda, int quantidadeMeses){
        this.deposito = deposito;
        this.renda = renda;
        this.quantidadeMeses = quantidadeMeses;
    }

    // Setters
    public void setDeposito(float deposito){
        this.deposito = deposito;
    }
    public void setRenda(float renda){
        this.renda = renda;
    }
    public void setQuantidadeMeses(int quantidadeMeses){
        this.quantidadeMeses = quantidadeMeses;
    }

    // Getters
    public float getDeposito(){
        return this.deposito;
    }
    public float getRenda(){
        return this.renda;
    }
    public int getQuantidadeMeses(){
        return this.quantidadeMeses;
    }

    public double calcularRendimento(){
        double rendimento = this.deposito * this.quantidadeMeses * this.quantidadeMeses;
        System.out.println(rendimento);
        return rendimento;
    }


}
