package clas;
import static clas.Init.GameScreen;
import static clas.Init.ScreenBounds;
import static clas.Init.ScreenPos;
import static clas.Init.StepLength;
import java.io.IOException;

public class Frame extends javax.swing.JFrame{

 public Frame() throws IOException{
  Init.Init();
  initComponents();
  InitLast();
 }

 private void InitLast(){
  addKeyListener(new java.awt.event.KeyAdapter(){
   public void keyPressed(java.awt.event.KeyEvent evt){
	formKeyPressed(evt);
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

 private void formKeyPressed(java.awt.event.KeyEvent evt){
  switch(evt.getKeyCode()){
   case 87:
	if(ScreenPos[1] - StepLength >= 0)ScreenPos[1] -= StepLength;
	break;
   case 65:
	if(ScreenPos[0] - StepLength >= 0)ScreenPos[0] -= StepLength;
	break;
   case 83:
	if(ScreenPos[1] + StepLength <= GameScreen[1] - ScreenBounds[1])ScreenPos[1] += StepLength;
	break;
   case 68:
	if(ScreenPos[0] + StepLength <= GameScreen[0] - ScreenBounds[0])ScreenPos[0] += StepLength;
	break;
   default:
	System.out.println(evt.getKeyCode() + " | " + evt.getKeyChar());
	break;
  }
  // System.out.println(evt);  System.out.println(KeyEvent.VK_W);
 }

 public static void main(String args[]) throws IOException{
  new Frame().setVisible(true);
  new Thrd().start();
 }

 // Variables declaration - do not modify//GEN-BEGIN:variables
 public static javax.swing.JLabel Out;
 public static javax.swing.JPanel OutPane;
 // End of variables declaration//GEN-END:variables

}
