
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author USER
 */
public class ToDoApp extends javax.swing.JFrame {

    /**
     * Creates new form ToDoApp
     */
    public ToDoApp() {
        initComponents();
        //    getContentPane().setBackground(Color.GRAY);
        setDataTable("task.txt", jTable1);
        setDataTable("missedtask.txt", jTable2);
    }

    private void setDataTable(String filename, JTable jtable) {
        DefaultTableModel model = (DefaultTableModel) jtable.getModel();
        int count = model.getRowCount();

        while (count-- != 0) {
            model.removeRow(0);
        }
        try {
            FileInputStream file = new FileInputStream(filename);
            Scanner scn = new Scanner(file);
            while (true) {
                try {
                    Vector row = new Vector();
                    row.add(scn.nextLine());
                    model.addRow(row);
                } catch (Exception ex) {
                    break;
                }
            }
        } catch (Exception ex) {
            //   JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        taskField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addButton1 = new javax.swing.JButton();
        addButton2 = new javax.swing.JButton();
        dltButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Daily Study Planner");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(486, 486, 486)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Task:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        addButton.setBackground(new java.awt.Color(102, 0, 102));
        addButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        taskField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        taskField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskFieldActionPerformed(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Todays' study task"
                }
        ));
        jTable1.setRowHeight(35);
        jScrollPane1.setViewportView(jTable1);

        addButton1.setBackground(new java.awt.Color(0, 204, 51));
        addButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addButton1.setForeground(new java.awt.Color(255, 255, 255));
        addButton1.setText("Done");
        addButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton1ActionPerformed(evt);
            }
        });

        addButton2.setBackground(new java.awt.Color(204, 0, 0));
        addButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addButton2.setForeground(new java.awt.Color(255, 255, 255));
        addButton2.setText("Missed");
        addButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton2ActionPerformed(evt);
            }
        });

        dltButton.setBackground(new java.awt.Color(0, 51, 255));
        dltButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dltButton.setForeground(new java.awt.Color(255, 255, 255));
        dltButton.setText("Delete");
        dltButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dltButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Todays Study Task");

        jTable2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Missed Study Task"
                }
        ));
        jTable2.setRowHeight(30);
        jScrollPane2.setViewportView(jTable2);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Missed Study Task");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(taskField, javax.swing.GroupLayout.PREFERRED_SIZE, 954, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(59, 59, 59)))
                                                .addGap(53, 53, 53))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(49, 49, 49)
                                                                .addComponent(dltButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(addButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(addButton2, javax.swing.GroupLayout.Alignment.TRAILING))))
                                                .addGap(36, 36, 36)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(43, 43, 43))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addButton, addButton1, addButton2, dltButton});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel3, jLabel4});

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addButton)
                                        .addComponent(taskField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addComponent(dltButton)
                                                .addGap(99, 99, 99)
                                                .addComponent(addButton1)
                                                .addGap(83, 83, 83)
                                                .addComponent(addButton2))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addButton, addButton1, addButton2, dltButton, jLabel2, taskField});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel3, jLabel4});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void taskFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        try {
            FileWriter fileWriter = new FileWriter("task.txt", true);
            fileWriter.write(taskField.getText() + "\n");
            JOptionPane.showMessageDialog(null, "Task added successfully!");
            fileWriter.close();
            taskField.setText(null);
            setDataTable("task.txt", jTable1);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(ToDoApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void addButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        dltButtonActionPerformed(evt);

    }

    private void addButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int r = jTable1.getSelectedRow();
        if (jTable1.getSelectedRowCount() == 1) {

            FileWriter fileWriter;
            try {
                fileWriter = new FileWriter("missedtask.txt", true);

                fileWriter.write((String) jTable1.getValueAt(r, 0) + "\n");

                fileWriter.close();
                setDataTable("missedtask.txt", jTable2);
            } catch (Exception ex) {
                //   JOptionPane.showMessageDialog(null, ex.getMessage());
            }

            model.removeRow(r);
            JOptionPane.showMessageDialog(null, "Task deleted");
        } else {
            if (jTable1.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Table is empty!");
            } else {
                JOptionPane.showMessageDialog(null, "Select a single row for delete!");
            }
        }
        int total = jTable1.getRowCount();

        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter("task.txt");

            for (int i = 0; i < total; i++) {
                try {
                    String task = (String) jTable1.getValueAt(i, 0);
                    fileWriter.write(task + "\n");

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
            fileWriter.close();
        } catch (Exception ex) {
//            Logger.getLogger(ToDoApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void dltButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int r = jTable1.getSelectedRow();
        if (jTable1.getSelectedRowCount() == 1) {
            model.removeRow(r);
            JOptionPane.showMessageDialog(null, "Task deleted");
        } else {
            if (jTable1.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Table is empty!");
            } else {
                JOptionPane.showMessageDialog(null, "Select a single row for delete!");
            }
        }
        int total = jTable1.getRowCount();

        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter("task.txt");

            for (int i = 0; i < total; i++) {
                try {
                    String task = (String) jTable1.getValueAt(i, 0);
                    fileWriter.write(task + "\n");

                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                } catch (IOException ex) {
                    Logger.getLogger(ToDoApp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(ToDoApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void todolist() {
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
            java.util.logging.Logger.getLogger(ToDoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ToDoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ToDoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ToDoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ToDoApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton addButton;
    private javax.swing.JButton addButton1;
    private javax.swing.JButton addButton2;
    private javax.swing.JButton dltButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField taskField;
    // End of variables declaration
}