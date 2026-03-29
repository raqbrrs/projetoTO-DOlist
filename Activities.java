/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raquel.projetoto;

/**
 *
 * @author Raquel Barros
 */
public class Activities {
    private String descriçao;


    private boolean concluida;

    /**
     * @return the descriçao
     */
    public String getDescriçao() {
        return descriçao;
    }

    public Activities(String descriçao, boolean concluida) {
        this(descriçao);
    }

    public Activities(String descriçao) {
        this.descriçao = descriçao;
        this.concluida = false;
    }

    /**
     * @return the concluida
     */
    public boolean isConcluida() {
        return concluida;
    }

    /**
     * @param concluida the concluida to set
     */
    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    /**
     * @param descriçao the descriçao to set
     */
    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }
    
   
    public void concluir() { 
        this.concluida = true; 
    }

    @Override
    public String toString() {
        return (concluida ? "[X] " : "[ ] ") + descriçao;
    }

    public void concluida() {
         this.concluida = true; 
    System.out.println("Status alterado no objeto!");
    }
}

