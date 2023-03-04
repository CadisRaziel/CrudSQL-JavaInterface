
package view;

import controller.ProjectController;
import controller.TaskController;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import model.Project;
import model.Task;
import util.TaskTableModel;


public class MainScreen extends javax.swing.JFrame {

    ProjectController projectController;
    TaskController taskController;
    
    
    //DefaultListModel -> vinculado com o Jlist para especificar o que vai ser mostrado nesse Jlist
    DefaultListModel projecstModel;
    TaskTableModel taskModel;
    
    public MainScreen() {
        initComponents();
        decorateTableTask();
        
        initDataController();
        initCOmponentsModel();
        //aqui eu chamo a constru��o da interface grafica pelo c�digo como fizemos la na linha 381
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelEmptyList = new javax.swing.JPanel();
        JLabelEmptyListIcon = new javax.swing.JLabel();
        JLabelEmptyListTitle = new javax.swing.JLabel();
        JLabelEmptyListSubTitle = new javax.swing.JLabel();
        JPanelMain = new javax.swing.JPanel();
        JPanelToolBar = new javax.swing.JPanel();
        JLabelToolBarTitle = new javax.swing.JLabel();
        JLabelToolBarSubTitle = new javax.swing.JLabel();
        jPanelProjects = new javax.swing.JPanel();
        JLabelProjects = new javax.swing.JLabel();
        JLabelProjectsAdd = new javax.swing.JLabel();
        JPanelProjectList = new javax.swing.JPanel();
        JScrollPanelListProjects = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        JPanelTasks = new javax.swing.JPanel();
        JLabelTasks = new javax.swing.JLabel();
        JLabelTaskAdd = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableTask = new javax.swing.JTable();

        JPanelEmptyList.setBackground(new java.awt.Color(51, 51, 51));

        JLabelEmptyListIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelEmptyListIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/works.png"))); // NOI18N

        JLabelEmptyListTitle.setBackground(new java.awt.Color(204, 204, 204));
        JLabelEmptyListTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLabelEmptyListTitle.setForeground(new java.awt.Color(204, 204, 204));
        JLabelEmptyListTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelEmptyListTitle.setText("Nenhuma tarefa por aqui :D");

        JLabelEmptyListSubTitle.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        JLabelEmptyListSubTitle.setForeground(new java.awt.Color(204, 204, 204));
        JLabelEmptyListSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelEmptyListSubTitle.setText("Clique no bot�o \"+\" para adicionar uma nova tarefa !");

        javax.swing.GroupLayout JPanelEmptyListLayout = new javax.swing.GroupLayout(JPanelEmptyList);
        JPanelEmptyList.setLayout(JPanelEmptyListLayout);
        JPanelEmptyListLayout.setHorizontalGroup(
            JPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelEmptyListIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JLabelEmptyListTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JLabelEmptyListSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JPanelEmptyListLayout.setVerticalGroup(
            JPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelEmptyListLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(JLabelEmptyListIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabelEmptyListTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabelEmptyListSubTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));

        JPanelMain.setBackground(new java.awt.Color(0, 0, 0));

        JPanelToolBar.setBackground(new java.awt.Color(51, 51, 51));
        JPanelToolBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JLabelToolBarTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelToolBarTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/to-do-list.png"))); // NOI18N

        JLabelToolBarSubTitle.setBackground(new java.awt.Color(153, 153, 153));
        JLabelToolBarSubTitle.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        JLabelToolBarSubTitle.setForeground(new java.awt.Color(204, 204, 204));
        JLabelToolBarSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelToolBarSubTitle.setText("Anote tudo, n�o se esque�a de nada !");
        JLabelToolBarSubTitle.setToolTipText("Nunca se esque�a, nao pare de estudar");

        javax.swing.GroupLayout JPanelToolBarLayout = new javax.swing.GroupLayout(JPanelToolBar);
        JPanelToolBar.setLayout(JPanelToolBarLayout);
        JPanelToolBarLayout.setHorizontalGroup(
            JPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelToolBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabelToolBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLabelToolBarSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        JPanelToolBarLayout.setVerticalGroup(
            JPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelToolBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLabelToolBarTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLabelToolBarSubTitle)
                .addContainerGap())
        );

        jPanelProjects.setBackground(new java.awt.Color(51, 51, 51));
        jPanelProjects.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JLabelProjects.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLabelProjects.setForeground(new java.awt.Color(204, 204, 204));
        JLabelProjects.setText("Projetos");

        JLabelProjectsAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tab.png"))); // NOI18N
        JLabelProjectsAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabelProjectsAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelProjectsLayout = new javax.swing.GroupLayout(jPanelProjects);
        jPanelProjects.setLayout(jPanelProjectsLayout);
        jPanelProjectsLayout.setHorizontalGroup(
            jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLabelProjects)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(JLabelProjectsAdd)
                .addContainerGap())
        );
        jPanelProjectsLayout.setVerticalGroup(
            jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProjectsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLabelProjects)
                    .addComponent(JLabelProjectsAdd))
                .addContainerGap())
        );

        JPanelProjectList.setBackground(new java.awt.Color(51, 51, 51));
        JPanelProjectList.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jList1.setBackground(new java.awt.Color(51, 51, 51));
        jList1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jList1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jList1.setForeground(new java.awt.Color(204, 204, 204));
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setFixedCellHeight(40);
        jList1.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jList1.setSelectionForeground(new java.awt.Color(204, 204, 204));
        JScrollPanelListProjects.setViewportView(jList1);

        javax.swing.GroupLayout JPanelProjectListLayout = new javax.swing.GroupLayout(JPanelProjectList);
        JPanelProjectList.setLayout(JPanelProjectListLayout);
        JPanelProjectListLayout.setHorizontalGroup(
            JPanelProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelProjectListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JScrollPanelListProjects, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addContainerGap())
        );
        JPanelProjectListLayout.setVerticalGroup(
            JPanelProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelProjectListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JScrollPanelListProjects)
                .addContainerGap())
        );

        JPanelTasks.setBackground(new java.awt.Color(51, 51, 51));
        JPanelTasks.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JLabelTasks.setBackground(new java.awt.Color(204, 204, 204));
        JLabelTasks.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLabelTasks.setForeground(new java.awt.Color(204, 204, 204));
        JLabelTasks.setText("Tarefas");

        JLabelTaskAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tab.png"))); // NOI18N
        JLabelTaskAdd.setMaximumSize(new java.awt.Dimension(26, 26));
        JLabelTaskAdd.setMinimumSize(new java.awt.Dimension(26, 26));
        JLabelTaskAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabelTaskAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JPanelTasksLayout = new javax.swing.GroupLayout(JPanelTasks);
        JPanelTasks.setLayout(JPanelTasksLayout);
        JPanelTasksLayout.setHorizontalGroup(
            JPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelTasksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLabelTasks, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 397, Short.MAX_VALUE)
                .addComponent(JLabelTaskAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JPanelTasksLayout.setVerticalGroup(
            JPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelTasksLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabelTasks)
                    .addComponent(JLabelTaskAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JTableTask.setBackground(new java.awt.Color(51, 51, 51));
        JTableTask.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JTableTask.setForeground(new java.awt.Color(204, 204, 204));
        JTableTask.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descri��o", "Prazo", "Tarefa concluida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTableTask.setGridColor(new java.awt.Color(255, 255, 255));
        JTableTask.setRowHeight(50);
        JTableTask.setSelectionBackground(new java.awt.Color(255, 255, 255));
        JTableTask.setSelectionForeground(new java.awt.Color(51, 51, 51));
        JTableTask.setShowHorizontalLines(true);
        JTableTask.setShowVerticalLines(true);
        jScrollPane1.setViewportView(JTableTask);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout JPanelMainLayout = new javax.swing.GroupLayout(JPanelMain);
        JPanelMain.setLayout(JPanelMainLayout);
        JPanelMainLayout.setHorizontalGroup(
            JPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPanelToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JPanelMainLayout.createSequentialGroup()
                        .addGroup(JPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelProjects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JPanelProjectList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JPanelTasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        JPanelMainLayout.setVerticalGroup(
            JPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPanelToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JPanelTasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelProjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPanelProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JLabelProjectsAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabelProjectsAddMouseClicked
        // ao clicar no bot�o de 'projeto +' vai abrir a tela de cadastrar projeto
        
        ProjectDialogScreen projectDialogScreen = new ProjectDialogScreen(this, rootPaneCheckingEnabled);
        projectDialogScreen.setVisible(true);
        
        
        //adicionando um listener para atualizar a lista de projeto quando um projeto for inserido
        //ou seja, quando clicar pra salvar e a janela for fechada a lista � atualizada com o novo projeto
        projectDialogScreen.addWindowListener(new WindowAdapter() {
           public void windowClosed(WindowEvent e) {
               loadProjects();
           }
        });
       
    }//GEN-LAST:event_JLabelProjectsAddMouseClicked

    private void JLabelTaskAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabelTaskAddMouseClicked
        // TODO add your handling code here:
        TaskDialogScreen taskDialogScreen = new TaskDialogScreen(this, rootPaneCheckingEnabled);
        
        //para mostrar a tarefa ao usuario (aqui eu seto o projeto ao qual essa tarefa que eu vou criar pertence
        //taskDialogScreen.setProject(project);    
        taskDialogScreen.setVisible(true);
    }//GEN-LAST:event_JLabelTaskAddMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelEmptyListIcon;
    private javax.swing.JLabel JLabelEmptyListSubTitle;
    private javax.swing.JLabel JLabelEmptyListTitle;
    private javax.swing.JLabel JLabelProjects;
    private javax.swing.JLabel JLabelProjectsAdd;
    private javax.swing.JLabel JLabelTaskAdd;
    private javax.swing.JLabel JLabelTasks;
    private javax.swing.JLabel JLabelToolBarSubTitle;
    private javax.swing.JLabel JLabelToolBarTitle;
    private javax.swing.JPanel JPanelEmptyList;
    private javax.swing.JPanel JPanelMain;
    private javax.swing.JPanel JPanelProjectList;
    private javax.swing.JPanel JPanelTasks;
    private javax.swing.JPanel JPanelToolBar;
    private javax.swing.JScrollPane JScrollPanelListProjects;
    private javax.swing.JTable JTableTask;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelProjects;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
        
    
   public void decorateTableTask(){
       
       //Customizando o header da table de tarefas
       JTableTask.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
       JTableTask.getTableHeader().setBackground(new Color(51,51,51));
       JTableTask.getTableHeader().setForeground(new Color(242,242,242));
       
       //quando clicar na coluna ele vai ordernar por ordem alfabetica
       JTableTask.setAutoCreateRowSorter(true);
   }

   public void initDataController(){
       projectController = new ProjectController();
       taskController = new TaskController();
   }
   
   public void initCOmponentsModel(){
       projecstModel = new DefaultListModel();
       
       //vamos carregar com os dados do banco de dados
       loadProjects();
       
       taskModel = new TaskTableModel();
       JTableTask.setModel(taskModel);
       loadTasks(8);
   }
   
   public void loadTasks(int idProject){
       List<Task> tasks = taskController.getAll(idProject);
       taskModel.setTasks(tasks);
   }
   
   public void loadProjects(){
       List<Project> projects = projectController.getAll();
       projecstModel.clear();
       
       for(int i = 0; i < projects.size(); i++) {
           Project project = projects.get(i);
           projecstModel.addElement(project);
       }
       
       jList1.setModel(projecstModel);
               
   }

}
