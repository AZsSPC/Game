package clas;
import java.io.IOException;
import static rendering.Rendering.RenderAll;
import static rendering.Rendering.RenderGround;

public class Thrd extends Thread{

 @Override
 public void run(){
  try{
   RenderGround();
   while(true){
	Sleep(10);
	try{
	 RenderAll();
	}catch(IOException ex){
	}
   }
  }catch(IOException ex){
  }
 }

 //
 private void Sleep(int l){
  try{
   Thread.sleep(l);
  }catch(InterruptedException i){
  }
 }

}
