public class Jogadores {

    private float peso;
    private float altura;
    private int idade;

    /**
     * New Constructor jogadores
     */
    public Jogadores(){

    }

    /**
     * Novo jogador
     * @param idade
     * @param peso
     * @param altura
     */
    public Jogadores(int idade, float peso, float altura){
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


}//Fim classe Jogadores
