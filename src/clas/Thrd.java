package clas;
import static clas.Frame.isApressed;
import static clas.Frame.isDpressed;
import static clas.Frame.isSpressed;
import static clas.Frame.isWpressed;
import static clas.Init.GamePlace;
import static clas.Init.ImageS;
import static clas.Init.InitVar;
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
   if(ScreenPos[1] + StepLength <= GamePlace.length * ImageS - ScreenBounds[1] && isSpressed)ScreenPos[1] += StepLength;
   if(ScreenPos[0] + StepLength <= GamePlace.length * ImageS - ScreenBounds[0] && isDpressed)ScreenPos[0] += StepLength;
   InitVar(0);
   /* if(isWpressed)Cof++;
    if(isSpressed)Cof--;
    ImageS = 32 * (Cof + 1);*/
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
