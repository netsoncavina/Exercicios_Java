package Lista2.Exercicio5;

public class TrocaValores {
    private float x,y,aux;

    // A variavel aux será utilizada para armazenar o valor de uma das variaveis durante a troca


    // Metodo construtor vazio
    public TrocaValores(){}

    // Metodo construtor completo
    public TrocaValores(float x, float y){
        this.x = x;
        this.y = y;
    }


    // Setters
    public void setX(float x){
        this.x = x;
    }

    public void setY(float y){
        this.y = y;
    }

    // Getters
    public float getX(){
        return x;
    }

    public float getY(){
        return y;
    }

    // Metodo para trocar os valores
    public void trocaValores(){
        this.aux = this.x;
        this.x = this.y;
        this.y = this.aux;
    }

    // Metodo para verificar os valores
    public void mostraValores(){
        System.out.print("O valor de x é " + this.x + "\nO valor de Y é " + this.y);
    }
}
