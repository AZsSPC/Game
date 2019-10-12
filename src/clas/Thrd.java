package clas;
import static clas.Frame.isApressed;
import static clas.Frame.isDpressed;
import static clas.Frame.isSpressed;
import static clas.Frame.isWpressed;
import static clas.Init.GameScreen;
import static clas.Init.ScreenBounds;
import static clas.Init.ScreenPos;
import static clas.Init.StepLength;
import static rendering.Rendering.RenderAll2;

public class Thrd extends Thread{

 @Override
 public void run(){
  while(true){
   Sleep(10);
   if(ScreenPos[1] - StepLength >= 0 && isWpressed)ScreenPos[1] -= StepLength;
   if(ScreenPos[0] - StepLength >= 0 && isApressed)ScreenPos[0] -= StepLength;
   if(ScreenPos[1] + StepLength <= GameScreen[1] - ScreenBounds[1] && isSpressed)ScreenPos[1] += StepLength;
   if(ScreenPos[0] + StepLength <= GameScreen[0] - ScreenBounds[0] && isDpressed)ScreenPos[0] += StepLength;
   RenderAll2();
  }
 }

 private void Sleep(int l){
  try{
   Thread.sleep(l);
  }catch(InterruptedException i){
  }
 }

}
