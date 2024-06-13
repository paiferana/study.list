package org.studylist.structure;

import org.studylist.models.Tarefa;
import org.studylist.models.Tarefas;

/**
 *
 * @author Ana
 */

public class BinaryTree {

    NodeTree root;

    public BinaryTree() {
        root = null;
    }

    // Método para inserir uma nova matéria na árvore
    public void insert(String materia, Tarefas tarefas) {
        root = insertRec(root, materia, tarefas);
    }

    // Método recursivo para inserir uma nova matéria
    private NodeTree insertRec(NodeTree root, String materia, Tarefas tarefas) {
        if (root == null) {
            root = new NodeTree(materia, tarefas);
            return root;
        }

        // Compara as strings
        int comparison = materia.compareTo(root.materia);

        if (comparison < 0) {
            root.left = insertRec(root.left, materia, tarefas);
        } else if (comparison > 0) {
            root.right = insertRec(root.right, materia, tarefas);
        }

        return root;
    }

    // Método para buscar uma matéria na árvore
    public boolean search(String materia) {
        return searchRec(root, materia);
    }

    // Método recursivo para buscar uma matéria
    private boolean searchRec(NodeTree root, String materia) {
        if (root == null) {
            return false;
        }

        int comparison = materia.compareTo(root.materia);

        if (comparison == 0) {
            return true;
        }
        if (comparison < 0) {
            return searchRec(root.left, materia);
        } else {
            return searchRec(root.right, materia);
        }
    }

    // Método para percorrer a árvore em ordem
    public String inorder() {
        StringBuilder sb = new StringBuilder();
        inorderRec(root, sb);
        return sb.toString();
    }

    // Método recursivo para percorrer a árvore em ordem e acumular o resultado em um StringBuilder
    private void inorderRec(NodeTree root, StringBuilder sb) {
        if (root != null) {
            inorderRec(root.left, sb); // Percorrer a subárvore esquerda
            sb.append("Matéria: ").append(root.materia).append("\n"); // Adicionar a matéria
            sb.append("Tarefas: ").append(root.tarefas).append("\n"); // Adicionar as tarefas
            inorderRec(root.right, sb); // Percorrer a subárvore direita
        }
    }
    
    // Método para adicionar uma nova tarefa a uma matéria existente
    public boolean addTarefaToMateria(String materia, Tarefa tarefa) {
        NodeTree node = searchNode(root, materia);
        if (node != null) {
            node.tarefas.addTarefa(tarefa);
            return true;
        }
        return false;
    }
    // Método para buscar e retornar o nó de uma matéria específica
    private NodeTree searchNode(NodeTree root, String materia) {
        if (root == null) {
            return null;
        }

        int comparison = materia.compareTo(root.materia);

        if (comparison == 0) {
            return root;
        }
        if (comparison < 0) {
            return searchNode(root.left, materia);
        } else {
            return searchNode(root.right, materia);
        }
    }
    
    // Método para atualizar uma matéria existente
    public void updateMateria(String oldMateria, String newMateria) {
            searchNode(root, oldMateria).materia = newMateria;
    }
    
    public void updateTarefa(String materia, int oldTf, String newDescri, String newVenci) {
        searchNode(root, materia).tarefas.updateTarefa(oldTf, newDescri, newVenci);
    }
    
    // Método para mostrar as tarefas de uma matéria específica
    public String mostrarTarefas(String materia) {
        NodeTree node = searchNode(root, materia);
        if (node != null) {
            return node.tarefas.toString();
        }
        return "Matéria não encontrada.";
    }
    
     public void deleteTarefaFromMateria(String materia, int index) {
        NodeTree node = searchNode(root, materia);
        if (node != null) {
            node.tarefas.removeTarefa(index);
        }
     }
     
      // Método para deletar uma matéria específica
    public void deleteMateria(String materia) {
        root = deleteRec(root, materia);
    }

    // Método recursivo para deletar uma matéria específica
    private NodeTree deleteRec(NodeTree root, String materia) {
        if (root == null) {
            return root;
        }

        int comparison = materia.compareTo(root.materia);

        if (comparison < 0) {
            root.left = deleteRec(root.left, materia);
        } else if (comparison > 0) {
            root.right = deleteRec(root.right, materia);
        } else {
            // Nó com apenas um filho ou sem filhos
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Nó com dois filhos
            root.materia = minValue(root.right);
            root.right = deleteRec(root.right, root.materia);
        }

        return root;
    }

    // Método para encontrar o menor valor em uma árvore
    private String minValue(NodeTree root) {
        String minv = root.materia;
        while (root.left != null) {
            minv = root.left.materia;
            root = root.left;
        }
        return minv;
    }

}
