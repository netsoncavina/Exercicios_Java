package Lista2.Exercicio18;

public class Pessoa {
    // Atributos
    private String nome, sexo;
    private int idade;

    // Construtores
    public Pessoa(){};
    public Pessoa(String nome, String sexo, int idade){
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    // Setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    // Getters
    public String getNome(){
        return this.nome;
    }
    public String getSexo(){
        return this.sexo;
    }
    public int getIdade(){
        return this.idade;
    }

    // Métodos
    public void imprimeDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Idade: " + this.idade);
    }
}
