package com.mycompany.jogodadosengsoft;

public class Jogo {
    // Atributo que guarda a instancia do jogador
    private Jogador jogador;
    
    // Atributo que guarda as instancias dos dados utilizados no jogo
    private Dado[] dados;
    
    //Atributo que guarda a soma das duas faces obtidas
    private int somaFaces;
    
    // Metodo construtor da classe jogo, que inicializa o atributo dados com um array de duas posicoes
    public Jogo(){
        dados = new Dado[2];
    }
    
    // Metodo que instancia dois dados e os lança, e depois atribui a soma das faces dos dados ao atributo somaFace
    public void jogar(){
        
        // Instancia o primeiro dado
        Dado dado1 = new Dado();
        
        // Lanca o primeiro dado
        dado1.lancar();
        
        // Armazena o primeiro dado na primeira posicao do atributo dados
        dados[0] = dado1;
        
        // Instancia o segundo dado
        Dado dado2 = new Dado();
        
        // Lanca o segundo dado
        dado2.lancar();
        
        // Armazena o segundo dado na segunda posicao do atributo dados
        dados[1] = dado2;
        
        // Atribui ao atributo somaFaces a soma das duas faces dos dados lancados
        this.somaFaces = dado1.getFace() + dado2.getFace();
        
    }
    
    // Retorna o resultado do jogo em uma string
    public String obterResultado(){
        // Se o resultado for igual a 7, retorna que o jogador ganhou
        if(this.somaFaces == 7){
            return "Resultado: você ganhou";
        }else{
            // se for diferente de 7, retorna que o jogador perdeu
            return "Resultado: você perdeu";
        }
    }
    // Retorna o atributo somaFaces
    public int getSomaFaces(){
        return this.somaFaces;
    }
    
    // Retorna o atributo dados
    public Dado[] getDados(){
        return this.dados;
    }

    /**
     * Retorna a instancia do jogador
     */
    public Jogador getJogador() {
        return jogador;
    }

    /**
     * Armazena no atributo jogador uma nova instancia de jogador
     */
    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
    
    
}
