package clas;
import entities.Uat;
import static entities.Uat.GetTexture;
import static entities.Uat.IW;
import java.awt.image.BufferedImage;
import static rendering.Rendering.FirstRender;

public class Init{

 public static BufferedImage ScreenIcon;
 public static final int Cof = 1;
 public static final int ImageS = 32 * (Cof + 1);
 public static int Enum = 0;
 public static final int[] GameScreen = {ImageS * 20, ImageS * 15};
 public static String[][] GamePlace = new String[GameScreen[0] / ImageS][GameScreen[1] / ImageS];
 public static Object[][] UatLit = new Object[100][4];

 public static void Init(){
  InitUat();
  FirstRender();
  SetUat();
 }

 private static void InitUat(){
  new Uat("Player", Enum, "azg:player", IW("player/R_00_00"));
  new Uat("Stone plate", Enum, "azg:stone_plate", IW("plates/stone_plate_0"));
  new Uat("Grass plate", Enum, "azg:grass_plate", IW("plates/grass_plate_0"));
  new Uat("Wooden plate", Enum, "azg:wooden_plate", IW("plates/wooden_plate_0"));
 }

 private static void SetUat(){
  for(int x = 0; x < GameScreen[0] / ImageS; x++){
   for(int y = 0; y < GameScreen[1] / ImageS; y++){
	GamePlace[x][y] = GetTexture((int)(Math.random() * 3 + 1));
   }
  }
 }

 public static String InString(String text, String start, String finish){
  String ret = text.substring(text.lastIndexOf(start));
  ret = ret.substring(0, ret.indexOf(finish));
  return ret;
 }

}
