package clas;

import java.awt.event.KeyEvent;
import java.io.IOException;

public class Frame extends javax.swing.JFrame {

 public static boolean isWpressed = false;
 public static boolean isApressed = false;
 public static boolean isSpressed = false;
 public static boolean isDpressed = false;

 public Frame() throws IOException {
  Init.Init();
  initComponents();
  InitLast();
 }

 private void InitLast() {
  addKeyListener(new java.awt.event.KeyAdapter() {
   public void keyPressed(KeyEvent evt) {
    formKeyPressed(evt);
   }

   public void keyReleased(KeyEvent evt) {
    formKeyReleased(evt);
   }
  });
 }
 // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
 private void initComponents() {

  OutPane = new javax.swing.JPanel();
  Out = new javax.swing.JLabel();

  setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
  setMinimumSize(new java.awt.Dimension(300, 300));

  OutPane.setBackground(new java.awt.Color(0, 0, 0));
  OutPane.setMaximumSize(new java.awt.Dimension(99999, 99999));
  OutPane.setMinimumSize(new java.awt.Dimension(300, 300));
  OutPane.setPreferredSize(new java.awt.Dimension(1200, 700));

  Out.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
  Out.setMaximumSize(new java.awt.Dimension(99999, 99999));
  Out.setMinimumSize(new java.awt.Dimension(300, 300));
  Out.setPreferredSize(new java.awt.Dimension(1200, 700));

  javax.swing.GroupLayout OutPaneLayout = new javax.swing.GroupLayout(OutPane);
  OutPane.setLayout(OutPaneLayout);
  OutPaneLayout.setHorizontalGroup(
   OutPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addComponent(Out, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
  );
  OutPaneLayout.setVerticalGroup(
   OutPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addComponent(Out, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
  );

  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
  getContentPane().setLayout(layout);
  layout.setHorizontalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(layout.createSequentialGroup()
    .addComponent(OutPane, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
    .addGap(0, 0, 0))
  );
  layout.setVerticalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(layout.createSequentialGroup()
    .addComponent(OutPane, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
    .addGap(0, 0, 0))
  );

  pack();
  setLocationRelativeTo(null);
 }// </editor-fold>//GEN-END:initComponents

 private void formKeyPressed(KeyEvent evt) {
  switch (evt.getKeyCode()) {
   case 87:
    isWpressed = true;
    break;
   case 65:
    isApressed = true;
    break;
   case 83:
    isSpressed = true;
    break;
   case 68:
    isDpressed = true;
    break;
  }
 }

 private void formKeyReleased(java.awt.event.KeyEvent evt) {
  switch (evt.getKeyCode()) {
   case 87:
    isWpressed = false;
    break;
   case 65:
    isApressed = false;
    break;
   case 83:
    isSpressed = false;
    break;
   case 68:
    isDpressed = false;
    break;
  }
 }

 public static void main(String args[]) throws IOException {
  new Frame().setVisible(true);
  new Thrd().start();
 }

 // Variables declaration - do not modify//GEN-BEGIN:variables
 public static javax.swing.JLabel Out;
 public static javax.swing.JPanel OutPane;
 // End of variables declaration//GEN-END:variables

}
