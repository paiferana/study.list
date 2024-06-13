/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.studylist.structure;

import org.studylist.models.Tarefas;

/**
 *
 * @author Ana
 */
public class NodeTree {
    String materia;
    Tarefas tarefas;
    NodeTree left, right;

    public NodeTree(String materia, Tarefas tarefas) {
        this.materia = materia;
        this.tarefas = tarefas;
        left = right = null;
    }
}
