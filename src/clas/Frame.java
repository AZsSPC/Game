package clas;

import java.io.IOException;

public class Frame extends javax.swing.JFrame {

 public Frame() throws IOException {
  Init.Init();
  initComponents();
 }

 // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
 private void initComponents() {

  OutPane = new javax.swing.JPanel();
  Out = new javax.swing.JLabel();

  setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
  setMaximumSize(new java.awt.Dimension(4000, 4000));
  setMinimumSize(new java.awt.Dimension(300, 300));

  OutPane.setBackground(new java.awt.Color(0, 0, 0));
  OutPane.setMaximumSize(new java.awt.Dimension(4000, 4000));
  OutPane.setMinimumSize(new java.awt.Dimension(300, 300));
  OutPane.setPreferredSize(new java.awt.Dimension(1200, 700));

  Out.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
  Out.setMaximumSize(new java.awt.Dimension(4000, 4000));
  Out.setMinimumSize(new java.awt.Dimension(300, 300));
  Out.setPreferredSize(new java.awt.Dimension(1200, 700));

  javax.swing.GroupLayout OutPaneLayout = new javax.swing.GroupLayout(OutPane);
  OutPane.setLayout(OutPaneLayout);
  OutPaneLayout.setHorizontalGroup(
   OutPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addComponent(Out, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
  );
  OutPaneLayout.setVerticalGroup(
   OutPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addComponent(Out, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
  );

  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
  getContentPane().setLayout(layout);
  layout.setHorizontalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addComponent(OutPane, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
  );
  layout.setVerticalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addComponent(OutPane, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
  );

  pack();
  setLocationRelativeTo(null);
 }// </editor-fold>//GEN-END:initComponents

 public static void main(String args[]) throws IOException {
  new Frame().setVisible(true);
  new Thrd().start();

 }

 // Variables declaration - do not modify//GEN-BEGIN:variables
 public static javax.swing.JLabel Out;
 public static javax.swing.JPanel OutPane;
 // End of variables declaration//GEN-END:variables

}
