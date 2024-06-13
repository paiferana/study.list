/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.studylist.views;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.studylist.models.Tarefa;
import org.studylist.models.Tarefas;
import org.studylist.structure.BinaryTree;

/**
 *
 * @author Ana
 */
public class OptionsView extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    private Tarefas tfs;
    private Tarefa tf;
    private BinaryTree arvore = new BinaryTree();

    public OptionsView() {
        initComponents();

        try {
            scaledImage();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar imagem: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void scaledImage() throws IOException {
        BufferedImage originalImage1 = ImageIO.read(new File("src/main/java/org/studylist/imgs/background.png"));

        Image imgScale = originalImage1.getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon sclimg1 = new ImageIcon(imgScale);
        img.setIcon(sclimg1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbDelete = new javax.swing.JButton();
        jbAtulizacao = new javax.swing.JButton();
        jbListagem = new javax.swing.JButton();
        jbCadastro = new javax.swing.JButton();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jbDelete.setBackground(new java.awt.Color(153, 51, 255));
        jbDelete.setForeground(new java.awt.Color(0, 0, 0));
        jbDelete.setText("DELETAR");
        jbDelete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jbDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jbDelete);
        jbDelete.setBounds(80, 310, 600, 70);

        jbAtulizacao.setBackground(new java.awt.Color(153, 51, 255));
        jbAtulizacao.setForeground(new java.awt.Color(0, 0, 0));
        jbAtulizacao.setText("ATUALIZAÇÃO");
        jbAtulizacao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jbAtulizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtulizacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jbAtulizacao);
        jbAtulizacao.setBounds(80, 150, 600, 70);

        jbListagem.setBackground(new java.awt.Color(153, 51, 255));
        jbListagem.setForeground(new java.awt.Color(0, 0, 0));
        jbListagem.setText("LISTAGEM");
        jbListagem.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jbListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListagemActionPerformed(evt);
            }
        });
        getContentPane().add(jbListagem);
        jbListagem.setBounds(80, 230, 600, 70);

        jbCadastro.setBackground(new java.awt.Color(153, 51, 255));
        jbCadastro.setForeground(new java.awt.Color(0, 0, 0));
        jbCadastro.setText("REGISTRO");
        jbCadastro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jbCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jbCadastro);
        jbCadastro.setBounds(80, 70, 600, 70);
        getContentPane().add(img);
        img.setBounds(0, 0, 780, 500);

        setSize(new java.awt.Dimension(771, 514));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListagemActionPerformed
        if (arvore.inorder().isBlank()) {
            JOptionPane.showMessageDialog(null, "Não possui nenhuma materia registrada");
        } else {
            JOptionPane.showMessageDialog(null, arvore.inorder());
        }
    }//GEN-LAST:event_jbListagemActionPerformed

    private void jbCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastroActionPerformed
        optionsRegister();
    }//GEN-LAST:event_jbCadastroActionPerformed

    private void jbAtulizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtulizacaoActionPerformed

        optionsUpdate();
    }//GEN-LAST:event_jbAtulizacaoActionPerformed

    private void jbDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeleteActionPerformed
        optionsDelete();
    }//GEN-LAST:event_jbDeleteActionPerformed

    // Método que exibe o menu de opções e chama o método correspondente com base na escolha
    public void optionsRegister() {
        // Opções disponíveis
        String[] options = {"Cadastrar Matérias", "Cadastrar Tarefa"};

        // Mostrar o diálogo com as opções
        int choice = JOptionPane.showOptionDialog(
                null,
                "Escolha uma opção:",
                "Menu",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]
        );

        // Verificar qual opção foi escolhida e executar a ação correspondente
        switch (choice) {
            case 0: // Cadastrar Matérias
                cadastrarMaterias();
                break;
            case 1: // Cadastrar Tarefa
                String materia = JOptionPane.showInputDialog("Digite o nome da matéria:");
                if (arvore.search(materia)) {
                    cadastrarMaterias(materia);
                } else {
                    JOptionPane.showMessageDialog(null, "Matéria não foi encontrada");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Nenhuma opção selecionada.");
                break;
        }
    }

    // Método para cadastrar matérias
    private void cadastrarMaterias() {
        String materia = JOptionPane.showInputDialog("Digite o nome da matéria:");
        if (materia != null && !materia.trim().isEmpty()) {
            tfs = new Tarefas();
            tfs.addTarefa(cadastrarTarefa());
            arvore.insert(materia, tfs);

            JOptionPane.showMessageDialog(null, "Matéria cadastrada");

        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma matéria foi cadastrada.");
        }
    }

    // Método para cadastrar tarefas
    private Tarefa cadastrarTarefa() {
        String tarefa = JOptionPane.showInputDialog("Digite a descrição da tarefa:");
        String vencimento = JOptionPane.showInputDialog("Digite a data de vencimento da tarefa:");
        if (tarefa != null && !tarefa.trim().isEmpty()) {
            tf = new Tarefa(tarefa, vencimento);
            return tf;
        } else {
            return null;
        }
    }

    // Método que exibe o menu de opções e chama o método correspondente com base na escolha
    public void optionsUpdate() {
        // Opções disponíveis
        String[] options = {"Atualizar Matéria", "Atualizar Tarefa"};

        // Mostrar o diálogo com as opções
        int choice = JOptionPane.showOptionDialog(
                null,
                "Escolha uma opção:",
                "Menu",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]
        );

        // Verificar qual opção foi escolhida e executar a ação correspondente
        switch (choice) {
            case 0: // Atualizar Matérias
                atualizarMateria();
                break;
            case 1: // Atualizar Tarefa
                String materia = JOptionPane.showInputDialog("Digite o nome da matéria:");
                if (arvore.search(materia)) {
                    atualizarTarefa(materia);
                } else {
                    JOptionPane.showMessageDialog(null, "Matéria não foi encontrada");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Nenhuma opção selecionada.");
                break;
        }
    }

    private void atualizarMateria() {
        String oldMateria = JOptionPane.showInputDialog(null, "Qual matéria você deseja atualizar?");
        String newMateria = JOptionPane.showInputDialog(null, "Digite o novo nome da matéria que deseja atualizar.");
        arvore.updateMateria(oldMateria, newMateria);
    }

    private void atualizarTarefa(String materia) {
        if (arvore.search(materia)) {

            int oldTarefa = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual tarefa você deseja atualizar? (digite o id)\n" + arvore.mostrarTarefas(materia)));

            String descricao = JOptionPane.showInputDialog(null, "Qual a nova descrição da tarefa?");
            String venci = JOptionPane.showInputDialog(null, "Qual a nova data da tarefa?");

            arvore.updateTarefa(materia, oldTarefa, descricao, venci);
        }
    }

    private void cadastrarMaterias(String materia) {

        String tarefa = JOptionPane.showInputDialog("Digite a descrição da tarefa:");
        String vencimento = JOptionPane.showInputDialog("Digite a data de vencimento da tarefa:");
        if (tarefa != null && !tarefa.trim().isEmpty()) {
            tf = new Tarefa(tarefa, vencimento);
            arvore.addTarefaToMateria(materia, tf);
        }
    }

    // Método que exibe o menu de opções de deletar e chama o método correspondente com base na escolha
    public void optionsDelete() {
        // Opções disponíveis
        String[] options = {"Deletar Matéria", "Deletar Tarefa"};

        // Mostrar o diálogo com as opções
        int choice = JOptionPane.showOptionDialog(
                null,
                "Escolha uma opção:",
                "Menu",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]
        );

        // Verificar qual opção foi escolhida e executar a ação correspondente
        switch (choice) {
            case 0: // Deletar Matéria
                deletarMateria();
                break;
            case 1: // Deletar Tarefa
                String materia = JOptionPane.showInputDialog("Digite o nome da matéria:");
                if (arvore.search(materia)) {
                    deletarTarefa(materia);
                } else {
                    JOptionPane.showMessageDialog(null, "Matéria não foi encontrada");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Nenhuma opção selecionada.");
                break;
        }
    }

// Método para deletar uma matéria
    private void deletarMateria() {
        String materia = JOptionPane.showInputDialog(null, "Qual matéria você deseja deletar?");
        if (arvore.search(materia)) {
            arvore.deleteMateria(materia);
            JOptionPane.showMessageDialog(null, "Matéria deletada com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Matéria não encontrada.");
        }
    }

// Método para deletar uma tarefa de uma matéria
    private void deletarTarefa(String materia) {
        if (arvore.search(materia)) {
            int tarefaIndex = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual tarefa você deseja deletar? (digite o id)\n" + arvore.mostrarTarefas(materia)));
            arvore.deleteTarefaFromMateria(materia, tarefaIndex);
            JOptionPane.showMessageDialog(null, "Tarefa deletada com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Matéria não encontrada.");
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OptionsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OptionsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OptionsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OptionsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OptionsView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img;
    private javax.swing.JButton jbAtulizacao;
    private javax.swing.JButton jbCadastro;
    private javax.swing.JButton jbDelete;
    private javax.swing.JButton jbListagem;
    // End of variables declaration//GEN-END:variables

}
