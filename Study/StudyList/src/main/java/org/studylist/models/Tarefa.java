/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.studylist.models;

import java.util.Date;

/**
 *
 * @author Ana
 */
public  class Tarefa {
    private static int nextId = 1; 
    private int id; // Identificador único para cada tarefa

    private String descricao;
    private String dataVencimento;

    public Tarefa(String descricao, String dataVencimento) {
        this.id = nextId++;
        this.descricao = descricao;
        this.dataVencimento = dataVencimento;
    }
    
    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public String toString() {
        return "Tarefa: " +
                "id='" + id + '\'' +
                "descricao='" + descricao + '\'' +
                ", dataVencimento=" + dataVencimento
                ;
    }
}
