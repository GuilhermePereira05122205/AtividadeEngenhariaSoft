package com.mycompany.jogodadosengsoft;

import java.util.Random;

public class Dado {
    // Atributo que recebe o numero da face do dado
    public int faceObtida;
    
    // Metodo que atribui ao atributo faceObtida um valor aleatorio de 1 a 6
    public void lancar(){
        // Instancia a classe para gerar numeros aleatorios
        Random random = new Random();
        // Atribui ao atributo faceObtida um numero aleatorio
        this.faceObtida = random.nextInt(1, 7);
    }
    
    // Retorna a face obtida no dado
    public int getFace(){
        return this.faceObtida;
    }
}
