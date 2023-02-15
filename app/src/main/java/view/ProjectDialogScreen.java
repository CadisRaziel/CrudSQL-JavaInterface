package view;

import controller.ProjectController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Project;

public class ProjectDialogScreen extends javax.swing.JDialog {

    //nosso controller
    ProjectController controller;

    public ProjectDialogScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        //depois que o componente é inicializado, vou instanciar essa variavel;
        controller = new ProjectController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelToolBar = new javax.swing.JPanel();
        JPanelToolBarBackground = new javax.swing.JPanel();
        JLabelToolBarTitle = new javax.swing.JLabel();
        JLabelToolBarSave = new javax.swing.JLabel();
        JPanelProject = new javax.swing.JPanel();
        JLabelName = new javax.swing.JLabel();
        JTextFielName = new javax.swing.JTextField();
        JLabelDescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTextAreaDescription = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        JPanelToolBar.setBackground(new java.awt.Color(0, 0, 0));

        JPanelToolBarBackground.setBackground(new java.awt.Color(51, 51, 51));

        JLabelToolBarTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JLabelToolBarTitle.setForeground(new java.awt.Color(204, 204, 204));
        JLabelToolBarTitle.setText("Projeto");
        JLabelToolBarTitle.setToolTipText("Cadastrar projeto");

        JLabelToolBarSave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelToolBarSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/success.png"))); // NOI18N
        JLabelToolBarSave.setToolTipText("Confirmar");
        JLabelToolBarSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabelToolBarSaveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JPanelToolBarBackgroundLayout = new javax.swing.GroupLayout(JPanelToolBarBackground);
        JPanelToolBarBackground.setLayout(JPanelToolBarBackgroundLayout);
        JPanelToolBarBackgroundLayout.setHorizontalGroup(
            JPanelToolBarBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelToolBarBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLabelToolBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabelToolBarSave, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JPanelToolBarBackgroundLayout.setVerticalGroup(
            JPanelToolBarBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelToolBarBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelToolBarBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabelToolBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLabelToolBarSave, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addContainerGap())
        );

        JPanelProject.setBackground(new java.awt.Color(51, 51, 51));

        JLabelName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLabelName.setForeground(new java.awt.Color(204, 204, 204));
        JLabelName.setText("Nome");
        JLabelName.setToolTipText("Nomeie seu projeto");

        JTextFielName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JTextFielName.setToolTipText("Digite o nome do projeto");
        JTextFielName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFielNameActionPerformed(evt);
            }
        });

        JLabelDescription.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLabelDescription.setForeground(new java.awt.Color(204, 204, 204));
        JLabelDescription.setText("Descrição");
        JLabelDescription.setToolTipText("De uma descrição ao projeto");

        JTextAreaDescription.setColumns(20);
        JTextAreaDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JTextAreaDescription.setRows(5);
        JTextAreaDescription.setToolTipText("Digite a descrição do projeto");
        jScrollPane1.setViewportView(JTextAreaDescription);

        javax.swing.GroupLayout JPanelProjectLayout = new javax.swing.GroupLayout(JPanelProject);
        JPanelProject.setLayout(JPanelProjectLayout);
        JPanelProjectLayout.setHorizontalGroup(
            JPanelProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelProjectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                    .addComponent(JLabelName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JTextFielName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelProjectLayout.createSequentialGroup()
                        .addComponent(JLabelDescription)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JPanelProjectLayout.setVerticalGroup(
            JPanelProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelProjectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLabelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTextFielName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLabelDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout JPanelToolBarLayout = new javax.swing.GroupLayout(JPanelToolBar);
        JPanelToolBar.setLayout(JPanelToolBarLayout);
        JPanelToolBarLayout.setHorizontalGroup(
            JPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelToolBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JPanelProject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPanelToolBarBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        JPanelToolBarLayout.setVerticalGroup(
            JPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelToolBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPanelToolBarBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPanelProject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTextFielNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFielNameActionPerformed

    }//GEN-LAST:event_JTextFielNameActionPerformed

    private void JLabelToolBarSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabelToolBarSaveMouseClicked
        // Salvar a informação no banco de dados        
        try {
            Project project = new Project();
            project.setName(JTextFielName.getText()); //getText -> texto dentro do componente textfield
            project.setDescription(JTextAreaDescription.getText()); //getText -> texto dentro do componente textfield
            controller.save(project);
            JOptionPane.showMessageDialog(rootPane, "Projeto salvo com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        this.dispose();

    }//GEN-LAST:event_JLabelToolBarSaveMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ProjectDialogScreen dialog = new ProjectDialogScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelDescription;
    private javax.swing.JLabel JLabelName;
    private javax.swing.JLabel JLabelToolBarSave;
    private javax.swing.JLabel JLabelToolBarTitle;
    private javax.swing.JPanel JPanelProject;
    private javax.swing.JPanel JPanelToolBar;
    private javax.swing.JPanel JPanelToolBarBackground;
    private javax.swing.JTextArea JTextAreaDescription;
    private javax.swing.JTextField JTextFielName;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
