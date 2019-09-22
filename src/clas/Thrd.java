package clas;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static rendering.Rendering.RenderAll;

public class Thrd extends Thread {

 @Override
 public void run() {
  Sleep(200);
  try {
   RenderAll();
  } catch (IOException ex) {
   Logger.getLogger(Thrd.class.getName()).log(Level.SEVERE, null, ex);
  }
 }

 //
 private void Sleep(int l) {
  try {
   Thread.sleep(l);
  } catch (InterruptedException i) {
  }
 }
}
