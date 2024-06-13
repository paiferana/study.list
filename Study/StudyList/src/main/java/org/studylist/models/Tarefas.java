/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.studylist.models;

import org.studylist.structure.ListaDuplamenteLigada;

/**
 *
 * @author Ana
 */
public class Tarefas {
private ListaDuplamenteLigada tarefas;

    public Tarefas() {
        this.tarefas = new ListaDuplamenteLigada();
    }

    // Adiciona uma nova tarefa à lista
    public void addTarefa(Tarefa tarefa) {
        tarefas.append(tarefa);
    }

    // Remove uma tarefa da lista
    public void removeTarefa(int tarefa) {
        tarefas.remove(tarefa);
    }
    
    // Atualiza uma tarefa na lista
    public void updateTarefa(int oldTarefa, String newDescricao,String newVenci) {
        tarefas.update(oldTarefa, newDescricao, newVenci);
    }

    // Exibe a lista de tarefas
    public void displayTarefas() {
        tarefas.display();
    }

    @Override
    public String toString() {
        return tarefas.display();
    }
}
