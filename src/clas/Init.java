package clas;
import entities.Uat;
import static entities.Uat.GetTexture;
import static entities.Uat.IW;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Init{

 public static BufferedImage AllGround;
 public static int Enum = 0;
 public static int StepLength = 15;
 public static int Cof = 0;
 public static int ImageS = 32 * (Cof + 1);
 public static Object[][] UatBaseList = new Object[100][4];
 public static Object[][] UatInGameList = new Object[100][4];
 public static int[] ScreenBounds = {23 * (32), 23 * (32)};
 public static int[] ScreenPos = {1 * StepLength, 1 * StepLength};
 public static int[] GameScreen = {ImageS * 40, ImageS * 40};
 public static String[][] GamePlace = new String[GameScreen[0] / ImageS][GameScreen[1] / ImageS];

 public static void Init() throws IOException{
  InitUat();
  SetPlace();
 }

 private static void InitUat(){
  //new Uat("Player", Enum, "azg:player", IW("player/R_00_00"));
  Uat uat = new Uat("Brick", Enum, "azg:plate:brick", IW("plates/brick"));
  uat = new Uat("Dirt brick", Enum, "azg:plate:brick_dirt", IW("plates/brick_dirt"));
  uat = new Uat("Stone brick", Enum, "azg:plate:brick_stone", IW("plates/brick_stone"));
  uat = new Uat("Water", Enum, "azg:plate:water", IW("plates/water"));
  uat = new Uat("Planks", Enum, "azg:plate:planks", IW("plates/planks"));
  /*the last texture is NULL*/
  uat = new Uat("NULL", Enum, "azg:null", IW("null"));
 }

 private static void SetPlace(){
  for(int x = 0; x < GameScreen[0] / ImageS; x++){
   for(int y = 0; y < GameScreen[1] / ImageS; y++){
	GamePlace[x][y] = GetTexture((int)(Math.random() * (Enum - 1)));
   }
  }
 }

 public static String InString(String text, String start, String finish){
  String ret = text.substring(text.lastIndexOf(start));
  ret = ret.substring(0, ret.indexOf(finish));
  return ret;
 }

}
