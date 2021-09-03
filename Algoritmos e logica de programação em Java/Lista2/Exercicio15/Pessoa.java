package Lista2.Exercicio15;

public class Pessoa {
    private String nome;
    private String sobrenome;

    // Construtores
    public Pessoa(){}
    public Pessoa(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    // Getters
    public String getNome() {
        return nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }

   public String concatenaNome(){
        return "Nome completo:  " + nome + " " + sobrenome;
   }


}
