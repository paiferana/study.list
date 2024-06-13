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
public class NodeList {
    Tarefa tarefa;
    NodeList next, prev;

    public NodeList(Tarefa tarefa) {
        this.tarefa = tarefa;
        this.next = null;
        this.prev = null;
    }
}
