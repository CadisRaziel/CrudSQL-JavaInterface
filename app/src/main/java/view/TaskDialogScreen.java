package view;

import controller.TaskController;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Project;
import model.Task;

public class TaskDialogScreen extends javax.swing.JDialog {

    TaskController controller;

    //Como a tarefa precisa ser vinculada a um projeto (decidimos isso no banco com a chave estranjeira e o relacionamento de tabelas)
    //então precisamos vincular a tarefa a um projeto
    Project project;

    public TaskDialogScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        //depois que o componente é inicializado, vou instanciar essa variavel;
        controller = new TaskController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelToolbar = new javax.swing.JPanel();
        JPanelToolBarBackground = new javax.swing.JPanel();
        JLabelToolBarTitle = new javax.swing.JLabel();
        JLabelToolBarSave = new javax.swing.JLabel();
        JPanelTask = new javax.swing.JPanel();
        JLabelName = new javax.swing.JLabel();
        JTextFieldName = new javax.swing.JTextField();
        JLabelDescription = new javax.swing.JLabel();
        JLabelDeadLine = new javax.swing.JLabel();
        JLabelNotes = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JScrollPanelNote = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        JScrollPanelDescription = new javax.swing.JTextArea();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        JPanelToolbar.setBackground(new java.awt.Color(0, 0, 0));

        JPanelToolBarBackground.setBackground(new java.awt.Color(51, 51, 51));

        JLabelToolBarTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JLabelToolBarTitle.setForeground(new java.awt.Color(204, 204, 204));
        JLabelToolBarTitle.setText("Tarefa");
        JLabelToolBarTitle.setToolTipText("Crie uma nova tarefa");

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
                .addComponent(JLabelToolBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addGap(158, 158, 158)
                .addComponent(JLabelToolBarSave, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JPanelToolBarBackgroundLayout.setVerticalGroup(
            JPanelToolBarBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelToolBarBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelToolBarBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabelToolBarTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabelToolBarSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        JPanelTask.setBackground(new java.awt.Color(51, 51, 51));

        JLabelName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JLabelName.setForeground(new java.awt.Color(204, 204, 204));
        JLabelName.setText("Nome");
        JLabelName.setToolTipText("Nomeie a sua tarefa");

        JTextFieldName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JTextFieldName.setToolTipText("De um nome a sua tarefa");
        JTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldNameActionPerformed(evt);
            }
        });

        JLabelDescription.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JLabelDescription.setForeground(new java.awt.Color(204, 204, 204));
        JLabelDescription.setText("Descrição");
        JLabelDescription.setToolTipText("De uma descrição a sua tarefa");

        JLabelDeadLine.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JLabelDeadLine.setForeground(new java.awt.Color(204, 204, 204));
        JLabelDeadLine.setText("Prazo");
        JLabelDeadLine.setToolTipText("De um prazo a sua tarefa");

        JLabelNotes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JLabelNotes.setForeground(new java.awt.Color(204, 204, 204));
        JLabelNotes.setText("Notas");
        JLabelNotes.setToolTipText("Escreva alguma observação");

        JScrollPanelNote.setColumns(20);
        JScrollPanelNote.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JScrollPanelNote.setRows(5);
        JScrollPanelNote.setToolTipText("Digite uma obervação");
        jScrollPane2.setViewportView(JScrollPanelNote);

        JScrollPanelDescription.setColumns(20);
        JScrollPanelDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JScrollPanelDescription.setRows(5);
        JScrollPanelDescription.setToolTipText("Digite uma descrição");
        jScrollPane3.setViewportView(JScrollPanelDescription);

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        javax.swing.GroupLayout JPanelTaskLayout = new javax.swing.GroupLayout(JPanelTask);
        JPanelTask.setLayout(JPanelTaskLayout);
        JPanelTaskLayout.setHorizontalGroup(
            JPanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelTaskLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                    .addComponent(JTextFieldName)
                    .addComponent(JLabelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLabelDeadLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(JPanelTaskLayout.createSequentialGroup()
                        .addGroup(JPanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabelDescription)
                            .addComponent(JLabelNotes))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jFormattedTextField1))
                .addContainerGap())
        );
        JPanelTaskLayout.setVerticalGroup(
            JPanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelTaskLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLabelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLabelDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLabelDeadLine, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLabelNotes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JPanelToolbarLayout = new javax.swing.GroupLayout(JPanelToolbar);
        JPanelToolbar.setLayout(JPanelToolbarLayout);
        JPanelToolbarLayout.setHorizontalGroup(
            JPanelToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelToolbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JPanelTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPanelToolBarBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        JPanelToolbarLayout.setVerticalGroup(
            JPanelToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelToolbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPanelToolBarBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPanelTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanelToolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanelToolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldNameActionPerformed

    private void JLabelToolBarSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabelToolBarSaveMouseClicked
        // Salvar a tarefa no banco de dados
        try {
            Task task = new Task();

            task.setIdProject(project.getId());// -> pegando o id do projeto pra vincular a tarefa

            task.setName(JTextFieldName.getText());
            task.setDescription(JScrollPanelDescription.getText());
            task.setNotes(JScrollPanelNote.getText());
            task.setIsCompleted(false);

            //convertendo texto para data        
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date deadline = null;
            deadline = dateFormat.parse(jFormattedTextField1.getText());
            task.setDeadline(deadline);
            controller.save(task);
            JOptionPane.showMessageDialog(rootPane, "Tarefa salva com sucesso!");
            this.dispose();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } catch (ParseException ex) {
            Logger.getLogger(TaskDialogScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_JLabelToolBarSaveMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TaskDialogScreen dialog = new TaskDialogScreen(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel JLabelDeadLine;
    private javax.swing.JLabel JLabelDescription;
    private javax.swing.JLabel JLabelName;
    private javax.swing.JLabel JLabelNotes;
    private javax.swing.JLabel JLabelToolBarSave;
    private javax.swing.JLabel JLabelToolBarTitle;
    private javax.swing.JPanel JPanelTask;
    private javax.swing.JPanel JPanelToolBarBackground;
    private javax.swing.JPanel JPanelToolbar;
    private javax.swing.JTextArea JScrollPanelDescription;
    private javax.swing.JTextArea JScrollPanelNote;
    private javax.swing.JTextField JTextFieldName;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

    //Como a tarefa precisa ser vinculada a um projeto (decidimos isso no banco com a chave estranjeira e o relacionamento de tabelas)
    //então precisamos vincular a tarefa a um projeto
    //Aqui eu dei um alt + insert e inseri um getter do 'project'
    public void setProject(Project project) {
        this.project = project;
    }

}
