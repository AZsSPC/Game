package clas;

import static clas.Frame.isApressed;
import static clas.Frame.isDpressed;
import static clas.Frame.isSpressed;
import static clas.Frame.isWpressed;
import static clas.Init.GameScreen;
import static clas.Init.ScreenBounds;
import static clas.Init.ScreenPos;
import static clas.Init.StepLength;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static rendering.Rendering.RenderAll;
import static rendering.Rendering.RenderGround;

public class Thrd extends Thread {

 @Override
 public void run() {
  
   RenderGround();
  
  while (true) {
   Sleep(10);
   
if (ScreenPos[1] - StepLength >= 0 && isWpressed)ScreenPos[1] -= StepLength;
if (ScreenPos[0] - StepLength >= 0 && isApressed)ScreenPos[0] -= StepLength;
if (ScreenPos[1] + StepLength <= GameScreen[1] - ScreenBounds[1] && isSpressed)ScreenPos[1] += StepLength;
if (ScreenPos[0] + StepLength <= GameScreen[0] - ScreenBounds[0] && isDpressed)ScreenPos[0] += StepLength;    
 
    RenderAll();

  }
 }

 private void Sleep(int l) {
  try {
   Thread.sleep(l);
  } catch (InterruptedException i) {
  }
 }

}
