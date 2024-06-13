/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.studylist.structure;

import org.studylist.models.Tarefa;

/**
 *
 * @author Ana
 */
public class ListaDuplamenteLigada {

    private NodeList head; // Cabeça da lista
    private NodeList tail; // Cauda da lista

    public ListaDuplamenteLigada() {
        this.head = null;
        this.tail = null;
    }

    // Adiciona uma nova tarefa ao final da lista
    public void append(Tarefa tarefa) {
        NodeList new_node = new NodeList(tarefa);
        if (this.tail == null) { // Se a lista está vazia
            this.head = this.tail = new_node;
        } else {
            this.tail.next = new_node;
            new_node.prev = this.tail;
            this.tail = new_node;
        }
    }

    // Adiciona uma nova tarefa ao início da lista
    public void prepend(Tarefa tarefa) {
        NodeList new_node = new NodeList(tarefa);
        if (this.head == null) { // Se a lista está vazia
            this.head = this.tail = new_node;
        } else {
            new_node.next = this.head;
            this.head.prev = new_node;
            this.head = new_node;
        }
    }

    // Exibe a lista de tarefas
    public String display() {
        StringBuilder sb = new StringBuilder();
        NodeList current = this.head;
        while (current != null) {
            sb.append(current.tarefa);
            if (current.next != null) {
                sb.append(" \n");
            }
            current = current.next;
        }
        return sb.toString();
    }
    
     // Atualiza uma tarefa na lista
    public boolean update(int oldTarefa, String newDescricao,String newVenci) {
        NodeList current = this.head;
        while (current != null) {
            if (current.tarefa.getId() == oldTarefa) {
                current.tarefa.setDescricao(newDescricao);
                current.tarefa.setDataVencimento(newVenci);
                return true; // Tarefa encontrada e atualizada
            }
            current = current.next;
        }
        return false; // Tarefa não encontrada
    }

    // Remove uma tarefa da lista
    public boolean remove(int tarefa) {
        NodeList current = this.head;
        while (current != null) {
            if (current.tarefa.getId() == tarefa) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    this.head = current.next; // Atualizar a cabeça da lista
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    this.tail = current.prev; // Atualizar a cauda da lista
                }
                return true; // Nó encontrado e removido
            }
            current = current.next;
        }
        return false; // Nó não encontrado
    }
}
